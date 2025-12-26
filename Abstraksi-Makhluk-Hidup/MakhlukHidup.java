public abstract class MakhlukHidup {
    protected String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public abstract void berkembangBiak();
    public abstract void bernapas();

    public void info() {
        System.out.println("Nama: " + nama);
    }
}
