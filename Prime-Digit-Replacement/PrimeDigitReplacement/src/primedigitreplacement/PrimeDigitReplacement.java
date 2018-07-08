package primedigitreplacement;

import java.math.*;
import java.util.*;
import java.lang.*;

public class PrimeDigitReplacement {

    /** program to find the first prime number that when you replace 'x' amount of digits, create another 'y' amount of prime numbers. **/
    public static void main(String[] args) {
        
        // Get list of primes.
        ArrayList<Integer> primeNumbers = getPrimes(10);
        
        for (int i = 0; i < primeNumbers.size(); i++)
        {
            System.out.print(primeNumbers.get(i) + "\n");
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
