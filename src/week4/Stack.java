package week4;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(int data) {
        this.stack.add(data);
    }

    public int pop() {
        int value = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return value;
    }
}
