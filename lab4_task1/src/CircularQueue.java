public class CircularQueue<T> {
    private T[] queue;
    private int front, rear, size, capacity;

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Enqueue an element
    public boolean enqueue(T element) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return false;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        return true;
    }

    // Dequeue an element
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        T element = queue[front];
        queue[front] = null; // Optional: Clear the slot for garbage collection

        if (front == rear) {
            // Queue is now empty
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return element;
    }

    // Peek the front element
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }
}
