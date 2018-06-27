package longestcollatzsequence;

import java.math.*;
import java.lang.*;
import java.util.*;

public class LongestCollatzSequence {

    /** program to determine which number under 'x' produces the largest Collatz sequence. **/
    /** the Collatz sequence dictates that n -> = (n/2) if 'n' is even and n -> = (3n + 1) if 'n' is odd. **/
    public static void main(String[] args) {
        
        // Log the result.
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> CollatzSequence = calculateNextCollatz(13, emptyList);
        
        // Output the entire sequence.
        for (int i = 0; i < CollatzSequence.size(); i++)
        {
            System.out.print(CollatzSequence.get(i) + "\n");
        }
        
    }
    
    /** method to recursively calculate the next number in the Collatz sequence. **/
    public static ArrayList<Integer> calculateNextCollatz(int n, ArrayList<Integer> sequence)
    {
        sequence.add(n);
        
        if (n == 1)
        {
            return sequence;
        }
        else if (n % 2 == 0)
        {
            return calculateNextCollatz(n / 2, sequence);
        } 
        else 
        {
            return calculateNextCollatz((3 * n) + 1, sequence);
        }
    }
    
    /** method to calculate the length of the Collatz sequence passed in. **/
    public static int getLength(ArrayList<Integer> sequence)
    {
        return sequence.size();
    }
}
