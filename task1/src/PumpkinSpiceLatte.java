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

    public void printCoffeeDetails() {
        System.out.println("Making " + this.name);
        super.printCoffeeDetails();
        System.out.println("Mg of pumpkin spice: " + this.mgOfPumpkinSpice);
    }
}
