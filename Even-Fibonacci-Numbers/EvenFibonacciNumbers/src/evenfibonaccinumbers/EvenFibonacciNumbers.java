package evenfibonaccinumbers;

import java.util.ArrayList;

public class EvenFibonacciNumbers {

    /** program to compute the sum of all even Fibonacci numbers up to 'x' **/
    public static void main(String[] args) {
        
       // Limit of fib sequence. 
       int limit = 1000;
       ArrayList<Integer> myFib = Fibonacci(limit);
       
       // Log sum.
       System.out.print("\nSum of all even numbers in sequence is " + ComputeEvenFibSum(myFib) + ".\n\n");
    }
    
    /** method to compute all Fibonacci numbers until limit **/
    public static ArrayList<Integer> Fibonacci(int limit)
    { 
        ArrayList<Integer> FibonacciSequence = new ArrayList<Integer>();
        int current = 0;
        int temp = 1;
        int preTemp = 0;
        int i = 0;
        
        while (current < 1000)
        {
            current = (temp + preTemp);
            preTemp = temp;
            temp = current;
            
            FibonacciSequence.add(current);
        }
        
        return FibonacciSequence;
    }
    
    /** method to compute the total of all even numbers in the sequence passed in **/
    public static long ComputeEvenFibSum(ArrayList<Integer> sequence)
    {
        long sum = 0;
        
        for (int i = 0; i < sequence.size(); i++)
        {
            if (sequence.get(i) % 2 == 0)
            {
                sum += sequence.get(i);
            }
        }
        
        return sum;
    }
    
}
