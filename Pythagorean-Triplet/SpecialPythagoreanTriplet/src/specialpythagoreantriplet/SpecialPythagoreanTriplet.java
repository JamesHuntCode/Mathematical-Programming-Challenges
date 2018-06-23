package specialpythagoreantriplet;

import java.math.*;
import java.util.*;

/** program to determine what three numbers when squared produce a desired number. **/
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
       
       // Log the product of the pythagorean triplet of 1000.
       int product = getProductOfTriplet(findPythagoreanTriplet(1000));
       System.out.print("The sum of the pythagorean triplet of the input is " + product + ".\n\n"); 
       
    }
    
    /** method to find the values that when squared (and summed), equal the input value of the function. **/
    public static ArrayList<Integer> findPythagoreanTriplet(int input)
    {
        ArrayList<Integer> values = new ArrayList<>();
        
        for (int i = 2; i < input; i++)
        {
            for (int j = 2; j < input; j++)
            {
                if (Math.pow(i, 2) + Math.pow(j, 2) + (int)(Math.pow(i, 2) + Math.pow(j, 2)) == input)
                {
                    // Add factors.
                    values.add(i);
                    values.add(j);
                    
                    // Add sum.
                    int sum = (int)(Math.pow(i, 2) + Math.pow(j, 2));
                    values.add(sum);
                    
                    // Break loop.
                    break;
                }
            }
        }
        
        return values;
    }
    
    /** method to get product of values passed in via the array-list. **/
    public static int getProductOfTriplet(ArrayList<Integer> tripletValues)
    {
        int product = tripletValues.get(0);
        
        for (int i = 1; i < tripletValues.size(); i++)
        {
            product *= tripletValues.get(i);
        }
        
        System.out.print("Triplet consists of; " + tripletValues.get(0) + " " + tripletValues.get(1) + " " + tripletValues.get(2) + ".\n\n");
        
        return product;
    }
    
}
