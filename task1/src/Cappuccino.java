public class Cappuccino extends Coffee {
    protected int mlOfMilk;
    protected final String coffee = "Cappuccino";

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super(coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    public String getCoffee() {
        return coffee;
    }

    public void printCoffeeDetails() {
        System.out.println(this.coffee);
        super.printCoffeeDetails();
        System.out.println("Ml of milk: " + this.mlOfMilk);
    }

    public Cappuccino makeCappuccino() {
        System.out.println("Making " + this.coffee);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }
}
