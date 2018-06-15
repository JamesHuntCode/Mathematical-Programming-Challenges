package romannumeraloptimization;

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
    public static String optimise(String input)
    {
        String formattedOutput = "";
        
        
        
        return formattedOutput;
    }
    
}
