package answers;
import java.util.ArrayList;
/**
 * You are given two strings s1 and s2 of equal length, 
 * return <code>true</code> if it is possible to make both strings equal by performing at most one string swap on
 * exactly one of the strings, otherwise, return <code>false</code>.
 * <p>
 * A string swap is an operation where you choose two indices in a string (not necessarily different)
 * and swap the characters at these indices.
 * 
 * @author Jackson Splinter
 */
public class Problem_1790 
{
    /**
     * Takes two arrays and returns <code>true</code> if the strings can be made equal after one swap,
     * <code>false</code> otherwise.
     * <p>
     * First goes through each array and adds the location of each character that does not match on both strings
     * to a linked list. If the size of the linked list is bigger than 2 than the program automatically
     * returns <code>false</code>. Then returns <code>true</code> if the list is empty, or the list is of size 2
     * and the two characters can be properly swapped with each other.
     * <p>
     * O(n)
     * 
     * @param s1    string 1 to be compared
     * @param s2    string 2 to be compared
     * @return      <code>true</code> if the strings can be made equal after one swap,
     * <code>false</code> otherwise
     */
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