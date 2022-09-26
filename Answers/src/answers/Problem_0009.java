package answers;

import java.util.ArrayList;

/*
 @author Jackson Splinter

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 */
public class Problem_0009 
{
    public static boolean isPalindrome(int x) 
    {
        String s = String.valueOf(x);
        ArrayList<Character> list = new ArrayList<>();
        if(x<0){return false;}
        else if(x<10){return true;}
        for(int i =0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        for(int j=0;j<s.length();j++)
        {
            if(list.remove(list.size()-1)!=s.charAt(j)){return false;}
        }
        return true;
    }
}
