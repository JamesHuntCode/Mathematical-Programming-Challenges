package largestsumpathfinder;

import java.math.*;
import java.util.*;
import java.lang.*;

public class LargestSumPathfinder {

    /** program to traverse tree like structure whilst attempting to accumulate the largest sum of the node values visited. **/
    public static void main(String[] args) {
        
        // Create root node.
        Node root = new Node(33);
        
        // Give it some children...
        
        // Left subtree.
        root.left = new Node(23);
        root.left.left = new Node(65);
        root.left.right = new Node(45);
        
        // Right subtree.
        root.right = new Node(98);
        root.right.right = new Node(21);
        root.right.left = new Node(32);
        
        // Traverse the above tree structure.
        traverse(root);
        
    }
    
    /** method to traverse the tree of nodes. **/
    /** !this method is only used for debugging! **/
    public static void traverse(Node root)
    {
        if (root != null)
        {   
            System.out.print(root.value + "\n");
            
            // Recursively traverse subtrees.
            traverse(root.left);
            traverse(root.right);
        }
    }
    
}

/** node class from which the tree is constructed. **/
class Node {
    
    /** node properties **/
    Node left;
    Node right;
    int value;
    
    /** node constructor function **/
    public Node(int val)
    {
        this.value = val;
        this.left = null;
        this.right = null;
    }
}
