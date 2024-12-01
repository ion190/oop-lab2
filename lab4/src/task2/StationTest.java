package task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StationTest {
    @Test
    public void testServiceStations() {
        Dineable peopleDinner = new PeopleDinner();
        Dineable robotDinner = new RobotDinner();
        Refuelable electricStation = new ElectricStation();
        Refuelable gasStation = new GasStation();

        // Serve dinners
        peopleDinner.serveDinner("Car1");
        robotDinner.serveDinner("Car2");
        robotDinner.serveDinner("Car3");

        // Refuel cars
        electricStation.refuel("Car4");
        electricStation.refuel("Car5");
        gasStation.refuel("Car6");

        // Assertions
        assertEquals(1, PeopleDinner.getPeopleServed());
        assertEquals(2, RobotDinner.getRobotsServed());
        assertEquals(2, ElectricStation.getElectricCarsServed());
        assertEquals(1, GasStation.getGasCarsServed());
    }

}
