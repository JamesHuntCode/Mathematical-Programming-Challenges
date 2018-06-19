package softwaretimeeffortcalculator;

import java.lang.*;

/** program to perform time & effort calculations in regards to the development of a software project **/
public class SoftwareTimeEffortCalculator {

    public static void main(String[] args) {
        
        // How complex is the software project?
        double simple = 2.4, simplePower = 1.05;
        double fairlyComplex = 3.0, fairlyComplexPower = 1.12;
        double complex = 3.6, complexPower = 1.20;
        
        // Set the project complexity & the power to which it needs to raised to a selection from the above.
        double projectComplexity = fairlyComplex;
        double projectComplexityPower = fairlyComplexPower;
        
        // Calculate the PM (person months) needed for the project based upon KLOC (1000's of lines of code).
        // Formula: PM = projectComplexity * (KLOC^(projectComplexityPower)).
        double KLOC = 30;       
        double calculatedKlocRaisedToPower = Math.pow(KLOC, projectComplexityPower);
        double PM = projectComplexity * calculatedKlocRaisedToPower;
        
        // Calculate the TDEV (time deviation) to return a number of months needed for the software project.
        double PmPower = 0.33;
        double calculatedPmRaisedToPower = Math.pow(PM, PmPower);
        double TDEV = (3 * calculatedPmRaisedToPower);
        
        // We can shorten the development process if cost is not an issue.
        // However, realistically, development can only be shortened by about 25%.
        double compressionAmount = 0.75;
        double compressedTDEV = Math.round((compressionAmount * TDEV));
        
        // Log results.
        System.out.print("\nThe time needed for a software project with " + KLOC + " thousand lines of code is on average " + Math.round(compressedTDEV) + " months.\n\n");
        
    }
    
}
