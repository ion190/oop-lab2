package task3;
import task2.PeopleDinner;
import task2.GasStation;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarStationTest {
    @Test
    public void testServeMixedCars() {
        PeopleDinner peopleDinner = new PeopleDinner();
        GasStation gasStation = new GasStation();
        CarStation carStation = new CarStation(peopleDinner, gasStation);

        Car car5 = new Car("5", "GAS", "PEOPLE", true, 20);
        Car car6 = new Car("6", "GAS", "PEOPLE", false, 15);

        carStation.addCar(car5);
        carStation.addCar(car6);
        assertEquals(2, carStation.getQueueSize());

        carStation.serveCars();

        assertEquals(0, carStation.getQueueSize());
        assertEquals(1, PeopleDinner.getPeopleServed()); // Only one dined
        assertEquals(2, GasStation.getGasCarsServed());
    }
}
