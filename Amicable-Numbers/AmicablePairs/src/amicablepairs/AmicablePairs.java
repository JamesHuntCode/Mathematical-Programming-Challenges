package amicablepairs;

import java.math.*;
import java.lang.*;
import java.util.*;

public class AmicablePairs {

    /** program to find amicable pairs - for example: if d(a) = b *AND* d(b) = a, then a and b are an amicable pair.  **/
    public static void main(String[] args) {
        
        // Find all of the amicable pairs below 'x'.
        
        
    }
    
    /** method to find all the proper divisors of the input and sum them. **/
    public static int getSumOfProperDivisors(int value)
    {
        int sum = value;
        
        for (int i = 1; i < value; i++)
        {
            if (value % i == 0) sum += i;
        }
        
        return sum;
    }
    
}
