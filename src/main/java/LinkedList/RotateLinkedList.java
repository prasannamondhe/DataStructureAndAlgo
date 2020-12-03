package LinkedList;

public
class RotateLinkedList {


  Node head;
  Node head2;

  static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  public void printList(Node t){
    Node temp = t;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }

public void deleteNnodesAfterM(int n, int m, RotateLinkedList add1ToANumber){
    Node temp = add1ToANumber.head;
    int count =1;
    Node t = null;
    while (temp != null && count != m){
      temp = temp.next;
      count++;
    }
    count = 0;
    while(temp != null && count <= n){
      temp = temp.next;
      count++;
    }
    add1ToANumber.head.next = temp;
}

public void mergeLinkedList(RotateLinkedList add1ToANumber, RotateLinkedList add1ToANumber1){
    Node head1 = add1ToANumber.head;
    Node head2 = add1ToANumber1.head2;
    Node next = null;
    while(head1 != null && head2 != null){
      next = head1.next;
      head1.next = head2;
      head2.next = next;
      head1 = head1.next;
      head2 = head2.next;
    }
    add1ToANumber.head = head1;
}

  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node four = new Node(4);
    RotateLinkedList add1ToANumber = new RotateLinkedList();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    third.next = four;

    Node first1 = new Node(11);
    Node second2 = new Node(22);
    Node third3 = new Node(33);
    Node four4 = new Node(44);
    RotateLinkedList add1ToANumber1 = new RotateLinkedList();
    add1ToANumber1.head2 = first1;
    add1ToANumber1.head2.next = second2;
    second2.next = third3;
    third3.next = four4;

    System.out.println("First linked list ");
    add1ToANumber.printList(add1ToANumber.head);

    System.out.println("Second linked list ");
    add1ToANumber1.printList(add1ToANumber1.head2);

    System.out.println("Merged linked list ");
    add1ToANumber.mergeLinkedList(add1ToANumber, add1ToANumber1);

    add1ToANumber.printList(add1ToANumber.head);

  }
}
