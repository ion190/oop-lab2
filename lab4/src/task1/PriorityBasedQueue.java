package task1;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityBasedQueue<T extends Comparable<T>> implements Queue<T> {
    private PriorityQueue<T> pq;

    public PriorityBasedQueue() {
        pq = new PriorityQueue<>();
    }

    @Override
    public void enqueue(T item) {
        pq.add(item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return pq.poll();
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return pq.peek();
    }

    @Override
    public boolean isEmpty() {
        return pq.isEmpty();
    }

    @Override
    public int size() {
        return pq.size();
    }
}
