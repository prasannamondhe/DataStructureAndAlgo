package LinkedList;

public
class FindNthNodeFromTheEnd {


  Node head;

  static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  public void printList(FindNthNodeFromTheEnd add1ToANumber){
    Node temp = add1ToANumber.head;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }

  public void findNthNodeFromEnd(FindNthNodeFromTheEnd add1ToANumber, int nthNode){
    Node temp = add1ToANumber.head;
    Node next = null;
    Node prev = null;
    while (temp != null){
      next = temp.next;
      temp.next = prev;
      prev = temp;
      temp = next;
    }

    add1ToANumber.head = prev;
    int count =1;
    Node current = add1ToANumber.head;
    while(current != null && count != nthNode){
      current = current.next;
      count++;
    }

    System.out.println("nth node is "+current.data);
  }


  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    FindNthNodeFromTheEnd add1ToANumber = new FindNthNodeFromTheEnd();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    add1ToANumber.printList(add1ToANumber);
    System.out.println("\nnth node is \n");
    add1ToANumber.findNthNodeFromEnd(add1ToANumber, 2);
  }
}
