package answers;
/**
 * You are given a 0-indexed string s that has lowercase English letters in its even indices
 * and digits in its odd indices.
 * <p>
 * There is a function shift(c, x), where c is a character and x is a digit,
 * that returns the xth character after c.
 * <p>
 * For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
 * For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
 * <p>
 * Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
 * 
 * @author jackson
 */
public class Problem_1844 
{
    /**
     * Replaces all numbers in a string with letters.
     * <p>
     * Goes through the string and when it encounters a number it shifts the previous letter by the number.
     * <p>
     * O(n)
     * 
     * @param s String where even numbers are characters and odd are numbers.
     * @return  String where all characters are letters
     */
    public static String replaceDigits(String s) 
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                ans+=s.charAt(i);
            }
            else
            {
               char c = (char) (s.charAt(i-1)+(s.charAt(i)-48));
               if(c>122) // if a character is above z it sends it back down to a
               {
                   c-=26;
               }
               ans+=c;
            }
        }
        return ans;
    }
}