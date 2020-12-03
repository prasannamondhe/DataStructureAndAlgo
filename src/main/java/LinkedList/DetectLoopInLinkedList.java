package LinkedList;

import java.util.HashSet;

public
class DetectLoopInLinkedList {


  Node head;

  static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      next = null;
    }
  }

  public void printList(DetectLoopInLinkedList add1ToANumber){
    Node temp = add1ToANumber.head;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }

  public boolean detectLoop(DetectLoopInLinkedList add1ToANumber){
    Node temp = add1ToANumber.head;
    Node prev = null;
    HashSet<Node> nodes = new HashSet<>();
    while (temp != null){
      if(nodes.contains(temp)){
        prev.next = null;
        return true;
      }

      nodes.add(temp);
      prev = temp;
      temp = temp.next;
    }
    return false;
  }

  public static void main(String[] args){
    Node first = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node four = new Node(4);
    DetectLoopInLinkedList add1ToANumber = new DetectLoopInLinkedList();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    third.next = four;
    four.next = second;
    //add1ToANumber.printList(add1ToANumber);
    System.out.println("Loop detected? "+add1ToANumber.detectLoop(add1ToANumber));

    add1ToANumber.printList(add1ToANumber);

  }
}
