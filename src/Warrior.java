import java.util.Random;

/**
 * Воин
 */
public abstract class Warrior<T extends  Weapon, E extends Security> extends Personage {//T extends  Weapon означает, что что экземпляр
    //Warrior сможет иметь только наследников Weapon там, где будет использоваться в качестве типа T.
    protected T weapon;//Воин имеет оружие
    protected E shield;//Воин имеет щит
    protected static Random rnd = new Random();
    public Warrior(String name, int hp, T weapon, E shield) {
        super(name, hp);
        this.weapon = weapon;
        this.shield = shield;
    }

    /**
     * Метод определяет сколько урона нанесётся.
     */
    public int harm() {
        boolean isHit = rnd.nextBoolean();//будет означать попал по пративнику или нет.
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(4,weapon.damage()+1);//если попал по противнику
            //то определяем рандомом величину урона(от 0 до макс.возможного урона,
            // которое может нанести оружие(weapon.damage()+1))
        }
        return damage;
    }
    public int harmForShiel(){
        return  rnd.nextInt(4, 7);
    }
    public boolean YesOrNoProtection() {
        int probabilityUsdShield = shield.getProbabilityUsdShield();
        int flag = rnd.nextInt(0,10);
        if (probabilityUsdShield == 9){
            if (flag <=9){
                return  true;
            }
        }
        if (probabilityUsdShield == 8){
            if (flag <=8){
                return  true;
            }
        }
        if (probabilityUsdShield == 7){
            if (flag <=7){
                return  true;
            }
        }
        if (probabilityUsdShield == 6){
            if (flag <=6){
                return  true;
            }
        }
        if (probabilityUsdShield == 5){
            if (flag <=5){
                return  true;
            }
        }
        if (probabilityUsdShield == 4) {
            if (flag <= 4) {
                return true;
            }
        }
        return false;
    }




    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\thp: %d", getHp()))
                .append(String.format("\n\tВооружён: %s", this.weapon))
                .append(String.format("\n\tЗащита: %s",this.shield));
        return res.toString();

    }
}
