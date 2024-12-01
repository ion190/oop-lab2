package task3;

public class Car {
    private final String id;
    private final String carType; // ELECTRIC or GAS
    private final String passengerType; // PEOPLE or ROBOTS
    private final boolean isDining;
    private final int consumption;

    public Car(String id, String carType, String passengerType, boolean isDining, int consumption) {
        this.id = id;
        this.carType = carType;
        this.passengerType = passengerType;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    public String getId() {
        return id;
    }

    public String getCarType() {
        return carType;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public boolean isDining() {
        return isDining;
    }

    public int getConsumption() {
        return consumption;
    }
}

