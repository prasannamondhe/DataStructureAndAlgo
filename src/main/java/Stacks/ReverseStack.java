package Stacks;

public
class ReverseStack {

  static Stack stack;

  public static void main(String[] args){
    stack = new Stack(3);
    stack.push(1);
    stack.push(4);
    stack.push(3);

    System.out.println("Stack is \n");
    stack.printStack();

    System.out.println("\nReversed stack is\n");
    ReverseStack reverseStack = new ReverseStack();
    reverseStack.reverse();
    stack.printStack();
  }

  public void reverse(){
    if(!stack.isEmpty()) {

      char c = (char) stack.peek();
      stack.pop();
      reverse();
      insertAtBottom(c);
    }
  }

  public void insertAtBottom(char item){
    if(stack.isEmpty() || stack.peek()<item){
      stack.push(item);
    }else {

      char a = (char) stack.peek();
      stack.pop();
      insertAtBottom(item);
      stack.push(a);
    }
  }
}
