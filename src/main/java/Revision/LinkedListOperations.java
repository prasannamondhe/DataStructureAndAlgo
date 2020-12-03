package Revision;

import java.util.HashSet;
import java.util.LinkedList;

public
class LinkedListOperations {

  Node head;
  static class Node{
    Node next;
    int data;

    public Node(int data){
      this.data = data;
    }
  }

  public void push(Node newNode){
    if(head == null){
      head = newNode;
    }else {

      Node temp = head;
      Node prev = null;
      while (temp != null) {
        prev = temp;
        temp = temp.next;
      }
      prev.next = newNode;
    }

  }

  public void pushAfterGivenNode(Node node, int data){
    Node temp = head;
    Node t = null;
    Node n = null;
    while(temp != null ){
      if(temp.data == data)
      t = temp;

      temp = temp.next;
    }

    n = t.next;
    t.next = node;
    node.next = n;
  }

  public void printList(){
    Node temp = head;
    while (temp != null){
      System.out.println(temp.data+"\n");
      temp = temp.next;
    }
  }

  public void reverseList(){
    Node current = head;
    Node pre = null;
    Node next = null;
    while (current !=  null){
      next = current.next;
      current.next = pre;
      pre = current;
      current = next;
    }
    head = pre;
  }

  public void rotate(int value){
    Node temp = head;
    Node newNode = null;
    Node prev = null;
    int count = 1;
    while (temp != null){
      temp = temp.next;
      count++;
    }
    int len = count;
    count = 1;
    temp = head;
    while (temp != null && value != count){
      prev = temp;
      temp = temp.next;
      count++;
    }

    newNode = prev.next;
    prev.next = null;
    Node t = newNode;
    Node before = null;
    while (t != null){
      before = t;
      t = t.next;
    }
    before.next = head;
    head = newNode;
  }

  public void deleteNode(int data){
    Node temp = head;
    Node prev = null;
    while(temp != null && data != temp.data){
      prev = temp;
      temp = temp.next;
    }

    Node delete = prev.next;
    Node nextNode = delete.next;
    prev.next = nextNode;
    nextNode = null;
  }

  public void deleteLinkedList(){
    head = null;
  }

  public boolean detectLoop(){
    Node temp = head;
    Node current = null;
    HashSet hashSet = new HashSet();
    while (temp != null){
      if(!hashSet.add(temp.data)){
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public boolean deleteLoop(){
    Node temp = head;
    Node current = null;
    HashSet hashSet = new HashSet();
    while (temp != null){
      if(!hashSet.add(temp.data)){
        current.next = null;
      }
      current = temp;
      temp = temp.next;
    }

    return false;
  }

  public static void main(String[] args){
    LinkedListOperations linkedListOperations = new LinkedListOperations();
    linkedListOperations.push(new Node(1));
    linkedListOperations.push(new Node(2));
    linkedListOperations.push(new Node(3));
    linkedListOperations.push(new Node(4));
    linkedListOperations.push(new Node(5));
    linkedListOperations.push(new Node(3));
    //linkedListOperations.pushAfterGivenNode(new Node(4), 2);
    linkedListOperations.printList();
//    System.out.println("\nAfter reverse\n");
//    linkedListOperations.reverseList();
//    System.out.println("\nRotated list is\n");
//    linkedListOperations.rotate(2);
//    System.out.println("\n Delete the node \n");
//    linkedListOperations.deleteNode(2);
//    System.out.println("\nDelete linked list\n");
//    linkedListOperations.deleteLinkedList();

    System.out.println("Loop detected "+linkedListOperations.detectLoop());
    System.out.println("\nLoop deleted "+linkedListOperations.deleteLoop());
    System.out.println("Loop detected "+linkedListOperations.detectLoop());
  }
}
