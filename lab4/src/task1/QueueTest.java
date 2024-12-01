package task1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {


        @Test
        void testQueueImplementation () {
            Queue<Integer> queue = new ArrayQueue<>();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            assertEquals(3, queue.size());
            assertEquals(1, queue.peek());
            assertEquals(1, queue.dequeue());
            assertEquals(2, queue.size());

        }

}


