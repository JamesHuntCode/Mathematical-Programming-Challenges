package circularprimes;

import java.lang.*;
import java.util.*;
import java.math.*;

public class CircularPrimes {

    /** Program to find all of the numbers below a certain amount which when rearranged, all combinations are prime. **/
    public static void main(String[] args) {
       
        int limit = 100;
        ArrayList<Integer> primes = getPrimes(10);
        
        ArrayList<Integer> circularPrimes = new ArrayList<>();
        
        // Get the circular primes.
        for (int i = 0; i < limit; i++)
        {
            if (allCombinationsArePrime(i))
            {
                circularPrimes.add(i);
            }
        }
        
        // Log the results.
        for (int i = 0; i < circularPrimes.size(); i++)
        {
            System.out.print(String.valueOf(circularPrimes.get(i)) + "\n");
        }
    }
    
    /** Method to check all combinations of a prime value to see if all combinations create prime numbers. **/
    public static boolean allCombinationsArePrime(int primeNumber)
    {
        for (int i = 0; i < String.valueOf(primeNumber).length(); i++)
        {
            if (String.valueOf(primeNumber).length() == 1)
            {
                return true;
            }
            else 
            {
                int[] combinations = switchDigits(primeNumber);
                
                for (int j = 0; j < combinations.length; j++)
                {
                    if (!isPrime(combinations[i])) return false;
                }
                
                return true;
            }
        }
        
        return true;
    }
    
    /* Method to return out a list of prime to an specified number of terms. **/
    public static ArrayList<Integer> getPrimes(int terms)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int i = 0; i < terms; i++)
        {
            if (isPrime(i))
            {
                primes.add(i);
            }
            else
            {
                terms++;
            }
        }
        
        return primes;
    }
    
    /** Method to return an array of the possible combinations of numbers based on the input prime number. **/
    public static int[] switchDigits(int primeNumber)
    {
        int[] possibleValues = new int[String.valueOf(primeNumber).length()];
        
        
        
        return possibleValues;
    }
    
    /** method to check if a specific value is prime or not. **/
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < (number - 1); i++)
        {
            if ((number % i == 0) && (number != 1)) return false;
        }
        
        return true;
    }
}
