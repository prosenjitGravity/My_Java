package DSAlgo.Tree_Practice;
 import java.util.Scanner;
public class BinaryTree {
    public BinaryTree(){}
    private Node root;
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public void populate(Scanner predator){
        System.out.println("enter the root node value");
        int value=predator.nextInt();
        root=new Node(value);
        populate(predator,root);
    }
    private void populate(Scanner predator,Node node){
        System.out.println("do you want to enter the left value of : "+node.value);
        boolean left=predator.nextBoolean();
        if(left){
            System.out.println("enter the left value of : "+node.value);
            int value=predator.nextInt();
            node.left=new Node(value);
            populate(predator,node.left);
        }
        System.out.println("Do you want to enter the right value of "+node.value);
        boolean right=predator.nextBoolean();
        if(right){
            System.out.println("enter the right value of : "+node.value);
            int value =predator.nextInt();
            node.right=new Node(value);
            populate(predator,node.right);
        }
    }
 public void display(){
        display(this.root," ");
 }
 private void display(Node node,String indent){
        if(node ==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
 }
 public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        BinaryTree  tree=new BinaryTree();
        tree.populate(predator);
        tree.display();
 }
}
