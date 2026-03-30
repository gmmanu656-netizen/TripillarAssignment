package Package5;
// Binary Tree Postorder Traversal

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreePostorder {

    Node root;

    // Postorder Traversal (Left -> Right -> Root)
    void postorderTraversal(Node node) {
        if (node == null)
            return;

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        BinaryTreePostorder tree = new BinaryTreePostorder();

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

        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(tree.root);
    }
}

