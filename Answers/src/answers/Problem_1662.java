package answers;
import java.util.Arrays;
/**
 * Given two string arrays word1 and word2,
 * return <code>true</code> if the two arrays represent the same string, and <code>false</code> otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * 
 * @author Jackson Splinter
 */
public class Problem_1662 
{
    /**
     * Checks if two String Arrays represent the same string.
     * <p>
     * Goes through both arrays and turns them into one string. Then compares the true strings and
     * returns the boolean value.
     * <p>
     * O(2n)
     * 
     * @param word1 Array of Strings 1
     * @param word2 Array of Strings 2
     * @return      <code>true</code> if the two arrays represent the same string, and <code>false</code> otherwise.
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str = String.join("", word1);
        String str2 = String.join("", word2);
        return str.equals(str2);
    }
}