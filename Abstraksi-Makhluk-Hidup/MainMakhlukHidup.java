public class MainMakhlukHidup {
    public static void main(String[] args) {

        MakhlukHidup manusia = new Manusia("Rafly");
        MakhlukHidup hewan = new Hewan("Kucing");
        MakhlukHidup tumbuhan = new Tumbuhan("Pohon Mangga");

        manusia.info();
        manusia.bernapas();
        manusia.berkembangBiak();

        System.out.println();

        hewan.info();
        hewan.bernapas();
        hewan.berkembangBiak();

        System.out.println();

        tumbuhan.info();
        tumbuhan.bernapas();
        tumbuhan.berkembangBiak();
    }
}
