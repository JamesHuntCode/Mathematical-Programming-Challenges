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
        
        
        
        // Output result.
        System.out.print("The first triangular number with more than 5 factors is " + result + ".\n\n");
        
    }
    
    
    /** method to generate the first 'n' terms of the triangular sequence. **/
    public static ArrayList<Integer> triangularNumberSequence(int terms)
    {
        ArrayList<Integer> sequence = new ArrayList<>();
        
        for (int i = 0; i < terms; i++)
        {
            
        }
        
        return sequence;
    }
    
    /** method to find all the factors of an input. **/
    public static int getFactors(int number)
    {
        int factorCount = 0;
        
        for (int i = 0; i < number; i++)
        {
            if (number % i == 0)
            {
                factorCount++;
            }
        }
        
        return factorCount;
    }
    
}
