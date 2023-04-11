/**
 * каплевидный щит
 */
public class ShieldDrop extends Shield {
    public ShieldDrop(int massa) {
        super(massa);
    }

    @Override
    public int strength() {
        return 25;
    }

    @Override
    public int getProbabilityUsdShield() {
        if (this.getMassa() <= 3 && this.getMassa()>0){
            return  8;
        }
        if (this.getMassa() == 4){
            return  7;
        }
        if (this.getMassa() == 5 || this.getMassa() == 6){
            return  6;
        }
        if (this.getMassa() >= 7 && this.getMassa() <= 9){
            return  5;
        }
        if (this.getMassa() >= 10){
            return  4;
        }

        return 0;
    }



    @Override
    public String toString() {
        return String.format("Каплевидынй щит - %s",super.toString());
    }
}
