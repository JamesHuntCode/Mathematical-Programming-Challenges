package permutedmultiples;

import java.lang.*;
import java.math.*;
import java.util.*;

/** program to find the smallest integer where x contains the same digits as 2x, 3x, 4x, 5x & 6x. **/
public class PermutedMultiples {

    public static void main(String[] args) {
        
//        int limit = 10000000;
//        int xValue = 2;
//        int smallestX = 0;
        
//        for (int i = 1; i < limit; i++)
//        {
//            ArrayList<Integer> integerValues = breakIntegerIntoArrayList(i);
//            int incrementCounter = 1;
//            
//            for (int j = 1; j < xValue; j++)
//            {
//                ArrayList<Integer> currentLoopIntegerValues = breakIntegerIntoArrayList(j * i);
//                
//                if (incrementCounter < 6)
//                {
//                    if (containTheSameValues(integerValues, currentLoopIntegerValues))
//                    {
//                        incrementCounter++;
//                    }
//                    else 
//                    {
//                        incrementCounter = 0;
//                        break;
//                    }
//                }
//                else 
//                {
//                    smallestX = i;
//                }
//            }
//        }
    
        int limit = 1000000;
        int smallest = 1;
        
        for (int i = 1; i < limit; i++)
        {
            ArrayList<Integer> firstArray = breakIntegerIntoArrayList(i);
            ArrayList<Integer> secondArray = breakIntegerIntoArrayList(i * 2);
            
            if (containTheSameValues(firstArray, secondArray))
            {
                break;
            }
            else 
            {
                smallest++;
            }
        }
        
        System.out.print("The value we are looking for is: " + smallest + "\n\n\n\n\n");
        
    }
    
    /** method to take an integer of x length and return it broken down into individual digits. **/
    public static ArrayList<Integer> breakIntegerIntoArrayList(int value)
    {
        ArrayList<Integer> breakdown = new ArrayList<>();
        
        String stringValueOfInteger = String.valueOf(value);
        
        for (int i = 0; i < stringValueOfInteger.length(); i++)
        {
            breakdown.add(Integer.parseInt(Character.toString(stringValueOfInteger.charAt(i))));
        }
        
        return breakdown;
    }
    
    /** method to compare values inside two array lists. **/
    public static boolean containTheSameValues(ArrayList<Integer> compareMe, ArrayList<Integer> againstMe)
    {
        for (int i = 0; i < compareMe.size(); i++)
        {
            // come back here and write comparison algorithm...
        }
        
        return true;
    }
}
