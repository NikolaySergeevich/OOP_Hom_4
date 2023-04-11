public class ShieldCircle extends Shield{
    public ShieldCircle(int massa) {
        super(massa);

    }

    @Override
    public int strength() {
        return 20;
    }

    /**
     * Чем ниже вес, тем больше вероятность того, что щитом успеют воспольз.
     * @return
     */
    @Override
    public int getProbabilityUsdShield() {
        if (this.getMassa() <= 3 && this.getMassa()>0){
            return  9;
        }
        if (this.getMassa() == 4){
            return  8;
        }
        if (this.getMassa() == 5 || this.getMassa() == 6){
            return  7;
        }
        if (this.getMassa() >= 7 && this.getMassa() <= 9){
            return  6;
        }
        if (this.getMassa() >= 10){
            return  5;
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("Круглый щит - %s", super.toString());
    }
}
