package sumofmultiples;

import java.util.ArrayList;

/** program to find all multiples of 3 or 5 below 1000 then find the result of adding them all together. **/
public class SumOfMultiples {

    public static void main(String[] args) {
        
        // Calculate sum of all multiples.
        long sumOfMultiples = sumMultiples(getMultiplesOf(3, 5, 1000));
        
        // Log result.
        System.out.print("\nThe sum of multiples of 3 and 5 below 1000 is " + sumOfMultiples + ".\n\n");
    }
    
    /** method to return the multiples of x or y below the limit . **/
    public static ArrayList<Integer> getMultiplesOf(int firstMultiple, int secondMultiple, int limit)
    {
        ArrayList<Integer> allMultiples = new ArrayList<>();
        
        for (int i = 0; i < limit; i++)
        {
            if ((i % firstMultiple == 0) || (i % secondMultiple == 0)) allMultiples.add(i);
        }
        
        return allMultiples;
    }
    
    /** method to return sum of all values inside array-list passed in. **/
    public static long sumMultiples(ArrayList<Integer> allMultiples)
    {
        long sum = 0;
        
        for (int i = 0; i < allMultiples.size(); i++)
        {
            sum += allMultiples.get(i);
        }
        
        return sum;
    }
}
