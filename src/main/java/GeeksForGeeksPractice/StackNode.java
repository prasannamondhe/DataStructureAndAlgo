package GeeksForGeeksPractice;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * Implemented Stack
 * Operations: Push, Pop, IsEmpty, IsFull, Peek
 */
class StackNode {
    int capacity;
    int[] stk = null;
    int peek;

    public StackNode(int capacity) {
        this.capacity = capacity;
        this.stk = new int[capacity];
        this.peek = 0;
    }

    public void push(int data) throws Exception {
        if (!isFull()) {
            stk[peek] = data;
            peek++;
        } else {
            throw new Exception("Stack is full");
        }
    }

    public void pop() throws Exception {

        if (!isEmpty()) {
            peek--;
        } else {
            throw new Exception("Cant pop element, Stack is empty");
        }
    }

    public boolean isFull() {
        if (capacity == peek) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (peek < 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        return peek;
    }

    public void printStack() {
        for (int i = peek - 1; i >= 0; i--) {
            System.out.println(stk[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        StackNode s = new StackNode(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek is " + s.peek());
        System.out.println("Stack is");
        s.printStack();
        s.pop();
        System.out.println("After Element is popped");
        s.printStack();
    }
}
