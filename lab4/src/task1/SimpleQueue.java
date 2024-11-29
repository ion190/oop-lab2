package task1;

import java.util.LinkedList;

public class SimpleQueue<T> implements Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T item) {
        list.addLast(item);
    }

    @Override
    public T dequeue() {
        return list.isEmpty() ? null : list.removeFirst();
    }

    @Override
    public T peek() {
        return list.isEmpty() ? null : list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
