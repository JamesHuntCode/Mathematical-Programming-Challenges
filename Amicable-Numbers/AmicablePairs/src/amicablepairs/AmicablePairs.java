package amicablepairs;

import java.math.*;
import java.lang.*;
import java.util.*;

public class AmicablePairs {

    /** program to find amicable pairs - for example: if d(a) = b *AND* d(b) = a, then a and b are an amicable pair.  **/
    public static void main(String[] args) {
        
        // Find all of the amicable pairs below 'x'.
        int limit = 10000;
        ArrayList<int[]> amicablePairs = new ArrayList<>();
        
        for (int i = 2; i < limit; i++)
        {
            int firstValue = getSumOfProperDivisors(i);
            int secondValue = getSumOfProperDivisors(firstValue);
            
            int[] pair = new int[2];
            
            if ((secondValue == i) && (i != firstValue))
            {
                pair[0] = firstValue;
                pair[1] = secondValue;
                amicablePairs.add(pair);
            }
        }
        
        // Log the result.
        System.out.print("The amicable pairs below our limit are...\n\n");
        
        for (int i = 0; i < amicablePairs.size(); i++)
        {
            for (int j = 0; j < amicablePairs.get(i).length; j++)
            {
                System.out.print(amicablePairs.get(i)[j] + " ");
            }
            
            System.out.print("\n");
        }
        
        // Get the sum of the divisors.
        long factorSum = 0;
        
        for (int i = 0; i < amicablePairs.size(); i++)
        {
            for (int j = 0; j < amicablePairs.get(i).length; j++)
            {
                factorSum += getSumOfProperDivisors(amicablePairs.get(i)[j]);
            }
        }
        
        System.out.print("\nThe sum of the divisors of these values are " + factorSum + ".\n\n");
        
    }
    
    /** method to find all the proper divisors of the input and sum them. **/
    public static int getSumOfProperDivisors(int value)
    {
        int sum = 0;
        
        for (int i = 1; i < value; i++)
        {
            if (value % i == 0) sum += i;
        }
        
        return sum;
    }
    
}
