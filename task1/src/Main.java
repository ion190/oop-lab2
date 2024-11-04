public class Main {
    public static void main(String[] args) {
        Americano americanoCoffee = new Americano(Intensity.LIGHT, 200);
        Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 150);

        americanoCoffee.printCoffeeDetails();

        cappuccino.makeCappuccino();

        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.LIGHT, 100);
        syrupCappuccino.printCoffeeDetails();

        syrupCappuccino.makeSyrupCappuccino();
    }
}