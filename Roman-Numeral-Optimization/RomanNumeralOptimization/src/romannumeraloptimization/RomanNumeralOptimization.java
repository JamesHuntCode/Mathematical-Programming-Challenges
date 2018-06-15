package romannumeraloptimization;

import java.lang.*;

/** program to optimise the number of Roman numerals used to express numerical values. **/
/* for example... 'IIIII' is valid, however 'V' in this situation is better. **/
public class RomanNumeralOptimization {
    
    public static void main(String[] args) {
        
        // Create some demo strings that need to be optimised.  
        String demoInput1 = "IIIII"; // 5.
        String demoInput2 = "IIIIII"; // 6.
        String demoInput3 = "VIIIII"; // 10.
        String demoInput4 = "IIIIIV"; // 10.
        String demoInput5 = "IIIIIVVV"; // 20.
        String demoInput6= "VVVV"; // 20.
        
        // Optimise all inputs and output new answers.
        System.out.print(optimise(demoInput1) + "\n\n");
        System.out.print(optimise(demoInput2) + "\n\n");
        System.out.print(optimise(demoInput3) + "\n\n");
        System.out.print(optimise(demoInput4) + "\n\n");
        System.out.print(optimise(demoInput5) + "\n\n");
        System.out.print(optimise(demoInput6) + "\n\n");
        
    }
    
    /** method to minimise the number of characters needed to represent a Roman numeral string. **/
    /** this method implements my own algorithm with NO other functional dependencies such as ".contains()" etc. **/
    public static String optimise(String input)
    {
        String formattedOutput = "";
        
        // Optimise the amount of 'I' characters.
        for (int i = 0; i < input.length(); i++)
        {
            
        }
        
        // Optimise the amount of 'V' characters.
        for (int i = 0; i < input.length(); i++)
        {
            
        }
        
        return formattedOutput;
    }
    
    /** method to minimise the number of characters needed to represent a Roman numeral string. **/
    /** this method is still my own algorithm, however it DOES includes functional dependencies including ".contains()" etc. **/
    public static String optimiseAltVersion(String input)
    {
        String formattedInput = "";
        
        
        
        return formattedInput;
    }
}
