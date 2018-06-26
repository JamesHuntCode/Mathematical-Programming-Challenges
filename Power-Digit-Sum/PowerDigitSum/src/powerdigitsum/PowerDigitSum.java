package powerdigitsum;

import java.math.*;

public class PowerDigitSum {

    /** program to take a number raised to a power then sum the digits of the number. **/
    public static void main(String[] args) {
        
        //Log the result of 'x' raised to 'y'.
        System.out.print("The sum of the digits of 25 raised to the power 5 is " + sumDigits(Math.round(Math.pow(25, 5))) + ".\n\n");
        
    }
    
    /** method to sum the individual digits of a number. **/
    public static long sumDigits(long number)
    {
        long sum = 0;
        
        for (int i = 0; i < String.valueOf(number).length(); i++)
        {
            sum += Long.parseLong(Character.toString(String.valueOf(number).charAt(i)));
        }
        
        return sum;
    }

}
