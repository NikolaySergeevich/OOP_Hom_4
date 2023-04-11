public class Knife implements Weapon {
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Нож (макс. урон - %d)",this.damage());
    }
}
