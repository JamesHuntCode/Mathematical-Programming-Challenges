package largestpalindromeproduct;

import java.lang.*;
import java.math.*;

/** program to find the largest number that can be made from 'x' digits when multiplied to produce the number that reads the same, even when reversed. **/
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        
        // Log the result.
        System.out.print("The largest palindrome product that can be made from 3 digits is " + getLargestPalindromeProduct(99) + ".\n\n");
        
    }
    
    /** method to calculate the largest palindrome product. **/
    public static int getLargestPalindromeProduct(int digitLimit)
    {
        int largestValue = 0;
        
        for (int i = 2; i < (digitLimit + 1); i++)
        {
            for (int j = 2; j < (digitLimit + 1); j++)
            {
                
                // Numerical values.
                int integerValue = (i * j);
                String stringValue = String.valueOf(integerValue);
                
                // Subtrings.
                String firstHalf = stringValue.substring(0, stringValue.length() / 2);
                String secondHalf = stringValue.substring(stringValue.length() / 2);
                
                if (((integerValue) > largestValue) && (stringValue.length() % 2 == 0) && (firstHalf.equals(new StringBuffer(secondHalf).reverse().toString())))
                {
                    largestValue = integerValue;
                }
            }
        }
        
        return largestValue;
    }
    
}
