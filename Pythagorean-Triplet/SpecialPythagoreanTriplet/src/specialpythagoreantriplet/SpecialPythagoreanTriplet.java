package specialpythagoreantriplet;

import java.math.*;
import java.util.*;

/** program to determine what three numbers when squared produce a desired number. **/
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
       
       // Log the product of the pythagorean triplet of 1000.
       int product = getProductOfTriplet(findPythagoreanTriplet(25));
       System.out.print("The sum of the pythagorean triplet of the input is " + product + ".\n\n"); 
       
    }
    
    /** method to find the values that when squared (and summed), equal the input value of the function. **/
    public static ArrayList<Integer> findPythagoreanTriplet(int input)
    {
        ArrayList<Integer> values = new ArrayList<>();
        
        for (int i = 0; i < input; i++)
        {
            for (int j = 0; j < input; j++)
            {
                for (int k = 0; k < input; k++)
                {
                    
                }
            }
        }
        
        return values;
    }
    
    /** method to get product of values passed in via the array-list. **/
    public static int getProductOfTriplet(ArrayList<Integer> tripletValues)
    {
        int product = 0;
        
        for (int i = 0; i < tripletValues.size(); i++)
        {
            product += tripletValues.get(i);
        }
        
        return product;
    }
    
}
