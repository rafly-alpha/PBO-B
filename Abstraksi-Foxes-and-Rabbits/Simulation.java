/**
 * Simulation class
 * Menjalankan simulasi Foxes and Rabbits
 */
public class Simulation {

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Fox();
        animals[1] = new Rabbit();

        for (int step = 1; step <= 3; step++) {
            System.out.println("Step ke-" + step);
            for (Animal a : animals) {
                if (a.isAlive()) {
                    a.act();
                } else {
                    System.out.println("Hewan sudah mati.");
                }
            }
            System.out.println();
        }
    }
}
