public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;

    public Buku(int id, String judul, String pengarang, String penerbit, int tahun) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this(0, judul, pengarang, penerbit, tahun);
    }

    public int getId() { return id; }
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public String getPenerbit() { return penerbit; }
    public int getTahun() { return tahun; }

    @Override
    public String toString() {
        return id + ". " + judul + " | " + pengarang + " | " + penerbit + " | " + tahun;
    }
}

