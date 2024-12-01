class SyrupCappuccino extends Cappuccino {
    protected SyrupType syrup;
    protected final String syrupCappuccinoName = "SyrupCappuccino";

    SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super(coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public String getSyrupCappuccinoName() {
        return this.syrupCappuccinoName;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails(this.syrupCappuccinoName);
        System.out.println("Syrup type: " + this.syrup);
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("Making " + this.syrupCappuccinoName);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + this.syrup + " syrup");
        return this;
    }
}
