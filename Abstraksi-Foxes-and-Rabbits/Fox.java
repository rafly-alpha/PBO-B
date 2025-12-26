/**
 * Fox adalah subclass dari Animal
 */
public class Fox extends Animal {

    @Override
    public void act() {
        growOlder();
        if (alive) {
            hunt();
        }
    }

    private void hunt() {
        System.out.println("Fox berburu rabbit.");
    }

    @Override
    protected int getMaxAge() {
        return 10;
    }
}
