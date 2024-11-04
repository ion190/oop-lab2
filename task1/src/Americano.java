public class Americano extends Coffee {
    protected int mlOfWater;
    protected final String coffeeName = "Americano";

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super(coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void printCoffeeDetails() {
        System.out.println("Making " + this.coffeeName);
        super.printCoffeeDetails();
        System.out.println("Ml of water: " + this.mlOfWater);
    }
}
