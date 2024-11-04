public class PumpkinSpiceLatte extends Cappuccino {
    protected int mgOfPumpkinSpice;
    protected final String name = "PumpkinSpiceLatte";

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity, mlOfMilk);
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public String getName() {
        return name;
    }
}
