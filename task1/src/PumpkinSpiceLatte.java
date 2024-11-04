class PumpkinSpiceLatte extends Cappuccino {
    protected int mgOfPumpkinSpice;
    protected final String latteName = "Pumpkin Spice Latte";

    PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public String getLatteName() {
        return latteName;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails(this.latteName);
        System.out.println("Mg of pumpkin spice: " + this.getMgOfPumpkinSpice());
    }

    public PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("Making " + this.latteName);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + this.mgOfPumpkinSpice + " mls of pumpkin spice");
        return this;
    }
}
