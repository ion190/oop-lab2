public class Car {
    public static final String[] CAR_TYPES = {"ELECTRIC", "GAS"};
    public static final String[] PASSENGER_TYPES = {"PEOPLE", "ROBOTS"};
    public static final boolean[] IS_DINING = {true, false};

    private String carType;
    private String passengerType;
    private boolean isDining;
    private int consumption;

    public Car(String carType, String passengerType, boolean isDining, int consumption) {
        this.carType = carType;
        this.passengerType = passengerType;
        this.isDining = isDining;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", passengerType='" + passengerType + '\'' +
                ", isDining=" + isDining +
                ", consumption=" + consumption +
                '}';
    }
}
