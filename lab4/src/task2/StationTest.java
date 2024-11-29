package task2;

public class StationTest {
    public static void main(String[] args) {
        // Refuelable tests
        Refuelable electricStation1 = new ElectricStation();
        Refuelable electricStation2 = new ElectricStation();
        Refuelable gasStation = new GasStation();

        electricStation1.refuel("E1");
        electricStation2.refuel("E2");
        gasStation.refuel("G1");

        System.out.println("\nTotal Electric Cars Refueled: " + ElectricStation.getTotalElectricCarsRefueled());
        System.out.println("Total Gas Cars Refueled: " + GasStation.getTotalGasCarsRefueled());

        // Dineable tests
        Dineable peopleDinner = new PeopleDinner();
        Dineable robotDinner = new RobotDinner();

        peopleDinner.serveDinner("P1");
        robotDinner.serveDinner("R1");
        robotDinner.serveDinner("R2");

        System.out.println("\nTotal People Served: " + PeopleDinner.getTotalPeopleServed());
        System.out.println("Total Robots Served: " + RobotDinner.getTotalRobotsServed());
    }
}
