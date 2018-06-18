package largestproductfromseries;

import java.lang.*;

/** program to locate the 'x' number of digits from a sequence that produce the largest product. **/
public class LargestProductFromSeries {

    public static void main(String[] args) {
        
        // Log the largest product made from 'x' amount of digits of the sequence.
        long greatestProduct = getLargestProduct(getSequence(), 4);
        
        System.out.print("\nThe largest product of sequence made from " + 4 + " of adjacent digits is " + greatestProduct + ".\n\n.");
        
    }
    
    /** method to return the sequence being analysed for the largest product of its digits. **/
    public static String getSequence()
    {
        return "73167176531330624919225119674426574742355349194934" +
            "96983520312774506326239578318016984801869478851843" +
            "85861560789112949495459501737958331952853208805511" +
            "12540698747158523863050715693290963295227443043557" +
            "66896648950445244523161731856403098711121722383113" +
            "62229893423380308135336276614282806444486645238749" +
            "30358907296290491560440772390713810515859307960866" +
            "70172427121883998797908792274921901699720888093776" +
            "65727333001053367881220235421809751254540594752243" +
            "52584907711670556013604839586446706324415722155397" +
            "53697817977846174064955149290862569321978468622482" +
            "83972241375657056057490261407972968652414535100474" +
            "82166370484403199890008895243450658541227588666881" +
            "16427171479924442928230863465674813919123162824586" +
            "17866458359124566529476545682848912883142607690042" +
            "24219022671055626321111109370544217506941658960408" +
            "07198403850962455444362981230987879927244284909188" +
            "84580156166097919133875499200524063689912560717606" +
            "05886116467109405077541002256983155200055935729725" +
            "71636269561882670428252483600823257530420752963450";
    }
    
    /** method to iterate the sequence and calculate the largest product. **/
    public static long getLargestProduct(String sequence, int adjacentDigits)
    {
        long largestProduct = 0;
        
        for (int i = 0; i < sequence.length() && i <= sequence.length() - adjacentDigits; i++)
        {
            long[] tempLargestProduct = new long[adjacentDigits];
            int tempIndex = 0;
            
            for (int j = i; j < i + (adjacentDigits); j++)
            {
                tempLargestProduct[tempIndex] = Integer.parseInt(Character.toString(sequence.charAt(j)));
                tempIndex++;        
            }
            
            long tempSum = tempLargestProduct[0];
            
            for (int j = 1; j < tempLargestProduct.length; j++)
            {
                tempSum *= tempLargestProduct[j];
            }
            
            if (tempSum > largestProduct)
            {
                largestProduct = tempSum;
            }
        }
        
        return largestProduct;
    }
}
