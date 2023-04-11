/**
 * метотельное оружие
 */
public abstract class Throwing implements Weapon{
    int range;//радиус поражения

    public Throwing(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }


    @Override
    public String toString() {
        return String.format("Метательное. Урон: %d, Радиус поражения %d", damage(), getRange());
    }
}
