/**
 * Abstract class Animal
 * Menyimpan perilaku dan atribut umum semua hewan
 */
public abstract class Animal {

    protected int age;
    protected boolean alive;

    public Animal() {
        age = 0;
        alive = true;
    }

    /**
     * Method abstrak yang harus diimplementasikan
     * oleh setiap jenis hewan
     */
    public abstract void act();

    protected void growOlder() {
        age++;
        if (age > getMaxAge()) {
            alive = false;
        }
    }

    /**
     * Setiap hewan memiliki batas usia berbeda
     */
    protected abstract int getMaxAge();

    public boolean isAlive() {
        return alive;
    }
}
