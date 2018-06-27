package largestsumpathfinder;

public class LargestSumPathfinder {

    /** program to traverse tree like structure whilst attempting to accumulate the largest sum of the node values visited. **/
    public static void main(String[] args) {
        
        
        
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
