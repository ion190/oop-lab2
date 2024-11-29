package task3;
import java.util.LinkedList;
import java.util.Queue;
import task2.Refuelable;
import task2.Dineable;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private Queue<Car> queue;

    // Constructor with dependency injection
    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }

    // Add a car to the queue
    public void addCar(Car car) {
        queue.add(car);
        System.out.println("Added car: " + car.getId());
    }

    // Serve cars in the queue
    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.poll(); // Retrieve and remove the head of the queue
            System.out.println("Processing car: " + car.getId());

            // Serve dinner if the car has IS_DINING set to true
            if (car.isDining()) {
                if (car.getPassengerType().equals("PEOPLE")) {
                    diningService.serveDinner(car.getId());
                } else if (car.getPassengerType().equals("ROBOTS")) {
                    diningService.serveDinner(car.getId());
                }
            }

            // Refuel based on car type
            if (car.getCarType().equals("ELECTRIC")) {
                refuelingService.refuel(car.getId());
            } else if (car.getCarType().equals("GAS")) {
                refuelingService.refuel(car.getId());
            }

            System.out.println("Finished processing car: " + car.getId());
        }
        System.out.println("All cars processed. Queue is now empty.");
    }
}
