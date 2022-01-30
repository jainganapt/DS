package strigQn;

import java.util.HashSet;
import java.util.Set;
 
public class Permutation 
{
    public static void main(String[] args) 
    {
        System.out.println(getPermutations("ABC")); 
 
        //Prints
        //[ACB, BCA, ABC, CBA, BAC, CAB]
    }
 
    public static Set<String> getPermutations(String string) 
    {
        //All permutations
        Set<String> permutationsSet = new HashSet<String>();
         
        // invalid strings
        if (string == null || string.length() == 0) 
        {
            permutationsSet.add("");
        } 
        else
        {
            //First character in String
            char initial = string.charAt(0); 
             
            System.out.println("initial"+initial);
            
            //Full string without first character
            String rem = string.substring(1); 
            
            System.out.println("rem"+rem);
            
            //Recursive call
            Set<String> wordSet = getPermutations(rem);
            
            for(String s:wordSet)
            {
            	System.out.println("wordSet"+s);
            }
            
            for (String word : wordSet) {
                for (int i = 0; i <= word.length(); i++) {
                    permutationsSet.add(charInsertAt(word, initial, i));
                }
            }
        }
        return permutationsSet;
    }
 
    public static String charInsertAt(String str, char c, int position) 
    {
    	System.out.println("charInsertAt:->"+str+"->:"+c+"->:"+"->:"+position);
        String begin = str.substring(0, position);
        String end = str.substring(position);
        System.out.println("begin:->"+begin+"->:"+end+"->"+c);
        return begin + c + end;
    }
}

