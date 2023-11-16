package DSAlgo.Non_LinearDSA.Trees;
import java.util.Scanner;
class Nodes{
    Node left;
    Node right;
    int data;
    public Nodes(int data){
        this.data=data;
    }
}
public class BinaryTree {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        Node root=create();
        Inorder(root);
    }
    static Node create(){
        Node root=null;
        System.out.println("Enter data : ");
        int data=predator.nextInt();
        if (data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter left node data : ");
        root.left=new Node(data);
        System.out.println("enter right node data : ");
        root.right=new Node(data);
        return root;
    }
    static void Inorder(Node root){
        if (root==null){
            return;
        }
        Inorder(root.left);
//        System.out.println(root.data+"");
    }
}
