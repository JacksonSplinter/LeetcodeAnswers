package answers;

import java.util.LinkedList;
import java.util.Queue;

/*
@author Jackson Splinter
Given a string s, find the length of the longest substring without repeating characters.
*/
public class Problem_3 
{    
// Sliding door approach, checks the string s and if a conflicting char is not found it is added to the queue
// If a conlficting char is found it removes the left most char until the conflict is removed.
// After each succesful addition the queue length is compaired to the max length.
    
    public static int lengthOfLongestSubstring(String s)
    {
        Queue<Character> queue = new LinkedList<>();
        int ans = 0;
        for (char c : s.toCharArray()) 
        {
            while (queue.contains(c)) 
            {
                queue.poll();
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