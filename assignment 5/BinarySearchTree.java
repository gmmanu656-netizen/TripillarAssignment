package Package5;
// Insert Elements into Binary Search Tree

class Node5 {
    int data;
    Node left, right;

    Node5(int value) {
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node root;

    // Insert function
    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    // Inorder traversal (to verify BST)
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Inserting elements
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.print("Inorder Traversal (Sorted): ");
        bst.inorder(bst.root);
    }
}