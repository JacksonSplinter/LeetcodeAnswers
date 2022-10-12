package answers;
import java.util.Arrays;
/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * 
 * @author Jackson Splinter
 */
public class Problem_0014 
{
    /**
     * Finds and returns the longest common prefix in an array of strings.
     * <p>
     * First checks if the array is empty, if not empty it sorts the array.
     * After the array is sorted, it then checks the chars of the first and last string in the array.
     * it finds how many letters they share in the prefix. Then returns the common prefix.
     * <p>
     * O(n^2logn)
     * @param strs  Array of strings
     * @return      longest common prefixes of the strings provided, if there is none,
     *              returns <code>""</code>
     */
    public static String longestCommonPrefix(String[] strs) 
    {
        if(strs == null || strs.length == 0){return "";}
        int counter=0;
        Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++)
        {
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
            {
                counter++;
            }
            else break;
        }
        return counter==0 ? "" :strs[0].substring(0,counter);
    }
}
