package answers;

import java.util.LinkedList;
import java.util.Queue;

/*
 @author Jackson Splinter

 You're given strings jewels representing the types of stones that are jewels,
 and stones representing the stones you have. Each character in stones is a type of stone you have.
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class Problem_0771 {
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
