package answers;
/**
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * 
 * @author Jackson Splinter
 */
public class Problem_1464 
{
    /**
     * Returns the value of the two maximum products minus 1.
     * <p>
     * If the array is 2 in length, the only two values are the maximums. Otherwise,
     * program goes through the array and compares the current value to the current maximum,
     * if the current value is indeed higher than the currrent becomes the new maximum.
     * <p>
     * O(n)
     * 
     * @param nums  array of integers
     * @return      (maximum1-1)*(maximum2-1) 
     */
    public static int maxProduct(int[] nums) 
    {
        if(nums.length==2)
        {
            return (nums[0]-1)*(nums[1]-1);
        }
        int ans1 = nums[0];
        int ans2 = nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]>ans1)
            {
                if(ans1>ans2) {ans2=ans1;}
                ans1=nums[i];
            }
            else if(nums[i]>ans2)
            {
                ans2=nums[i];
            }
        }
        System.out.println(ans1+" "+ans2);
        return (ans1-1)*(ans2-1);
    }
}