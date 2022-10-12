package answers;
import java.util.HashMap;
/**
 * You are given an array of strings words (0-indexed).
 * <p>
 * In one operation, pick two distinct indices i and j, where words[i] is a non-empty string,
 * and move any character from words[i] to any position in words[j].
 * <p>
 * Return <code>true</code> if you can make every string in words equal using any number of operations,
 * and <code>false</code> otherwise.
 * 
 * @author jackson
 */
public class Problem_1897 
{
    /**
     * Returns <code>true</code> if you can make every string in the array words equal using any
     * number of operations, and <code>false</code> otherwise.
     * <p>
     * Goes through every word and adds every character and their frequency to a hashmap.
     * then goes through the hashmap and makes sure the frequency of every character can be evenly divided
     * by the total number of words in the array. If it cant then it returns <code>false</code>,
     * if the whole hashmap is traversed without problem then it returns <code>true</code>.
     * <p>
     * O(n^2+n)
     * 
     * @param words Array of words
     * @return      <code>true</code> if you can make every word in the array equal, <code>false</code>
     *              if not
     */
    public static boolean makeEqual(String[] words) 
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(String word:words)
        {
            for(int i=0;i<word.length();i++)
            {
                if(map.containsKey(word.charAt(i)))
                {
                    map.put(word.charAt(i),map.get(word.charAt(i)) + 1);
                }
                else
                {
                    map.put(word.charAt(i), 1);
                }
            }
        }
        for(char c : map.keySet())
        {
            if(map.get(c)%words.length!=0)
            {
                return false;
            }
        }
        return true;
    }
}
