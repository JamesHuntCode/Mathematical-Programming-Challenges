package pkg1000digitfibnumber;

import java.util.*;
import java.math.*;

public class Main {

    /** program to find the value of the first Fibonacci number to contain 1000 digits. **/
    public static void main(String[] args) {
        
        // Create sequence.
        ArrayList<Long> FibonacciSequence = createFibonacciSequence(new BigInteger("99999999999999999999"));
              
        // Log the result (first fib number to contain 1000 digits.
        System.out.print("The first 1000 digit value in the Fibonacci sequence is " + getSpecificValue(10, FibonacciSequence) + ".\n\n");
        
    }
    
    /** method to create the Fibonacci Sequence up until a defined limit **/
    /** this method takes in iterative approach to the Fibonacci sequence. **/
    public static ArrayList<Long> createFibonacciSequence(BigInteger limit)
    {
        ArrayList<Long> FibSequence = new ArrayList<>();
        
        long preTemp = 0;
        long temp = 1;
        long current = 1;
        
        while (current < limit.longValue())
        {
            current = (temp + preTemp);
            FibSequence.add(current);
            
            preTemp = temp;
            temp = current;
        }
        
        return FibSequence;
    }
    
    /** method to iterate over the Fibonacci sequence and elicit the first 1000 digit number. **/
    public static long getSpecificValue(long numberLength, ArrayList<Long> sequence)
    {
        long firstOccuringValue = -1;
        
        
        for (int i = 0; i < sequence.size(); i++)
        {
            if (String.valueOf(sequence.get(i)).length() >= numberLength)
            {
                firstOccuringValue = sequence.get(i);
                return firstOccuringValue;
            }
        }

        
        return firstOccuringValue;
    }
    
}
