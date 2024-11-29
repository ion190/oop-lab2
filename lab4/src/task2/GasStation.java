package task2;

public class GasStation implements Refuelable {
    private static int totalGasCarsRefueled = 0;

    @Override
    public void refuel(String carId) {
        totalGasCarsRefueled++;
        System.out.println("Refueling gas car " + carId + ".");
    }

    public static int getTotalGasCarsRefueled() {
        return totalGasCarsRefueled;
    }
}