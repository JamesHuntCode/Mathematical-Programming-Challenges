package derivativecalculator;

import java.lang.*;
import java.math.*;

/** program to implement the power rule to calculate the derivative of a function **/
public class DerivativeCalculator {

    public static void main(String[] args) {
        
        // Log the derivative.
        // Poor example... I know. (I had issues splitting the string at the '^' character...
        String function = "f of x tothe 2";
        
        System.out.print("The derivative of the function " + "f(x^2)" + " is " + getDerivativeOf(function) + ".\n\n");
        
    }
    
    /** method to apply the power rule to the equation **/
    public static String getDerivativeOf(String inputFunction)
    {
        // For this function we use the power rule.
        // This rule dictates that d(x^n)/dx = nx^n-1.
        double power = Double.parseDouble(inputFunction.split("tothe ")[1]);
        
        // Construct & return result.
        String derivative = Math.round(power) + "x^" + Math.round((power - 1));
        return derivative;
    }
    
}
