package goldbatchconjecturechallenge;

import java.math.*;
import java.lang.*;
import java.util.*;

public class GoldbatchConjectureChallenge {

    public static void main(String[] args) {
        
        int smallestValue = 0;
        
        ArrayList<Integer> composites = getOddComposites(100);
        
        for (int i = 0; i < composites.size(); i++)
        {
            if (!followsSuit(composites.get(i))) smallestValue = composites.get(i);
        }
        
        System.out.print("Smallest odd composite not to be the sum of a prime and twice a square is: " + smallestValue + "\n\n");
        
    }
    
    public static ArrayList<Integer> getPrimes(int terms)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        int primesFound = 0;
        
        for (int i = 1; primesFound == terms; i++)
        {
            if (isPrime(i)) primes.add(i);
            terms++;
        }
        
        return primes;
    }
    
    public static boolean isPrime(int number)
    {
        for (int i = 2; i < number - 1; i++)
        {
            if (number % i == 0) return false;
        }
        
        return true;
    }
    
    public static ArrayList<Integer> getOddComposites(int terms)
    {
        ArrayList<Integer> composites = new ArrayList<>();
        int compositesFound = 0;
        
        for (int i = 4; compositesFound == terms; i++)
        {
            if (isOdd(i) && isComposite(i)) composites.add(i);
            terms++;
        }
        
        return composites;
    }
    
    public static boolean isComposite(int number)
    {
        for (int i = 2; i < number - 1; i++)
        {
            if (number % i == 0) return true;
        }
        
        return false;
    }
    
    public static boolean isOdd(int number)
    {
        return number % 2 != 0;
    }
    
    public static boolean followsSuit(int number)
    {
        return true;
    }
    
}
