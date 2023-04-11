/**
 * Лучник
 */
public class Archer extends Warrior{//если использовать <Throwing>, как в этом случае, то в 10 строке
//   Throwing уже не нужно. используй строку 14



    public Archer(String name, int hp, Weapon weapon, Security shield) {
        super(name, hp, weapon, shield);
    }

    public  int renge(){
        return rnd.nextInt(((Throwing)this.weapon).range) +1;//(Throwing)this.weapon) -
        //означает, что оружие переводится в класс метательные. А у класса метательные
        //есть поле range.
//        return rnd.nextInt(this.weapon.range) +1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
