package answers;
/**
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * @author Jackson Splinter
 */
public class Problem_0001 
{
/**
 * Returns the first two numbers that add together to give the desired target as an array.
 * <p>
 * Brute force approach, goes through every pair of numbers in the array and adds them together and see if it
 * equals the target. If no solution is found returns null
 * <p>
 * O(n^2)
 * 
 * @param nums      Array of numbers to be searched
 * @param target    Integer of the target sum
 * @return          An array of two numbers that equal the target array <code>null</code> otherwise
 */
// brute force approach, goes through every pair of numbers in the array and adds them together and see if it
// equals the target. if no solution is found returns null
    public int[] twoSum(int[] nums, int target) 
    {
        if(nums.length<2)
        {
            return null; //null if array has less than 2 numbers
        }
        for(int x=0; x<nums.length;x++)
        {
            for(int y=x+1;y<nums.length;y++)
            {
                if(nums[x]+nums[y]==target) //checks if two numbers added equals target
                {
                    return new int[]{x,y};
                }
            }
        }
        return null; // null if the array has been completely checked and no pairs were found
    }
}