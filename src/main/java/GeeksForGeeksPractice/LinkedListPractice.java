package GeeksForGeeksPractice;

import LinkedList.ReverseLinkedListToGivenNumber;

import java.util.HashSet;
import java.util.Set;

public class LinkedListPractice {
    Node head;

    class Node {
        Node next;
        int data;
        String strData;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(String data) {
            this.strData = data;
            this.next = null;
        }
    }

    //GFG: 3. Linked List Insertion
    public void append(int data) {
        Node current = this.head;
        if (head == null) {
            head = new Node(data);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void append(String data) {
        Node current = this.head;
        if (head == null) {
            head = new Node(data);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    //4-Linked List Deletion (Deleting a given key)
    public void deleteGivenKey(int data) {
        Node curr = head;
        Node pre = null;
        while (curr.next != null && curr.data != data) {
            pre = curr;
            curr = curr.next;
        }
        if (curr.next == null) {
            if (curr.data == data) {
                pre.next = null;
            } else {
                System.out.println("Can't delete the node bcs its not present");
            }
        } else {
            Node n = curr.next;
            pre.next = n;
        }
    }

    //5-Linked List Deletion (Deleting a key at given position)
    public void deleteGivenPosition(int pos) {
        Node curr = head;
        int count = 1;
        Node prev = null;
        while (curr.next != null && count != pos) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        if (curr.next == null) {
            if(pos == count){
                prev.next = null;
            }else
            System.out.println("Cant perform this ops bcs node is not present");
        } else {
            Node n = curr.next;
            prev.next = n;
        }

    }

    //6-Write a function to delete a Linked List
    public void deleteCompleteLinkedList(){
        head = null;
    }

    //7-Find Length of a Linked List (Iterative and Recursive)
    public int findLength(){
        Node curr = head;
        int count = 0;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        return count;
    }

    //8-Search an element in a Linked List (Iterative and Recursive)
    public boolean searchElement(int key){
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                return true;
            }else {
                curr = curr.next;
            }
        }
        return false;
    }

    //9-Write a function to get Nth node in a Linked List
    public int nthNode(int n){
        Node curr= head;
        int count = 1;
        while (curr != null){
            if(count == n){
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }

    //10 - Nth node from the end of a Linked List
    public int nthNodeFromLast(int n){
        Node curr = head;
        int count = 1;
        int len = findLength();
        while (curr != null){
            if((len-n+1) == count){
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }

    public int midOfLinkedList(){
        Node temp = head;
        int count = 0;
        int mid = findLength()/2;
        while (temp != null){
            if(mid == count){
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public int countOccurrence(int data){
        Node temp = head;
        int count = 0;
        while (temp != null){
            if(temp.data == data){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public boolean detectLoopInLinkedList(){
        Node temp = head;
        Set<Integer> s = new HashSet<>();
        while (temp != null){
            if(!s.add(temp.data)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void reverseTheList(){
        Node temp = head;
        Node prev= null;
        Node next = null;
        while(temp !=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public Node reverseTheListTillGivenNum(Node head, int num){
        Node temp = head;
        Node prev= null;
        Node next = null;
        int count = 0;
        while(temp !=null && count != num){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        if (next != null)
            head.next = reverseTheListTillGivenNum(next, num);

        return prev;
    }


    public void printLinkedList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public String getLinkedListString() {
        Node curr = this.head;
        String str = "";
        while (curr != null) {
            str = str + curr.strData;
            curr = curr.next;
        }
        return str;
    }

    public void linkedListWithoutDuplicate(){
        Set<Integer> s = new HashSet<>();
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null){
            if(!s.add(temp.data)){
                next = temp.next;
                prev.next = next;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void moveLastElementToFirst(){
        Node temp = head;
        Node prev = null;
        Node curr = null;
        int count = 1;
        int len = findLength();
        while (temp != null){
            if(count == (len-1)){
                prev = temp;
            }
            if(count == len){
                curr = temp;
            }
            temp = temp.next;
            count++;
        }
        curr.next = head.next;
        prev.next = null;
        head = curr;
    }

    public void swapElement(int x, int y){
        Node temp = head;
        while (temp != null){

            if (temp.data == y){
                temp.data = x;
            }
            if(temp.data == x){
                temp.data = y;
            }
            temp = temp.next;
        }
    }

    public void deleteAlternateLinkedList(){
        Node prev = head;
        Node now = head.next;
        while( prev != null && now != null){
            prev.next = now.next;

            now = null;
            prev = prev.next;
            if(prev !=null){
                now = prev.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListPractice linkedListPracticeDemo = new LinkedListPractice();
        //Append
        linkedListPracticeDemo.append(1);
        linkedListPracticeDemo.append(2);
        linkedListPracticeDemo.append(3);
        linkedListPracticeDemo.append(4);
        linkedListPracticeDemo.printLinkedList();

        //Linked List Deletion (Deleting a given key)
        linkedListPracticeDemo.deleteGivenKey(4);
        System.out.println("Linked List Deletion (Deleting a given key) 4 : ");
        linkedListPracticeDemo.printLinkedList();

        //Linked List Deletion (Deleting a key at given position)
        linkedListPracticeDemo.deleteGivenPosition(3);
        System.out.println("Linked List Deletion (Deleting a key at given position) 3 ");
        linkedListPracticeDemo.printLinkedList();

        //Find Length of a Linked List (Iterative and Recursive)
        linkedListPracticeDemo.findLength();
        System.out.println("Find Length of a Linked List (Iterative and Recursive): "+ linkedListPracticeDemo.findLength());

        //Search an element in a Linked List (Iterative and Recursive)
        System.out.println("Search an element in a Linked List (Iterative and Recursive) : "+ linkedListPracticeDemo.searchElement(2));

        //Write a function to get Nth node in a Linked List
        System.out.println("Write a function to get 1st node in a Linked List "+ linkedListPracticeDemo.nthNode(1));

        linkedListPracticeDemo.append(44);
        linkedListPracticeDemo.append(45);
        linkedListPracticeDemo.append(44);
        linkedListPracticeDemo.printLinkedList();
        //Write a function to get Nth node in a Linked List
        System.out.println("Write a function to get 3rd node from last in a Linked List "+ linkedListPracticeDemo.nthNodeFromLast(3));

        //Print the middle of a given linked list
        System.out.println("Mid of linked list is "+linkedListPracticeDemo.midOfLinkedList());

        //Write a function that counts the number of times a given int occurs in a Linked List
        System.out.println("Count occurrence of 44 is "+linkedListPracticeDemo.countOccurrence(44));

        //Detect loop in a linked list
        System.out.println("Loop in the list : "+linkedListPracticeDemo.detectLoopInLinkedList());

//
//        linkedListPracticeDemo.append("M");
//        linkedListPracticeDemo.append("O");
//        linkedListPracticeDemo.append("M");
//        String original = linkedListPracticeDemo.getLinkedListString();
//        System.out.println("String list is :-"+original);
//        linkedListPracticeDemo.reverseTheList();
//        String reverse = linkedListPracticeDemo.getLinkedListString();
//        System.out.println("Check linked list palindrome : - "+original.equals(reverse));

        //Write a function to delete a Linked List
//        linkedListPracticeDemo.deleteCompleteLinkedList();
//        System.out.println("Write a function to delete a Linked List");
//        linkedListPracticeDemo.printLinkedList(); //No output


        //Remove duplicates from a sorted linked list
        System.out.println("List after when duplicates are removed from sorted list ");
        linkedListPracticeDemo.linkedListWithoutDuplicate();
        linkedListPracticeDemo.printLinkedList();

        System.out.println("Added few more elements to list : ");
        linkedListPracticeDemo.append(9);
        linkedListPracticeDemo.append(9);
        linkedListPracticeDemo.append(8);
        linkedListPracticeDemo.printLinkedList();

        //Remove duplicates from an unsorted linked list
        System.out.println("List after when duplicates are removed from unsorted list ");
        linkedListPracticeDemo.linkedListWithoutDuplicate();
        linkedListPracticeDemo.printLinkedList();

        //Swap nodes in a linked list without swapping data
        System.out.println("Swap 8 and 9 ");
        linkedListPracticeDemo.swapElement(8,9);
        linkedListPracticeDemo.printLinkedList();

        //Move last element to first
        System.out.println("Move last element to first ");
        linkedListPracticeDemo.moveLastElementToFirst();
        linkedListPracticeDemo.printLinkedList();

        //Reverse a linked list
        System.out.println("Reversed linked list is ");
        linkedListPracticeDemo.reverseTheList();
        linkedListPracticeDemo.printLinkedList();

        //Reverse a Linked List in groups of given size
//        System.out.println("Reverse linked list till given number ");
//        linkedListPracticeDemo.reverseTheListTillGivenNum(linkedListPracticeDemo.head, 3);
//        linkedListPracticeDemo.printLinkedList();

        //Delete alternate nodes of a Linked List
        System.out.println("Delete alternate nodes of a Linked List");
        linkedListPracticeDemo.deleteAlternateLinkedList();
        linkedListPracticeDemo.printLinkedList();
    }
}
