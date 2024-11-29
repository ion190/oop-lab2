package task2;

public class ElectricStation implements Refuelable {
    private static int totalElectricCarsRefueled = 0;

    @Override
    public void refuel(String carId) {
        totalElectricCarsRefueled++;
        System.out.println("Refueling electric car " + carId + ".");
    }

    public static int getTotalElectricCarsRefueled() {
        return totalElectricCarsRefueled;
    }
}