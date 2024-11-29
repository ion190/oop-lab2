package task1;

public class QueueTest {
    public static void main(String[] args) {
        System.out.println("Testing Integer task1.Queue:");
        Queue<Integer> integerQueue = new SimpleQueue<>();

        System.out.println("Is the queue initially empty? " + integerQueue.isEmpty());
        assert integerQueue.isEmpty();

        System.out.println("Enqueuing 10...");
        integerQueue.enqueue(10);
        System.out.println("Current size: " + integerQueue.size());
        assert integerQueue.size() == 1;

        System.out.println("Peeking front element: " + integerQueue.peek());
        assert integerQueue.peek() == 10;

        System.out.println("Dequeuing element: " + integerQueue.dequeue());
        assert integerQueue.isEmpty();
        System.out.println("Is the queue empty after dequeue? " + integerQueue.isEmpty());

        System.out.println("\nTesting String task1.Queue:");
        Queue<String> stringQueue = new SimpleQueue<>();

        System.out.println("Enqueuing 'Car1'...");
        stringQueue.enqueue("Car1");
        System.out.println("Enqueuing 'Car2'...");
        stringQueue.enqueue("Car2");

        System.out.println("Current size: " + stringQueue.size());
        assert stringQueue.size() == 2;

        System.out.println("Dequeuing element: " + stringQueue.dequeue());
        assert stringQueue.peek().equals("Car2");

        System.out.println("Peeking front element: " + stringQueue.peek());
        System.out.println("All tests passed!");
    }
}
