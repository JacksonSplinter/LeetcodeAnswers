package answers;
import java.util.ArrayList;
/**
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 * 
 * @author Jackson Splinter
 */
public class Problem_0009 
{
    /**
     * Checks a number for a palindrome returns <code>true</code> if the number is a palindrome,
     * <code>false</code> if it is not.
     * <p>
     * First deals with cases of if a number is negative, which makes it not a palindrome.
     * If a number is only one digit it is a palindrome. Then it goes through the number 
     * and adds each digit to an array. After that process, it goes through the array,
     * which is the number backwards and compares the numbers digit by digit.
     * if one digit does not match it returns false. If all numbers match it is true.
     * <p>
     * O(2n)
     * 
     * @param x number to be tested.
     * @return  <code>true</code> if the number is a palindrome, <code>false</code> if it is not.
     */
    public static boolean isPalindrome(int x) 
    {
        String s = String.valueOf(x);
        ArrayList<Character> list = new ArrayList<>();
        if(x<0){return false;} // if a number is negative its not a palindrome
        else if(x<10){return true;} // if a number is a single digit it is a palindrome
        for(int i =0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        for(int j=0;j<s.length();j++)
        {
            if(list.remove(list.size()-1)!=s.charAt(j)){return false;} // if there is a difference between
                                                                       // the list and the string it is not a plaindrome
        }
        return true;
    }
}