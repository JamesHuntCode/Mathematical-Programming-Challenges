package derivativecalculator;

import java.lang.*;
import java.math.*;

/** program to implement the power rule to calculate the derivative of a function **/
public class DerivativeCalculator {

    public static void main(String[] args) {
        
        // Log the derivative.
        // Poor example... I know. (I had issues splitting the string at the '^' character...
        String function = "f of x tothe 2";
        
        System.out.print("The derivative of the function " + "f(x^2)" + " is " + getDerivativeOf(function, "none") + ".\n\n");
        
    }
    
    /** method to calculate the derivate of the function passed in (an action must be passed also, for example; addition, division etc) **/
    public static String getDerivativeOf(String inputFunction, String action)
    {
        if (action.equals("none"))
        {
            double power = Double.parseDouble(inputFunction.split("tothe ")[1]);

            String derivative = Math.round(power) + "x^" + Math.round((power - 1));
            return derivative;
        }
        
        else if  (action.equals("addition"))
        {
            String derivative = "";
            
            
            
            return derivative;
        }
        
        else if (action.equals("multiplication"))
        {
            String derivative = "";
            
            
            
            return derivative;
        }
        
        else 
        {
            return "Not implemented yet.";
        }
    }
    
}
