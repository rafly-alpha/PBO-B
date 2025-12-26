import java.sql.*;
import java.util.ArrayList;

public class BukuDAO {

    public static void insert(Buku buku) {
        String sql = "INSERT INTO buku (judul, pengarang, penerbit, tahun) VALUES (?, ?, ?, ?)";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, buku.getJudul());
            ps.setString(2, buku.getPengarang());
            ps.setString(3, buku.getPenerbit());
            ps.setInt(4, buku.getTahun());
            ps.executeUpdate();

            System.out.println("Buku berhasil disimpan!");

        } catch (SQLException e) {
            System.out.println("Gagal menyimpan buku: " + e.getMessage());
        }
    }

    public static ArrayList<Buku> getAll() {
        ArrayList<Buku> list = new ArrayList<>();
        String sql = "SELECT * FROM buku";
        try (Connection conn = DbConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Buku(
                    rs.getInt("id_buku"),
                    rs.getString("judul"),
                    rs.getString("pengarang"),
                    rs.getString("penerbit"),
                    rs.getInt("tahun")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return list;
    }

    public static void update(Buku buku) {
        String sql = "UPDATE buku SET judul=?, pengarang=?, penerbit=?, tahun=? WHERE id_buku=?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, buku.getJudul());
            ps.setString(2, buku.getPengarang());
            ps.setString(3, buku.getPenerbit());
            ps.setInt(4, buku.getTahun());
            ps.setInt(5, buku.getId());
            ps.executeUpdate();

            System.out.println("Buku berhasil diubah!");

        } catch (SQLException e) {
            System.out.println("Gagal mengubah buku: " + e.getMessage());
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM buku WHERE id_buku=?";
        try (Connection conn = DbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Buku berhasil dihapus!");

        } catch (SQLException e) {
            System.out.println("Gagal menghapus buku: " + e.getMessage());
        }
    }
}
