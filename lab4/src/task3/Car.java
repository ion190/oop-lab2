package task3;

public class Car {
    private String id;
    private String carType; // ELECTRIC or GAS
    private String passengerType; // PEOPLE or ROBOTS
    private boolean isDining;

    public Car(String id, String carType, String passengerType, boolean isDining) {
        this.id = id;
        this.carType = carType;
        this.passengerType = passengerType;
        this.isDining = isDining;
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
}

