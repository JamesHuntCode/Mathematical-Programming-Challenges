package recursivefactorialcalculator;

public class RecursiveFactorialCalculator {

    /** program to calculate the factorial value of the number passed in. **/
    public static void main(String[] args) {
       
        // Log the reesut.
        System.out.print("The factorial value of 5 is " + getFactorialOf(5) + ".\n\n");
        
    }
    
    /** method to calculate and return the factorial. **/
    /** recursive factorial formula = n! = n * (n - 1)! **/
    public static long getFactorialOf(int n)
    {
        
        if (n  == 0)
        {
            return 1;
        }
        else 
        {
            return n * getFactorialOf(n - 1);
        }
        
    }
    
}
