/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answers;

/**
 *
 * @author jackson
 */
public class Problem_1 
{
    public int[] twoSum(int[] nums, int target) 
    {
        if(nums.length<2)
        {
            return null;
        }
        for(int x=0; x<nums.length;x++)
        {
            for(int y=x+1;y<nums.length;y++)
            {
                if(nums[x]+nums[y]==target)
                {
                    return new int[]{x,y};
                }
            }
        }
        return null;
    }
}