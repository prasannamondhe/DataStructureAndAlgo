package LinkedList;

public
class PalindromeLinkedList {



  Node head;

  static class Node{
    Node next;
    String data;
    public Node(String data){
      this.data = data;
      next = null;
    }
  }

  public void printList(PalindromeLinkedList add1ToANumber){
    Node temp = add1ToANumber.head;
    while (temp != null){
      System.out.println(temp.data+ "\t");
      temp = temp.next;
    }
  }


  public boolean checkPalindrome(PalindromeLinkedList add1ToANumber){
      Node temp = add1ToANumber.head;
      String s = "";
      String t = "";
      while(temp != null){
        s = s + temp.data;
        temp = temp.next;
      }

    int len = s.length()-1;
    for (int i = s.length()-1; i >= 0; i--) {
      t = String.valueOf(s.charAt(i))+ t;
    }

    if(t.equals(s)){
      return true;
    }else{
      return false;
    }
  }

  public static void main(String[] args){
    Node first = new Node("a");
    Node second = new Node("b");
    Node third = new Node("a");
    PalindromeLinkedList add1ToANumber = new PalindromeLinkedList();
    add1ToANumber.head = first;
    add1ToANumber.head.next = second;
    second.next = third;
    add1ToANumber.printList(add1ToANumber);
    System.out.println("palindrome ? " +add1ToANumber.checkPalindrome(add1ToANumber));

  }
}
