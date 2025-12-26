import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {

        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();

        // Data kendaraan
        Mobil mobil = new Mobil("Toyota", "Avanza", 2022, 4);
        Motor motor = new Motor("Honda", "Vario", 2021, 2);
        Sepeda sepeda = new Sepeda("Polygon", "Xtrada", 2020, "Balap");

        daftarKendaraan.add(mobil);
        daftarKendaraan.add(motor);
        daftarKendaraan.add(sepeda);

        // Data penyewa
        daftarPenyewa.add(new Penyewa("Rafly", mobil));
        daftarPenyewa.add(new Penyewa("Andi", sepeda));

        // Tampilkan kendaraan tersedia
        System.out.println("=== DAFTAR KENDARAAN TERSEDIA ===");
        for (Kendaraan k : daftarKendaraan) {
            System.out.println(k.getInfo());
        }

        // Tampilkan data penyewa
        System.out.println("\n=== DAFTAR PENYEWA ===");
        for (Penyewa p : daftarPenyewa) {
            System.out.println(p.getInfo());
            System.out.println("----------------------");
        }
    }
}
