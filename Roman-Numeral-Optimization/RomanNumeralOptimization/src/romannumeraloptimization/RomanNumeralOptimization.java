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
        
        System.out.print("Primary Algorithm: \n\n");
        
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
        String formattedIOutput = "";
        String formattedVOutput = "";
        String finalFormattedString = "";
        
        int Icounter = 0;
        
        // Optimise the amount of 'I' characters.
        for (int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);
            
            if (currentChar == 'I')
            {
                Icounter++;
            }
            else 
            {
                formattedIOutput += currentChar;
            }
            
            if (Icounter == 5)
            {
                Icounter = 0;
                formattedIOutput += "V";
            }
            else if ((Icounter != 5) && (i == (input.length() - 1)))
            {
                for (int j = 0; j < Icounter; j++)
                {
                    formattedIOutput += "I";
                }
            }
            
        }
        
        int Vcounter = 0;
        
        // Optimise the amount of 'V' characters.
        for (int i = 0; i < formattedIOutput.length(); i++)
        {
            char currentChar = formattedIOutput.charAt(i);
            
            if (currentChar == 'V')
            {
                Vcounter++;
            }
            else 
            {
                formattedVOutput += currentChar;
            }
            
            if (Vcounter == 2)
            {
                Vcounter = 0;
                formattedVOutput += "X";
            }
            else if ((Vcounter != 2) && (i == (formattedIOutput.length() - 1)))
            {
                for (int j = 0; j < Vcounter; j++)
                {
                    formattedVOutput += "V";
                }
            }
        }
        
        int shiftQuantity = 0;
        
        /** shift all remaining 'I' characters to the end of the formatted string. **/
        for (int i = 0; i < formattedVOutput.length(); i++)
        {
            char currentChar = formattedVOutput.charAt(i);
            
            if ((currentChar == 'I') && (i != (formattedVOutput.length() - 1)))
            {
                shiftQuantity++;
                
            }
            else 
            {
                finalFormattedString += currentChar;
            }
            
            if (i == (formattedVOutput.length() - 1))
            {
                for (int j = 0; j < shiftQuantity; j++)
                {
                    finalFormattedString += "I";
                }
            }
        }
        
        return finalFormattedString;
    }
}
