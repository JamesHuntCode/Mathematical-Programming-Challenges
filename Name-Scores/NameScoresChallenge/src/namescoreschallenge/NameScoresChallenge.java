package namescoreschallenge;

import java.lang.*;
import java.math.*;
import java.util.*;

public class NameScoresChallenge {
    
    public static void main(String[] args) {
        
        String name = "James";
        
        System.out.print(name + " has a letter score of " + getScoreForName(name));
                
    }
    
    public static int getScoreForName(String name)
    {
        return 1;
    }
    
    public static int getScoreFromLetter(String letter)
    {
        return 1;
    }
    
    public static String getAlphabet()
    {
        return "abcdefghijklmnopqrstuvwxyz";
    }
    
}
