package answers;
import java.util.List;
import java.util.ArrayList;
/**
 * Return an array of the most visited sectors sorted in ascending order.
 * <p>
 * Given an integer n and an integer array rounds.
 * We have a circular track which consists of n sectors labeled from 1 to n.
 * A marathon will be held on this track, the marathon consists of m rounds.
 * The ith round starts at sector rounds[i - 1] and ends at sector rounds[i].
 * For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]
 * 
 * @author Jackson Splinter
 */
public class Problem_1560 
{
    /**
     * Goes through an array of races and returns a linked list full of the most visited locations.
     * <p>
     * Only data that matters is the first and last numbers in the rounds array.
     * if the first number is lower than the last then the linked list will be filled with
     * the numbers from first to last. If the first number is higher than the last number,
     * than the linked list is filled with the numbers from the last number to the first
     * <p>
     * O(n)
     * 
     * @param n         number of sections in the race
     * @param rounds    array listing all the sections in the race
     * @return          array list filled with the most visited sections
     */
    public List<Integer> mostVisited(int n, int[] rounds) 
    {
        List<Integer> ans = new ArrayList<>();
        for(int i=rounds[0];i<=rounds[rounds.length-1];i++) // if first < last
        {
            ans.add(i);
        }
        if(ans.size()>0){return ans;}
        for(int i=1;i<=rounds[rounds.length-1];i++) // if first > last
        {
            ans.add(i);
        }
        for(int i=rounds[0];i<=n;i++)
        {
            ans.add(i);
        }
        return ans;
    }
}