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
        
        System.out.print("Smallest odd composite not to be the sum of a prime and twice a square is: " + smallestValue);
        
    }
    
    public static ArrayList<Integer> getPrimes(int terms)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        
        
        
        return primes;
    }
    
    
    public static ArrayList<Integer> getOddComposites(int terms)
    {
        ArrayList<Integer> composites = new ArrayList<>();
        
        
        
        return composites;
    }
    
    public static boolean followsSuit(int number)
    {
        return true;
    }
    
}
