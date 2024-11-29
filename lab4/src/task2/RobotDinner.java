package task2;

public class RobotDinner implements Dineable {
    private static int totalRobotsServed = 0;

    @Override
    public void serveDinner(String carId) {
        totalRobotsServed++;
        System.out.println("Serving dinner to robots in car " + carId + ".");
    }

    public static int getTotalRobotsServed() {
        return totalRobotsServed;
    }
}
