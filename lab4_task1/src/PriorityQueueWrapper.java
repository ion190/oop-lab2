import java.util.PriorityQueue;

public class PriorityQueueWrapper<T> implements Queue<T> {
    private PriorityQueue<T> priorityQueue;

    public PriorityQueueWrapper() {
        priorityQueue = new PriorityQueue<>();
    }

    @Override
    public void enqueue(T item) {
        priorityQueue.add(item);
    }

    @Override
    public T dequeue() {
        return priorityQueue.poll();
    }

    @Override
    public T peek() {
        return priorityQueue.peek();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }
}
