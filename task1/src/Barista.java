import java.util.List;

public class Barista {
    public void prepareCoffees(List<Coffee> coffeeOrders) {
        for (Coffee coffee : coffeeOrders) {
            coffee.printCoffeeDetails();

            // Check the type of coffee and call the appropriate make method
            if (coffee instanceof Americano) {
                ((Americano) coffee).makeAmericano();
            } else if (coffee instanceof Cappuccino && !(coffee instanceof PumpkinSpiceLatte) && !(coffee instanceof SyrupCappuccino)) {
                ((Cappuccino) coffee).makeCappuccino();
            } else if (coffee instanceof PumpkinSpiceLatte) {
                ((PumpkinSpiceLatte) coffee).makePumpkinSpiceLatte();
            } else if (coffee instanceof SyrupCappuccino) {
                ((SyrupCappuccino) coffee).makeSyrupCappuccino();
            }

            System.out.println();
        }
    }
}