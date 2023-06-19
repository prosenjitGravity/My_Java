package DSAlgo.Tree_Practice;

public class Tree {
    Node root;

    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static class CreateTree {
        static int index = -1;

        public static Node buildTree(int[] arr) {
            index++;
            if (arr[index] == -1) {
                return null;
            }
            Node newNode = new Node(arr[index]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }
        public static void main(String[] args){
            int array[]=new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            CreateTree tree=new CreateTree();
            Node root=tree.buildTree(array);
            System.out.println("The output is : "+root.value);
        }
    }

}
