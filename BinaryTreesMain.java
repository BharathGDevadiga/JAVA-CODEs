import java.util.*;

class Node {
    int data;
    Node left, right;
    
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTrees {
    Node root;
    
    // Constructor to initialize root
    BinaryTrees() {
        root = null;
    }

    void insert(int d) {
        Node new_node = new Node(d);
        if (root == null) {
            root = new_node;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left == null) {
                temp.left = new_node;
                return;
            } else {
                q.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new_node;
                return;
            } else {
                q.add(temp.right);
            }
        }
    }

    void inOrder(Node temp) {
        if (temp == null) return;
        inOrder(temp.left);
        System.out.print(temp.data + " ");
        inOrder(temp.right);
    }

    void preOrder(Node temp) {
        if (temp == null) return;
        System.out.print(temp.data + " ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    void postOrder(Node temp) {
        if (temp == null) return;
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + " ");
    }
}

public class BinaryTreesMain {
    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);

        System.out.println("InOrder:");
        tree.inOrder(tree.root);
        System.out.println("\nPreOrder:");
        tree.preOrder(tree.root);
        System.out.println("\nPostOrder:");
        tree.postOrder(tree.root);
    }
}
