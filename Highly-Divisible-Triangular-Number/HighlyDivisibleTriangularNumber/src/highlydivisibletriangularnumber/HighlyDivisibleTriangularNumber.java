package highlydivisibletriangularnumber;

import java.util.*;
import java.math.*;
import java.lang.*;

public class HighlyDivisibleTriangularNumber {

    /** program to find the first triangular number with more than 'x' divisors. **/
    public static void main(String[] args) {
        
        // Get the sequence.
        ArrayList<Integer> sequence = triangularNumberSequence(7);
        
        // Log the triangular number with more than 'x' factors.
        int result = 0;
        int maxFactorCount = 0;
        
        for (int i = 0; i < sequence.size(); i++)
        {
            int currentFactorCount = getFactors(sequence.get(i));
            
            if (currentFactorCount > maxFactorCount) result = sequence.get(i); 
        }
        
        // Output result.
        System.out.print("The first triangular number with more than 5 factors is " + result + ".\n\n");
        
    }
    
    
    /** method to generate the first 'n' terms of the triangular sequence. **/
    public static ArrayList<Integer> triangularNumberSequence(int terms)
    {
        ArrayList<Integer> sequence = new ArrayList<>();
        
        int termCount = 0;
        
        for (int i = 2; termCount < terms; i++)
        {
            
            int term = 0;
            
            for (int j = (i - 1); j >= 0; j--)
            {
                term += j;
            }
            
            sequence.add(term);
            termCount++;
        }
        
        return sequence;
    }
    
    /** method to find all the factors of an input. **/
    public static int getFactors(int number)
    {
        int factorCount = 0;
        
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                factorCount++;
            }
        }
        
        return factorCount;
    }
    
}
