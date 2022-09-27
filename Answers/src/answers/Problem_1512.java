package answers;
/*
@author Jackson Splinter

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
public class Problem_1512 {
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
