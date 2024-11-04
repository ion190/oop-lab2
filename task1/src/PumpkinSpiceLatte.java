public class PumpkinSpiceLatte extends Cappuccino {
    protected int mgOfPumpkinSpice;
    protected final String name = "Pumpkin Spice Latte";

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
        System.out.println(this.name);
        super.printCoffeeDetails();
        System.out.println("Mg of pumpkin spice: " + this.mgOfPumpkinSpice);
    }

    public PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("Making " + this.name);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + this.mgOfPumpkinSpice + " mls of pumpkin spice");
        return this;
    }
}
