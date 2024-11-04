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

    public void printCoffeeDetails() {
        System.out.println(this.coffee);
        super.printCoffeeDetails();
        System.out.println("Syrup type: " + this.syrup);
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("Making " + this.coffee);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        System.out.println("Adding " + this.syrup);
        return this;
    }
}
