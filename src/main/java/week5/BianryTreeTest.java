package week5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BianryTreeTest {
    public static BinaryTree tree;
    public static Node root;

    public static void main(String[] args){
        tree = new BinaryTree();

        root = new Node(5);
        Node temp = root.addLeftNode(3);
        temp.addLeftNode(2);
        temp.addRightNode(4);
        temp = root.addRightNode(7);
        temp.addLeftNode(6);
        temp.addRightNode(8);

        // bfs
        tree.bfs(root);
        for(int nodeValue : tree.bfsList){
            System.out.print(nodeValue + " ");
        }
        System.out.print("\n");

        // dfs
        tree.dfs(root);
        for(int nodeValue : tree.dfsList){
            System.out.print(nodeValue + " ");
        }
        System.out.print("\n");

    }
}
