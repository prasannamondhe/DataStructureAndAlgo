package LinkedList;

public
class ReverseLinkedListToGivenNumber {


  Node head;

  static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  public void printList(ReverseLinkedListToGivenNumber add1ToANumber){
    Node temp = add1ToANumber.head;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }

  public void reverseTheList(int pos, ReverseLinkedListToGivenNumber add1ToANumber){
    Node temp = add1ToANumber.head;
    Node prev= null;
    Node next = null;
    int count = 0;
    while(temp !=null && count<= pos){
      next = temp.next;
      temp.next = prev;
      prev = temp;
      temp = next;
      count++;
    }
  }


  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(9);
    Node third = new Node(9);
    ReverseLinkedListToGivenNumber add1ToANumber = new ReverseLinkedListToGivenNumber();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    add1ToANumber.printList(add1ToANumber);
    System.out.println("\n Reversed the list \n");
    add1ToANumber.reverseTheList(2, add1ToANumber);
    add1ToANumber.printList(add1ToANumber);
  }
}
