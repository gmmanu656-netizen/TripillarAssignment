package Package5;
// Binary Tree Preorder Traversal

class Node1 {
    int data;
    Node left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePreorder {

    Node root;

    // Preorder Traversal (Root -> Left -> Right)
    void preorderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {

        BinaryTreePreorder tree = new BinaryTreePreorder();

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

        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(tree.root);
    }
}