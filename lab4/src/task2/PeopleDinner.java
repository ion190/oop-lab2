package task2;

public class PeopleDinner implements Dineable {
    private static int peopleServed = 0;

    @Override
    public void serveDinner(String carId) {
        System.out.println("Serving dinner to people in car " + carId + ".");
        peopleServed++;
    }

    public static int getPeopleServed() {
        return peopleServed;
    }
}