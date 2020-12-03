package LinkedList;

public
class LinkedListPractice {

  Node head;
  static class Node{
    int data;
    Node next;

    Node(int d){
      data = d;
      next =null;
    }
  }

  public void printList()
  {
    Node n = head;
    while (n != null) {
      System.out.print(n.data + " ");
      n = n.next;
    }
  }

  public static void main(String[] args){
    LinkedListPractice linkedList = new LinkedListPractice();
    linkedList.head = new Node(1);
    Node second = new Node(1);
    Node third = new Node(2);
    linkedList.head.next = second;
    second.next = third;
    linkedList.pushAtFront(linkedList);
    linkedList.pushAfterGivenNode(second, 45);
    linkedList.pushAtLast(29, linkedList);
    //linkedList.deleteANode(linkedList, 4);
    //System.out.println("\nBefore Delete");
    linkedList.printList();
    //linkedList.lengthOfLinkedList(linkedList);
    //linkedList.deleteAllLinkedList(linkedList);
    //System.out.println("Before Delete");
    //linkedList.printList();
    //System.out.println("\nElement found "+linkedList.searchElement(30, linkedList));
    //System.out.println("\nNth node is "+linkedList.getNthNode(linkedList, 2).data);
    //linkedList.findMiddle(linkedList);
    //System.out.println("\n Deleted middle node ");
    System.out.println("\nremove duplicates \n");
    linkedList.removeDuplicateEntry(linkedList);
    linkedList.printList();
    //linkedList.reverseLinkedList(linkedList, 2);
  }

  public void pushAtFront(LinkedListPractice linkedList){
    Node newNode = new Node(20);
    newNode.next = linkedList.head;
    linkedList.head = newNode;
  }

  public void reverseLinkedList(LinkedListPractice linkedListPractice, int pos){
    Node prev = null;
    Node next = null;
    Node current = linkedListPractice.head;
    Node h = linkedListPractice.head;;
    int count = 0;
    while(current != null && pos != count){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      count ++;
    }

    linkedListPractice.head = h;
    System.out.println("\nReversed List is " );
    linkedListPractice.printList();
  }

  public Node getNthNode(LinkedListPractice linkedListPractice, int nthNode){
    Node temp = linkedListPractice.head;
    int count = 0;
    while(temp != null && count != nthNode){
      temp = temp.next;
      count ++;
    }
    return temp;
  }

  public void findMiddle(LinkedListPractice linkedListPractice) {
    Node temp  = linkedListPractice.head;
    Node temp2 = linkedListPractice.head;
    int  count = 0;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    int mid = count / 2;
    count = 1;
    while (temp2 != null && count != mid) {
      temp2 = temp2.next;
      count++;
    }

    System.out.println("\nMiddle node is " + temp2.data);

    //delete middle of linked list
    System.out.println("Delete middle node");
    Node prev = null;
    Node h    = linkedListPractice.head;
    count = 1;
    while (h != null && count == mid - 1) {
      h = h.next;
      count++;
    }
    h.next = temp2.next;
  }

  public void lengthOfLinkedList(LinkedListPractice linkedList){
    int count = 0;
    Node temp = linkedList.head;
    while(temp !=null){
      temp = temp.next;
      count++;
    }
    System.out.println("Length of LL "+count);
  }

  public boolean searchElement(int x, LinkedListPractice listPractice){
    Node temp = listPractice.head;
    while(temp != null){
      if(temp.data == x){
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public void pushAfterGivenNode(Node prevNode, int newData){
    Node giveNode = new Node(newData);
    Node e = prevNode.next;
    prevNode.next = giveNode;
    giveNode.next = e;
  }

  public void pushAtLast(int data, LinkedListPractice linkedListPractice){
    Node newNode = new Node(data);
    Node last = linkedListPractice.head;
    while (last.next !=null ){
      last = last.next;
    }

    last.next = newNode;

  }

  public void deleteAllLinkedList(LinkedListPractice linkedListPractice){
    linkedListPractice.head = null;
  }

  public void deleteANode(LinkedListPractice linkedListPractice, int position){
    int count = 1;
    Node headNode = linkedListPractice.head;
    while(count < position-1 && headNode.next != null){
      headNode = headNode.next;
      count++;
    }

    if (headNode.next != null) {
      Node current = headNode.next;
      headNode.next = current.next;
    }
    else {
      System.out.println("Not possible to delete node at given index");
    }

  }

  public void removeDuplicateEntry(LinkedListPractice listPractice){
    Node curr = listPractice.head;
    while(curr != null){
      Node temp = curr;

      while(temp != null && temp.data == curr.data){
        temp = temp.next;
      }

      curr.next = temp;
      curr = curr.next;
    }
  }

}
