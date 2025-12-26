public class Tumbuhan extends MakhlukHidup {

    public Tumbuhan(String nama) {
        super(nama);
    }

    @Override
    public void berkembangBiak() {
        System.out.println("Tumbuhan berkembang biak dengan biji atau spora.");
    }

    @Override
    public void bernapas() {
        System.out.println("Tumbuhan bernapas melalui stomata.");
    }
}
