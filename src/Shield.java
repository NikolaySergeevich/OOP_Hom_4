import java.util.Random;

/**
 * Щит
 */
public abstract class Shield implements Security{
    int massa;// в будущем будет влиять на скорость передвижения героя
    int proch;
    protected static Random rnd = new Random();

    public Shield(int massa) {
        this.proch = this.strength();
        this.massa = massa;
    }


    public int getMassa() {
        return massa;
    }
    public void reduceSh(int damage){
        this.proch-=damage;
        if (this.proch<0){
            this.proch = 0;
        }
    }



    @Override
    public String toString() {

        return String.format("вес: %dкг.; прочность: %dед.; вероятность применения = %d процетов", this.massa, this.proch, getProbabilityUsdShield()*10);
    }
}
