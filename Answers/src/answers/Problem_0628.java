package answers;
import java.util.Arrays;
/**
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 * 
 * @author Jackson Splinter
 */
public class Problem_0628 
{
    /**
     * Finds the three numbers that result in the highest product and returns the product.
     * <p>
     * Sorts the array into ascending order, then returns the biggest answer of either the top three numbers
     * or the top number times the bottom two numbers.
     * <p>
     * O(nlogn)
     * 
     * @param nums  array of numbers
     * @return      the largest product of three numbers found in the array
     */
    public static int maximumProduct(int[] nums)
    {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                nums[0]*nums[1]*nums[nums.length-1]);
    }
}