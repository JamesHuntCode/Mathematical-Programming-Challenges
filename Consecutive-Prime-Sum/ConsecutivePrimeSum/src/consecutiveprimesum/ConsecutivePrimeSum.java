package consecutiveprimesum;

import java.math.*;
import java.util.*;
import java.lang.*;

public class ConsecutivePrimeSum {

   /** program to find the largest prime number made only from other prime numbers (below a certain threshold. **/
    public static void main(String[] args) {
        
        // Locate and log the result.
        int largestPrimeSum = 0;
        
        for (int i = 0; i < 100; i ++)
        {
            for (int j = 0; j < 100; j++)
            {
                if ((isPrime(i)) && (isPrime(j)) && (isPrime(i + j)))
                {
                    largestPrimeSum = (i + j);
                }
            }
        }
        
        // Print result.
        System.out.print("The largest prime made from two other primes below 100 is " + largestPrimeSum + ".\n\n");
        
    }
    
    /** method to detect if the number passed into the method is a prime number. **/
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
}
