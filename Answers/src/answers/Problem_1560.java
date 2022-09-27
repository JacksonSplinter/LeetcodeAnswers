package answers;

import java.util.List;
import java.util.ArrayList;

/*
 @author Jackson Splinter

Given an integer n and an integer array rounds.
We have a circular track which consists of n sectors labeled from 1 to n.
A marathon will be held on this track, the marathon consists of m rounds.
The ith round starts at sector rounds[i - 1] and ends at sector rounds[i].
For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]

Return an array of the most visited sectors sorted in ascending order.
 */
public class Problem_1560 {
    public List<Integer> mostVisited(int n, int[] rounds) 
    {
        List<Integer> ans = new ArrayList<>();
        for(int i =rounds[0];i<=rounds[rounds.length-1];i++)
        {
            ans.add(i);
        }
        if(ans.size()>0){return ans;}
        for(int i=1;i<=rounds[rounds.length-1];i++)
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
