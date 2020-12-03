package LinkedList;

public
class Add1ToANumber {

  Node head;

  static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  public void printList(Add1ToANumber add1ToANumber){
    Node temp = add1ToANumber.head;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }

  public void addANumberToListElement(Add1ToANumber add1ToANumber){
    Node temp = add1ToANumber.head;
    String sum="";
    while(temp !=null){
      sum  = sum + String.valueOf(temp.data);
      temp = temp.next;
    }

    int a = Integer.parseInt(sum);
    int total = a+1;
    System.out.println("Sum is "+total);
  }

  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(9);
    Node third = new Node(9);
    Add1ToANumber add1ToANumber = new Add1ToANumber();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    add1ToANumber.printList(add1ToANumber);
    add1ToANumber.addANumberToListElement(add1ToANumber);
  }
}
