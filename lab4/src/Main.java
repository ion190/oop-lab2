import task1.Car;
import task1.Queue;
import task1.SimpleQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Car> carQueue = new SimpleQueue<>();
        carQueue.enqueue(new Car("ELECTRIC", "PEOPLE", false, 25));
        carQueue.enqueue(new Car("GAS", "ROBOTS", true, 40));

        System.out.println(carQueue.dequeue());
    }
}