package task2;

public class ElectricStation implements Refuelable {
    private static int electricCarsServed = 0;

    @Override
    public void refuel(String carId) {
        System.out.println("Refueling electric car " + carId + ".");
        electricCarsServed++;
    }

    public static int getElectricCarsServed() {
        return electricCarsServed;
    }
}
