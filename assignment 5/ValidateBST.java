package Package5;
// Check if a Binary Tree is a valid BST

class Node8 {
    int data;
    Node left, right;

    Node8(int value) {
        data = value;
        left = right = null;
    }
}

public class ValidateBST {

    Node root;

    // Function to check BST using range (min, max)
    boolean isBST(Node node, int min, int max) {
        if (node == null)
            return true;

        // Check current node value
        if (node.data <= min || node.data >= max)
            return false;

        // Check left and right subtree
        return isBST(node.left, min, node.data) &&
                isBST(node.right, node.data, max);
    }

    public static void main(String[] args) {

        ValidateBST tree = new ValidateBST();

        // Creating a Binary Tree
        /*
                50
               /  \
             30    70
            / \   / \
          20  40 60  80
        */

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        if (tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}

