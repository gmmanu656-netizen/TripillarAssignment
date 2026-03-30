package Package5;
// Find Height of Binary Tree

class Node3 {
    int data;
    Node left, right;

    Node3(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    Node root;

    // Function to find height
    int findHeight(Node node) {
        if (node == null)
            return -1; // return 0 if counting nodes instead of edges

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();

        // Creating Binary Tree
        /*
                1
               / \
              2   3
             / \
            4   5
        */

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int height = tree.findHeight(tree.root);
        System.out.println("Height of Binary Tree: " + height);
    }
}