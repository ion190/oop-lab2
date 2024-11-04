class Cappuccino extends Coffee {
    protected int mlOfMilk;
    protected final String coffee = "Cappuccino";

    Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
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
        printCoffeeDetails(this.coffee);
    }
    public void printCoffeeDetails(String coffeeName) {
        System.out.println(coffeeName);
        super.printCoffeeDetails();
        System.out.println("Ml of milk: " + this.mlOfMilk);
    }

    public Cappuccino makeCappuccino() {
        return makeCappuccino(this.coffee);
    }

    public Cappuccino makeCappuccino(String coffeeName) {
        System.out.println("Making " + coffeeName);
        System.out.println("Intensity set to " + this.coffeeIntensity);
        System.out.println("Adding " + this.mlOfMilk + " mls of milk");
        return this;
    }
}
