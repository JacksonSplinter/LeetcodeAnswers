package answers;
/**
 * Return the number of strings in array words that are a prefix of the string s.
 * <p>
 *You are given a string array words and a string s,
 * where words[i] and s comprise only of lowercase English letters.
 * <p>
 * A prefix of a string is a substring that occurs at the beginning of the string.
 * A substring is a contiguous sequence of characters within a string.
 * @author Splinter
 */
public class Problem_2255 
{
    /**
     * Returns the number of strings in array words that are a prefix of the string s.
     * <p>
     * Goes through every string in array words and sees if it is a prefix of the string s,
     * if it is the program adds one to the answer count.
     * <p>
     * O(n)
     * 
     * @param words array of strings to test if they are prefixes
     * @param s     string to test
     * @return      the amount of strings found in the array words that are prefixes to the string s
     */
    public static int countPrefixes(String[] words, String s) 
    {
        int ans = 0;
        for (String w : words)
            if (s.startsWith(w))
                ans++;
        return ans;
    }
}