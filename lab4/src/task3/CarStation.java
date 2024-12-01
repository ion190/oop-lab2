package task3;
import java.util.LinkedList;
import java.util.Queue;
import task2.Refuelable;
import task2.Dineable;

public class CarStation {
    private final Dineable diningService;
    private final Refuelable refuelingService;
    private final Queue<Car> queue;

    public CarStation(Dineable diningService, Refuelable refuelingService) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = new LinkedList<>();
    }

    public void addCar(Car car) {
        queue.add(car);
    }

    public void serveCars() {
        while (!queue.isEmpty()) {
            Car car = queue.poll();

            // Serve dinner if the car wants to dine
            if (car.isDining()) {
                diningService.serveDinner(car.getId());
            }

            // Refuel the car
            refuelingService.refuel(car.getId());

            System.out.println("Finished serving car " + car.getId());
        }
    }

    public int getQueueSize() {
        return queue.size();
    }
}
