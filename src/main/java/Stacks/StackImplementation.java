package Stacks;

public
class StackImplementation {

  public static void main(String[] args){
    Stack stack = new Stack(3);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println("\nPush elements ");
    stack.printStack();

    System.out.println("Peek of the stack is "+stack.peek());

    System.out.println("\nPopped elements "+stack.pop());
    stack.printStack();
    stack.pop();
    stack.pop();


  }
}
