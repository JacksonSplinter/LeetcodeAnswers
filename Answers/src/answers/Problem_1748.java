package answers;
import java.util.HashMap;
/**
 * Return the sum of all the unique elements of nums.
 * <p>
 * You are given an integer array nums. The unique elements of an array are the elements
 * that appear exactly once in the array.
 * 
 * @author Jackson Splinter
 */
public class Problem_1748 
{
    /**
     * Adds all the unique elements in the array together and returns the sum.
     * <p>
     * Adds all the values to a hashmap, then also add each value to the sum. If the hashmap shows there
     * are multiple of one value then it is removed from the sum.
     * <p>
     * O(n)
     * 
     * @param nums  Array of integers
     * @return      sum of all the unique integers in the array provided
     */
    public static int sumOfUnique(int[] nums) 
    {
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)==1){ans+=i;}
            else if(map.get(i)==2){ans-=i;}
        }
        return ans;
    }
}