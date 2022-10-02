package answers;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * @author Jackson Splinter
 */
public class Problem_0003 
{    
    /**
     * Checks the string for the longest substring without repeating characters, returns the length of the 
     * longest substring found.
     * <p>
     * Sliding door approach, checks the string s and if a conflicting char is not found it is added to the queue
     * If a conflicting char is found it removes the left most char until the conflict is removed.
     * After each successful addition the queue length is compared to the max length.
     * <p>
     * O(n)
     * 
     * @param s String to be searched
     * @return  The length of the longest substring found, 0 if none found
     */
    public static int lengthOfLongestSubstring(String s)
    {
        Queue<Character> queue = new LinkedList<>();
        int ans = 0;
        for (char c : s.toCharArray()) //goes through every char c in the string s
        {
            while (queue.contains(c)) 
            {
                queue.poll(); // if the queue contains the character, delete characters from the left until
                              // until the duplicate is removed
            }
            queue.offer(c);
            if(queue.size()>ans)
            {
                ans = queue.size();
            }
        }
        return ans;
    }
}