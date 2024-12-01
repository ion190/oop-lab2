package task4;
import task2.*;
import task3.Car;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SemaphoreTest {
    @Test
    public void testSemaphore() {
        PeopleDinner peopleDinner = new PeopleDinner();
        RobotDinner robotDinner = new RobotDinner();
        ElectricStation electricStation = new ElectricStation();
        GasStation gasStation = new GasStation();
        Semaphore semaphore = new Semaphore(peopleDinner, robotDinner, electricStation, gasStation);

        Car car1 = new Car("1", "GAS", "PEOPLE", false, 30);
        Car car2 = new Car("2", "ELECTRIC", "PEOPLE", true, 40);
        Car car3 = new Car("3", "GAS", "ROBOTS", false, 20);
        Car car4 = new Car("4", "ELECTRIC", "ROBOTS", true, 25);

        semaphore.guideCar(car1);
        semaphore.guideCar(car2);
        semaphore.guideCar(car3);
        semaphore.guideCar(car4);

        assertEquals(2, GasStation.getGasCarsServed());
        assertEquals(2, ElectricStation.getElectricCarsServed());
        assertEquals(1, PeopleDinner.getPeopleServed());
        assertEquals(1, RobotDinner.getRobotsServed());
    }
}
