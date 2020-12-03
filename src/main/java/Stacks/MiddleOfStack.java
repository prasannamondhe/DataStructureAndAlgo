package Stacks;

public
class MiddleOfStack {

  public static void main(String[] args){
    Stack stack = new Stack(4);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    int mid = stack.capacity/2;
    int count = 1;
    while (count <= mid){
      stack.pop();
      count++;
    }
    System.out.println("mid is "+stack.peek());
  }
}
