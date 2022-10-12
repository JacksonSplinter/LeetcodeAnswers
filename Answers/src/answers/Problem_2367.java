package answers;
/**
 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff.
 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
 * 
 * i {@literal <} j {@literal <} k,
 * nums[j] - nums[i] == diff, and
 * nums[k] - nums[j] == diff.
 * Return the number of unique arithmetic triplets.
 * 
 * @author Jackson Splinter
 */
public class Problem_2367 
{
    /**
     * Returns number of unique arithmetic triplets.
     * <p>
     * Goes through every integer in the array and first checks if i and j are the specified distance apart.
     * If that is true it moves  on to find a k that is this specified distance from j. If a k is found then
     * the answer is incremented by one. After the whole array has been checked the answer is then returned
     * <p>
     * O(n^3)
     * 
     * @param nums  array of strictly increasing integers
     * @param diff  Positive integer
     * @return      number of unique arithmetic triplets
     */
    public static int arithmeticTriplets(int[] nums, int diff) 
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j= i+1;j<nums.length;j++)
            {
                if(nums[j] - nums[i] == diff)
                {
                    for(int k= j+1;k<nums.length;k++)
                    {
                        if(nums[k] - nums[j] == diff)
                        {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}