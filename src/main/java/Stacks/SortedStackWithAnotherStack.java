package Stacks;

public
class SortedStackWithAnotherStack {
  static Stack stackNew;

  public static void main(String[] args){
    Stack stack = new Stack(3);
    stackNew = new Stack(3);
    SortedStackWithAnotherStack anotherStack = new SortedStackWithAnotherStack();
    stack.push(1);
    stack.push(5);
    stack.push(3);

    System.out.println("Stack is \n");
    stack.printStack();

    System.out.println("\nReversed stack is\n");
    while (!stack.isEmpty()){
      char a = (char) stack.pop();
      stackNew.push(a);
    }
    stackNew.printStack();

//    while (!stack.isEmpty()) {
//      char s = (char) stack.pop();
//      anotherStack.insertAtBottom(s);
//    }
//
//    System.out.println("Sorted Stack is \n");
//    stackNew.printStack();
  }

  public void insertAtBottom(char c){
    if(stackNew.isEmpty() || c > stackNew.peek()){
      stackNew.push(c);
    }else{
      char p = (char) stackNew.peek();
      stackNew.pop();
      insertAtBottom(c);
      stackNew.push(p);
    }
  }
}
