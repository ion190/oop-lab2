package task1;

public interface Queue<T> {
    void enqueue(T item);       // Add an item to the queue
    T dequeue();                // Remove and return the first item
    T peek();                   // View the first item without removing it
    boolean isEmpty();          // Check if the queue is empty
    int size();                 // Get the current size of the queue
}
