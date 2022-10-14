package answers;
/**
 *The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 * 
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
 * Given an integer array nums, choose four distinct indices w, x, y, and z such that the product
 * difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
 * <p>
 * Return the maximum such product difference.
 * 
 * @author Jackson Splinter
 */
public class Problem_1913 
{
    /**
     * Returns the maximum product difference.
     * <>
     * Goes through the array and finds the 2 maximum and the 2 minimum elements. Then returns
     * (max*max2)-(min*min2).
     * <>
     * O(n)
     * 
     * @param nums  Array of integers
     * @return      maximum product difference.
     */
    public static int maxProductDifference(int[] nums)
    {
        int max =Integer.MIN_VALUE ,max2 = Integer.MIN_VALUE,min=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i>=max)
            {
                max2=max;
                max=i;
            }
            else if(i>max2)
            {
                max2=i;
            }
            if(i<=min)
            {
                min2=min;
                min=i;
            }
            else if(i<min2)
            {
                min2=i;
            }
        }
        return(max*max2)-(min*min2);
    }
}