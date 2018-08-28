package namescoreschallenge;

import java.lang.*;
import java.math.*;
import java.util.*;

public class NameScoresChallenge {
    
    public static void main(String[] args) {
        
        String name = "example";
        
        System.out.print(name + " has a letter score of " + getScoreForName(name) + "\n\n");
                
    }
    
    public static int getScoreForName(String name)
    {
        int total = 0;
        
        for (int i = 0; i < name.length(); i++)
        {
            total += getScoreFromLetter(Character.toString((name.charAt(i))));
        }
        
        return total;
    }
    
    public static int getScoreFromLetter(String letter)
    {
        int index = 0;
        String alphabet = getAlphabet();
        
        for (int i = 0; i < alphabet.length(); i++)
        {
            if (letter.equals(Character.toString(alphabet.charAt(i))))
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static String getAlphabet()
    {
        return "abcdefghijklmnopqrstuvwxyz";
    }
    
}
