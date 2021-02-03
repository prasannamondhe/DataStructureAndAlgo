package GeeksForGeeksPractice;

import Search_Algorithms.BinarySearch;

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

    public BinarySearchTreeNode deleteNode(BinarySearchTreeNode node, int key){
        BinarySearchTreeNode parent = null;
        if(node == null){
            return null;
        }
        if(key < node.data){
            parent = node;
            node.left = deleteNode(node.left, key);
        }else if(key > node.data){
            parent = node;
            node.right = deleteNode(node.right, key);
        }else{
            if(node.right == null || node.left == null) {
                BinarySearchTreeNode temp = null;
                temp = node.left == null ? node.right : node.left;
                if(temp == null){
                    return null;
                }else {
                    return temp;
                }
            }else{
                BinarySearchTreeNode successor = getSuccessor(node);
                node.data = successor.data;
                node.right = deleteNode(node.right, successor.data);
                return node;
            }

        }
        return node;
    }

    private BinarySearchTreeNode getSuccessor(BinarySearchTreeNode node) {
        if(node == null){
            return null;
        }
        BinarySearchTreeNode temp = node.right;
        while (temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public void printRightTree(BinarySearchTreeNode node){
        if(node == null){
            System.out.println("Can't print the right tree");
        }
        printRightSubTree(node.right);
    }

    private void printRightSubTree(BinarySearchTreeNode node) {
        if(node.left != null){
            printRightSubTree(node.left);
        }
        System.out.println(node.data);
        if(node.right != null){
            printRightSubTree(node.right);
        }
    }

    public static void main(String[] args){
        BinarySearchTreeNode treeNode = new BinarySearchTreeNode(8);
        treeNode.insert(3);
        treeNode.insert(10);
        treeNode.insert(1);

        treeNode.insert(6);
        treeNode.insert(4);
        treeNode.insert(7);
        treeNode.insert(14);
        treeNode.insert(13);
        System.out.println("In order is :");
        treeNode.printInOrder();
        System.out.println("Pre order is ");
        treeNode.printPreOrder();
        System.out.println("Post order is ");
        treeNode.printPostOrder();
        //System.out.println("Search element 4 "+treeNode.find(4));
        System.out.println("Delete node 3 : "+treeNode.deleteNode(treeNode, 3));
        System.out.println("Inorder after node 3 is deleted ");
        treeNode.printInOrder();

        System.out.println("Print right side of BST");
        treeNode.printRightTree(treeNode);


    }

}
