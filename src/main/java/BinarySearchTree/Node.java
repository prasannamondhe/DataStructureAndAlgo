package BinarySearchTree;

public
class Node {

  Node left, right;
  int data;

  public Node(int data) {
    this.data = data;
  }

  public void insertNode(int value){
    if(value <= this.data){
      if(left == null){
        left = new Node(value);
      }else{
        left.insertNode(value);
      }
    }else{
      if(right == null ){
        right = new Node(value);
      }else {
        right.insertNode(value);
      }
    }
  }

  //inorder print
  public void print(){
    if(left != null){
      left.print();
    }
    System.out.println(data);
    if(right != null){
      right.print();
    }
  }

  public void printPostOrder(){
    if(right != null){
      right.print();
    }
    System.out.println(data);
    if(left != null){
      left.print();
    }
  }

  public boolean find(int value){
    if(value < this.data ){
      if(left != null){
        if(left.data == value){
          return true;
        }else{
          left.find(value);
        }
      }
    }else {
      if(right != null){
        if(right.data == value){
          return true;
        }else{
          right.find(value);
        }
      }
    }
    return false;
  }


}
