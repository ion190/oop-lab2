package task2;

public class RobotDinner implements Dineable {
    private static int robotsServed = 0;

    @Override
    public void serveDinner(String carId) {
        System.out.println("Serving dinner to robots in car " + carId + ".");
        robotsServed++;
    }

    public static int getRobotsServed() {
        return robotsServed;
    }
}
