package Package5;
// Search a key in Binary Search Tree

class Node6 {
    int data;
    Node left, right;

    Node6(int value) {
        data = value;
        left = right = null;
    }
}

public class SearchBST {

    Node root;

    // Insert (to build BST)
    Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);

        return node;
    }

    // Search function
    boolean search(Node node, int key) {
        if (node == null)
            return false;

        if (node.data == key)
            return true;

        if (key < node.data)
            return search(node.left, key);
        else
            return search(node.right, key);
    }

    public static void main(String[] args) {

        SearchBST bst = new SearchBST();

        // Creating BST
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        int key = 40;

        if (bst.search(bst.root, key))
            System.out.println("Key found!");
        else
            System.out.println("Key not found!");
    }
}