package pkg1000digitfibnumber;

import java.util.*;
import java.math.*;

public class Main {

    /** program to find the index and value of the first Fibonacci number to contain 1000 digits. **/
    public static void main(String[] args) {
        
        // Create sequence.
        ArrayList<Integer> FibonacciSequence = createFibonacciSequence(100);
              
        // Log the result (first fib number to contain 1000 digits.
        for (int i = 0; i < FibonacciSequence.size(); i++)
        {
            System.out.print(FibonacciSequence.get(i) + "\n");
        }
        
    }
    
    /** method to create the Fibonacci Sequence up until a defined limit **/
    /** this method takes in iterative approach to the Fibonacci sequence. **/
    public static ArrayList<Integer> createFibonacciSequence(int limit)
    {
        ArrayList<Integer> FibSequence = new ArrayList<>();
        
        int preTemp = 0;
        int temp = 1;
        int current = 1;
        
        while (current < limit)
        {
            current = temp + preTemp;
            FibSequence.add(current);
            
            preTemp = temp;
            temp = current;
        }
        
        return FibSequence;
    }
    
}
