package Package5;
// Delete a node in Binary Search Tree

class Node7 {
    int data;
    Node left, right;

    Node7(int value) {
        data = value;
        left = right = null;
    }
}

public class DeleteBST {

    Node root;

    // Insert function (to build BST)
    Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);

        return node;
    }

    // Find minimum (used in deletion)
    int findMin(Node node) {
        while (node.left != null)
            node = node.left;
        return node.data;
    }

    // Delete function
    Node delete(Node node, int key) {
        if (node == null)
            return null;

        // Step 1: Find the node
        if (key < node.data) {
            node.left = delete(node.left, key);
        } else if (key > node.data) {
            node.right = delete(node.right, key);
        } else {

            // Case 1: No child
            if (node.left == null && node.right == null)
                return null;

                // Case 2: One child
            else if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

                // Case 3: Two children
            else {
                int minValue = findMin(node.right); // inorder successor
                node.data = minValue;
                node.right = delete(node.right, minValue);
            }
        }
        return node;
    }

    // Inorder traversal (to verify)
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        DeleteBST bst = new DeleteBST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.print("Before Deletion: ");
        bst.inorder(bst.root);

        bst.root = bst.delete(bst.root, 50); // delete root

        System.out.print("\nAfter Deletion: ");
        bst.inorder(bst.root);
    }
}