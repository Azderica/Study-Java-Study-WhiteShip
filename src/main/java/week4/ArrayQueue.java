package week4;

public class ArrayQueue {
    int[] queue;
    int head, tail;

    public ArrayQueue(int capacity) {
        this.queue = new int[capacity];
        this.head = -1;
        this.tail = 0;
    }

    public void push(int data) {
        this.queue[++this.head] = data;
    }

    public int pop() {
        if (this.tail > this.head) throw new IndexOutOfBoundsException();
        return this.queue[this.tail++];
    }
}
