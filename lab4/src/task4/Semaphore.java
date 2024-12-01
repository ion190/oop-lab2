package task4;
import task3.Car;
import task2.Dineable;
import task2.Refuelable;


public class Semaphore {
    private final Dineable peopleDinner;
    private final Dineable robotDinner;
    private final Refuelable electricStation;
    private final Refuelable gasStation;

    public Semaphore(Dineable peopleDinner, Dineable robotDinner, Refuelable electricStation, Refuelable gasStation) {
        this.peopleDinner = peopleDinner;
        this.robotDinner = robotDinner;
        this.electricStation = electricStation;
        this.gasStation = gasStation;
    }

    public void guideCar(Car car) {
        if (car.isDining()) {
            if (car.getPassengerType().equals("PEOPLE")) {
                peopleDinner.serveDinner(car.getId());
            } else if (car.getPassengerType().equals("ROBOTS")) {
                robotDinner.serveDinner(car.getId());
            }
        }

        if (car.getCarType().equals("ELECTRIC")) {
            electricStation.refuel(car.getId());
        } else if (car.getCarType().equals("GAS")) {
            gasStation.refuel(car.getId());
        }

    }
}