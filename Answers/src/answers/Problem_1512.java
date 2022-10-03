package answers;
/**
 * Given an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 * 
 * @author Jackson Splinter
 */
public class Problem_1512 
{
    /**
     * Given an array of integers nums, return the number of good pairs.
     * <p>
     * Brute force method, goes through every index of the array and checks
     * every number that comes after it to see if they make a good pair.
     * <p>
     * O(n^2)
     * 
     * @param nums  array of number to check
     * @return      the amount of good pairs that are found in the array provided
     */
    public static int numIdenticalPairs(int[] nums) 
    {
        int counter=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j =i;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&&i<j)
                {
                    counter++;
                }
            }
        }
        return counter;
    }
}