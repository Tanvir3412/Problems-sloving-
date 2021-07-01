package binary.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BinaryTree {
    // 10,20,6,1,

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(6);
        tree.insert(30);

        tree.inOrder();
    ;
    }

    Node root;
    int count;

    public BinaryTree () {

        root = null;
        count = 0;
    }

    public Node insert (int data) {

        if (root == null) {
            root = new Node(data);
            count++;
            return root;
        }
        Node current = root;
      return   insertHelper(current, data);
    }

    public Node insertHelper(Node current, int data){
        if(data > current.data){
            if(current.right == null){
                current.right = new Node(data);
                count++;
                return current;

            }
            return insertHelper(current.right, data);
        }

        if(data < current.data){
            if(current.left == null){
                current.left = new Node(data);
                count++;
                return current;
            }
            return insertHelper(current.left, data);
        }
        return null;
    }

    public void inOrder () {
        Node node = root;
        inOrderHelp(node);
    }
    private void inOrderHelp (Node node) {
        if (node == null) return;
        inOrderHelp(node.left);
        System.out.print(" " + node.data );
        inOrderHelp(node.right);
    }

    public void breathSearch () {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            Node node = queue.remove();
            System.out.println(node.data + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }


    }




}
