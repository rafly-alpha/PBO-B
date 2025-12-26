public class Hewan extends MakhlukHidup {

    public Hewan(String nama) {
        super(nama);
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Hewan berkembang biak dengan bertelur atau melahirkan.");
    }

    @Override
    public void bernapas() {
        System.out.println("Hewan bernapas dengan paru-paru atau insang.");
    }
}
