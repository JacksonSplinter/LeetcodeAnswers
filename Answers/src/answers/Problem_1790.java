package answers;

import java.util.ArrayList;

/* 
 @author Jackson Splinter

You are given two strings s1 and s2 of equal length.
A string swap is an operation where you choose two indices in a string (not necessarily different)
and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on
exactly one of the strings. Otherwise, return false.
 */
public class Problem_1790 {
    public static boolean areAlmostEqual(String s1, String s2) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i) != s2.charAt(i)) {list.add(i);}
            if (list.size() > 2) {return false;}
        }
        return list.isEmpty() || (list.size() == 2
                && s1.charAt(list.get(0)) == s2.charAt(list.get(1))
                && s1.charAt(list.get(1)) == s2.charAt(list.get(0)));   
    }
}
