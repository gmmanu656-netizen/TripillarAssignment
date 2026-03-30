package Package5;
// Find Minimum and Maximum in BST

public class MinMaxBST {

    Node root;

    // Insert function
    Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);

        return node;
    }

    // Find Minimum
    int findMin(Node node) {
        if (node == null)
            throw new IllegalStateException("Tree is empty");

        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    // Find Maximum
    int findMax(Node node) {
        if (node == null)
            throw new IllegalStateException("Tree is empty");

        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {

        MinMaxBST bst = new MinMaxBST();

        // Creating BST
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.println("Minimum value: " + bst.findMin(bst.root));
        System.out.println("Maximum value: " + bst.findMax(bst.root));
    }
}
