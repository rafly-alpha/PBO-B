import java.util.ArrayList;
import java.util.Scanner;

public class PerpustakaanApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Pengarang: ");
                    String pengarang = input.nextLine();
                    System.out.print("Penerbit: ");
                    String penerbit = input.nextLine();
                    System.out.print("Tahun: ");
                    int tahun = input.nextInt();
                    BukuDAO.insert(new Buku(judul, pengarang, penerbit, tahun));
                    break;

                case 2:
                    ArrayList<Buku> daftar = BukuDAO.getAll();
                    daftar.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID buku yang akan diubah: ");
                    int idU = input.nextInt();
                    input.nextLine();
                    System.out.print("Judul baru: ");
                    String judulU = input.nextLine();
                    System.out.print("Pengarang baru: ");
                    String pengarangU = input.nextLine();
                    System.out.print("Penerbit baru: ");
                    String penerbitU = input.nextLine();
                    System.out.print("Tahun baru: ");
                    int tahunU = input.nextInt();
                    BukuDAO.update(new Buku(idU, judulU, pengarangU, penerbitU, tahunU));
                    break;

                case 4:
                    System.out.print("ID buku yang akan dihapus: ");
                    int idH = input.nextInt();
                    BukuDAO.delete(idH);
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}
