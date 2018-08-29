package nonabundantsums;

import java.math.*;
import java.util.*;
import java.lang.*;

public class NonAbundantSums {

    public static void main(String[] args) {
        
        
        
    }
    
    public static int getSum(ArrayList<Integer> numbers)
    {
        int sum = 0;
        
        for (int i = 0; i < numbers.size(); i++)
        {
            sum += numbers.get(i);
        }
        
        return sum;
    }
    
    public static boolean isAbundant(int number)
    {
        ArrayList<Integer> divisors = getDivisorsOf(number);
        
        return getSum(divisors) > number;
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
