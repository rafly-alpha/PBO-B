public class Manusia extends MakhlukHidup {

    public Manusia(String nama) {
        super(nama);
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Manusia berkembang biak dengan melahirkan.");
    }

    @Override
    public void bernapas() {
        System.out.println("Manusia bernapas menggunakan paru-paru.");
    }
}
