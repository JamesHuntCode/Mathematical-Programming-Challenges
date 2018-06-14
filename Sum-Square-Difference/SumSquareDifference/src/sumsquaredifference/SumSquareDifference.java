package sumsquaredifference;

public class SumSquareDifference {

    /** program to take the sum of a sequence where each element is squared, then square the entire sequence and find the difference. **/
    public static void main(String[] args) {
        
        // Create sequence.
        int[] mySequence = createSequence(0, 10);
    }
    
    /** method to create a linear sequence of integers. **/
    public static int[] createSequence(int start, int end)
    {
        int[] sequence = new int[end];
        
        for (int i = start; i < end; i++)
        {
            sequence[i] = (i * i);
        }
            
        return sequence;
    }
    
    /** method to iterate over a sequence, square each element and return the sum of all elements. **/
    public static long getSquareSum(int[] sequence)
    {
        long sum = 0;
        
        for (int i = 0; i < sequence.length; i++)
        {
            sum += (sequence[i] * sequence[i]);
        }
        
        return sum;
    }
    
    /* method to take an array and square the sum of all elements. **/
    public static long squareElementSum(int[] elements)
    {
        long elementSum = 0;
        
        for (int i = 0; i < elements.length; i++)
        {
            elementSum += elements[i];
        }
        
        return (elementSum * elementSum);
    }
    
    /** method to return the difference between two numerical values **/
    public static long getDifference(long largerValue, long smallerValue)
    {
        return (largerValue - smallerValue);
    }
    
}
