package nonabundantsums;

import java.math.*;
import java.util.*;
import java.lang.*;

public class NonAbundantSums {

    public static void main(String[] args) {
        
        int sum = 0;
        ArrayList<Integer> numbers = getAbundantNumbersUpTo(1000000);
        
        for (int i = 0; i < firstAbundantSumNumber(numbers); i++)
        {
            sum += numbers.get(i);
        }
        
        System.out.print("Sum of all abundant numbers below the first sum of two abundant numbers is: " + sum + ".");
        
    }
    
    public static int firstAbundantSumNumber(ArrayList<Integer> otherAbundantNumbers)
    {
        int result = 0;
        
        for (int i = 0; i < otherAbundantNumbers.size(); i++)
        {
            for (int j = 0; j < otherAbundantNumbers.size(); j++)
            {
                if (isAbundant(otherAbundantNumbers.get(i) + otherAbundantNumbers.get(j)))
                {
                    result = otherAbundantNumbers.get(i) + otherAbundantNumbers.get(j);
                    return result;
                }
            }
        }
        
        return result;
    }
    
    public static ArrayList<Integer> getAbundantNumbersUpTo(int limit)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 12; i < limit; i++)
        {
            if (isAbundant(i)) numbers.add(i);
        }
        
        return numbers;
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
