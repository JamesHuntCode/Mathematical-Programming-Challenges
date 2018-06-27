package largestsumpathfinder;

import java.math.*;
import java.util.*;
import java.lang.*;

public class LargestSumPathfinder {

    /** program to traverse a tree like structure whilst attempting to accumulate the largest sum of all node values visited. **/
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
        System.out.print("Nodes (infix order):\n");
        traverse(root);
        
        // Find the path that contains the nodes with the highest values.
        System.out.print("\nThe sum of the path with the largest node values is " + findPathWithLargestSum(root) + ".\n");
        
    }
    
    /** !method to traverse the tree of nodes! **/
    /** !this method is only used for debugging! **/
    /** !this method implements an infix tree traversal! **/
    /** !this method implements recursion rather than iteration! **/
    public static void traverse(Node root)
    {
        if (root != null)
        {   
            traverse(root.left);
            
            System.out.print(root.value + "\n");
            
            traverse(root.right);
        }
    }
    
    /** method to traverse all possibilities and return the sum of the path which adds up to the highest value. **/
    public static int findPathWithLargestSum(Node root)
    {
        int largestPathSum = 0;
        
        
        
        return largestPathSum;
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
