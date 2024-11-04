public class SyrupCappuccino extends Cappuccino {
    protected SyrupType syrup;
    protected final String coffee = "SyrupCappuccino";

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, mlOfMilk);
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override
    public String getCoffee() {
        return coffee;
    }
}
