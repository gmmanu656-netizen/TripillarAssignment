package Package5;
// Binary Tree Inorder Traversal

class Node2 {
    int data;
    Node left, right;

    Node2(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeInorder {

    Node root;

    // Inorder Traversal (Left -> Root -> Right)
    void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {

        BinaryTreeInorder tree = new BinaryTreeInorder();

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

        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(tree.root);
    }
}