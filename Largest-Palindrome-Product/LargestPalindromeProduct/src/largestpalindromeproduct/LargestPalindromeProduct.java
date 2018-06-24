package largestpalindromeproduct;

import java.lang.*;
import java.math.*;

/** program to find the largest number that can be made from 'x' digits when multiplied to produce the number that reads the same, even when reversed. **/
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        
        System.out.print("The largest palindrome product that can be made from 3 digits is " + getLargestPalindromeProduct(99) + ".\n\n");
        
    }
    
    /** method to calculate the largest palindrome product. **/
    public static int getLargestPalindromeProduct(int digitLimit)
    {
        int largestValue = 0;
        
        for (int i = 2; i < digitLimit; i++)
        {
            for (int j = 2; j < digitLimit; j++)
            {
                
                int integerValue = (i * j);
                String stringValue = String.valueOf(integerValue);
                
                if (((i * j) > largestValue) && (stringValue.length() % 2 == 0) && (stringValue.substring(0, stringValue.length() / 2).equals(stringValue.substring(stringValue.length() / 2, stringValue.length()))))
                {
                    largestValue = (i * j);
                }
            }
        }
        
        return largestValue;
    }
    
}
