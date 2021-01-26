package GeeksForGeeksPractice;

public class BinarySearchTreeNode {
    BinarySearchTreeNode left, right;
    int data;

    public BinarySearchTreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value< data){
            if(left == null){
                left = new BinarySearchTreeNode(value);
            }else{
                left.insert(value);
            }
        }
        else{
            if(right == null){
                right = new BinarySearchTreeNode(value);
            }else{
                right.insert(value);
            }
        }
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.println(data);
        if(left != null){
            left.printPreOrder();
        }
        if(right != null){
            right.printPreOrder();
        }
    }

    public void printPostOrder(){
        if(left != null){
            left.printPostOrder();
        }
        if(right != null){
            right.printPostOrder();
        }
        System.out.println(data);
    }

    public boolean find(int value){
        if(value == data){
            return true;
        }else if(value < data){
            if(left == null){
                return false;
            }else{
                return left.find(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.find(value);
            }
        }
    }

    public static void main(String[] args){
        BinarySearchTreeNode treeNode = new BinarySearchTreeNode(3);
        treeNode.insert(4);
        treeNode.insert(2);
        System.out.println("In order is :");
        treeNode.printInOrder();
        System.out.println("Pre order is ");
        treeNode.printPreOrder();
        System.out.println("Post order is ");
        treeNode.printPostOrder();
        System.out.println("Search element 4 "+treeNode.find(4));



    }

}
