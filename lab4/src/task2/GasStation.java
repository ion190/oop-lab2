package task2;

public class GasStation implements Refuelable {
    private static int gasCarsServed = 0;

    @Override
    public void refuel(String carId) {
        System.out.println("Refueling gas car " + carId + ".");
        gasCarsServed++;
    }

    public static int getGasCarsServed() {
        return gasCarsServed;
    }
}