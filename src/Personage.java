public abstract class Personage {
    private  String name;
    private int hp;

    /**
     * метод указывает жив ли персонаж
     * @return
     */
    public boolean isAlive(){
        return hp>0;
    }

    public Personage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * метод получения урона. Будет актуален для всех наследников
     * @param damage
     */
    public void reduce(int damage){
        this.hp-=damage;
        if (this.hp<0){
            this.hp = 0;
        }
    }
}
