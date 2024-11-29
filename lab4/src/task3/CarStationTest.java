package task3;

import task2.Dineable;
import task2.ElectricStation;
import task2.PeopleDinner;
import task2.Refuelable;

import java.util.Queue;
import java.util.LinkedList;

public class CarStationTest {
    public static void main(String[] args) {
        // Create instances of services
        Dineable peopleDinner = new PeopleDinner();
        Refuelable electricStation = new ElectricStation();

        // Create a queue and a CarStation
        Queue<Car> carQueue = new LinkedList<>();
        CarStation carStation = new CarStation(peopleDinner, electricStation, carQueue);

        // Test 1: Add and serve an electric car with people dining
        Car car1 = new Car("Car1", "ELECTRIC", "PEOPLE", true);
        carStation.addCar(car1);

        // Test 2: Add and serve a gas car without dining
        Car car2 = new Car("Car2", "GAS", "ROBOTS", false);
        carStation.addCar(car2);

        // Test 3: Add and serve a robot-electric car with dining
        Car car3 = new Car("Car3", "ELECTRIC", "ROBOTS", true);
        carStation.addCar(car3);

        // Serve all cars
        carStation.serveCars();

        // Verify queue is empty
        assert carQueue.isEmpty() : "Queue should be empty after serving all cars.";
    }
}
