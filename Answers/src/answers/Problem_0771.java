package answers;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Decide how many characters the string jewels shares with the string stones.
 * <p>
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * 
 * @author Jackson Splinter
 */
public class Problem_0771 
{
    /**
     * Returns how many characters the string jewels shares with the string stones.
     * <p>
     * First goes through the string jewels and put each unique character in a queue.
     * Then goes through each character in the string stones and if it is found in the queue
     * then answer goes up by 1.
     * <p>
     * O(m+n)
     * 
     * @param jewels    string of characters representing the jewels you have.
     * @param stones    string of characters representing the stones you have.
     * @return          the number of jewels you have that are also stones.
     */
    public static int numJewelsInStones(String jewels, String stones) 
    {
        Queue<Character> queue = new LinkedList<>();
        int ans = 0;
        for (char c : jewels.toCharArray()) 
        {
            if (!queue.contains(c)) 
            {
                queue.offer(c);
            }
        }
        for (char c : stones.toCharArray()) 
        {
            if (queue.contains(c)) 
            {
                ans++;
            }
        }
        return ans;   
    }   
}