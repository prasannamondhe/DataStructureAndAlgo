package Stacks;

public
class SortStack {

  static Stack stack = new Stack(3);

  public static void main(String[] args){
    SortStack reverseStack = new SortStack();
    stack.push(1);
    stack.push(4);
    stack.push(3);

    System.out.println("Original stack is ");
    stack.printStack();

    System.out.println("\nSorted the stack\n");
    reverseStack.sortedStack();
    stack.printStack();
  }

  public void sortedStack(){
    if(!stack.isEmpty()){

      char a = (char) stack.peek();
      stack.pop();
      sortedStack();
      insertSortedItem(a);
    }
  }

  public void insertSortedItem(int item){
    if (stack.isEmpty() || item > stack.peek())
    {
      stack.push(item);
      return;
    }

    // If top is greater, remove the top item and recur
    int temp = stack.pop();
    insertSortedItem(item);

    // Put back the top item removed earlier
    stack.push(temp);
  }
}
