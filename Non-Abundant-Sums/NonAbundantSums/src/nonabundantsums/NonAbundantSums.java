package nonabundantsums;

import java.math.*;
import java.util.*;
import java.lang.*;

public class NonAbundantSums {

    public static void main(String[] args) {
        
        
        
    }
    
    public static int getSumOfAbundants(ArrayList<Integer> numbers)
    {
        return 1;
    }
    
    public static boolean isAbundant(int number)
    {
        return true;
    }
    
    public static ArrayList<Integer> getDivisorsOf(int number)
    {
        ArrayList<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
    
}
