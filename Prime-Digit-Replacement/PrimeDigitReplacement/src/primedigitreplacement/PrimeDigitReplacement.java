package primedigitreplacement;

import java.math.*;
import java.util.*;
import java.lang.*;

public class PrimeDigitReplacement {

    /** program to find the first prime number that when you replace 'x' amount of digits, create another 'y' amount of prime numbers. **/
    public static void main(String[] args) {
        
        // Get list of primes.
        ArrayList<Integer> primeNumbers = getPrimes(100);
        
//        for (int i = 0; i < primeNumbers.size(); i++)
//        {
//            System.out.print(primeNumbers.get(i) + "\n");
//        }
        
        replaceDigitsAndGetPrimeCount(10);
        
    }
    
    /** method to swap digits of a prime number and return the number of primes that can be created. **/
    /** for example, let n = *3. * = 1 -> 9. if *3 is prime, increment the return value. **/ 
    public static int replaceDigitsAndGetPrimeCount(int primeNumber)
    {
        if (String.valueOf(primeNumber).length() > 1)
        {
            int primeCount = 0;
            int numberLength = String.valueOf(primeNumber).length();

            for (int i = 0; i < numberLength; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    // come back here...
                    // split int into int array of digits, replace integer in array at index i with j and check if prime - repeat for all indexes in int array.
                }
            }

            return primeCount;
        }
        else 
        {
            return -1;
        }
    }
    
    /** method to calculate the prime numbers up until the specified limit. **/
    public static ArrayList<Integer> getPrimes(int limit)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i < limit; i++)
        {
            if (isPrime(i)) primes.add(i);
        }
        
        return primes;
    }
    
    /** method to check if the input value is prime. **/
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0) return false;
        }
        
        return true;
    }
    
}
