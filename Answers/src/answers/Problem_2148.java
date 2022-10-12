package answers;
/**
 * Given an integer array nums,
 * return the number of elements that have both a strictly smaller and
 * a strictly greater element appear in nums.
 * 
 * @author Jackson Splinter
 */
public class Problem_2148 
{
    /**
     * Goes through an array of integers and returns the number of elements
     * that have both a strictly smaller and strictly greater number in the array.
     * <p>
     * Goes through the array element by element, each element is checked if it is the highest or lowest element.
     * If it is the lowest or highest it is overwritten into the proper spot.
     * If the element is equal to the highest or lowest it is added to a counter.
     * After the array is searched it returns the length minus to two counters.
     * <p>
     * O(n)
     * 
     * @param nums  Array of integers
     * @return      number of elements that have both a strictly smaller and greater number
     */
    public static int countElements(int[] nums) 
    {
        if (nums.length<3)
        {
            return 0;
        }
        int lowest= nums[0], highest =nums[nums.length-1];
        int lowcounter =0,highcounter=0;
        for(int i : nums)
        {
            if(i<lowest)
            {
                lowest = i;
                lowcounter = 1;
            }
            else if(i==lowest){lowcounter++;}
            if(i>highest)
            {
                highest = i;
                highcounter = 1;
            }
            else if(i==highest){highcounter++;}        
        }
        if(lowest==highest){return 0;}
        return nums.length - lowcounter - highcounter;
    }
}
