/**
 * Rabbit adalah subclass dari Animal
 */
public class Rabbit extends Animal {

    @Override
    public void act() {
        growOlder();
        if (alive) {
            eatGrass();
        }
    }

    private void eatGrass() {
        System.out.println("Rabbit makan rumput dan berkembang biak.");
    }

    @Override
    protected int getMaxAge() {
        return 5;
    }
}
