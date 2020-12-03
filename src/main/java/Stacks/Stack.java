package Stacks;

public class Stack {

  int top;
  int[] array;
  int capacity;

  public Stack(int capacity){
    this.capacity = capacity;
    this.array = new int[capacity];
    this.top = -1;
  }

  public void push(int data){
    if(!isFull()){
      array[++top] = data;
    }else {
      throw new RuntimeException("Stack Full");
    }
  }

  public int pop(){
    if (!isEmpty())
    return array[top--];
    else
      throw new RuntimeException("Stack Empty");
  }

  public int peek(){
    return array[top];
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == capacity-1;
  }

  public void printStack(){
    for (int i = top; i >=0 ; i--) {
      System.out.println(array[i]);
      System.out.println("---\n");
    }
  }
}
