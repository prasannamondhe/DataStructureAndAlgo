package BinarySearchTree;

public
class BinarySearchTree {

  public static void main(String[] args){
    Node node = new Node(3);
    node.insertNode(2);
    node.insertNode(4);

    node.print();
    System.out.println("\nfind element\n"+node.find(10));

    System.out.println("\nPost Order\n");
    node.printPostOrder();

  }
}
