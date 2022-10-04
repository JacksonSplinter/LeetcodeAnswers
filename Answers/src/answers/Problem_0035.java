package answers;
/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * @author Jackson Splinter
 */
public class Problem_0035 
{
    /**
     * Returns the index of a target value in a sorted array, if target not found return where it would be inserted.
     * <p>
     * Binary search.
     * <p>
     * O(log n)
     * 
     * @param nums      array to be searched
     * @param target    target integer
     * @return          position in the array the target is found, if target not found returns
     *                  the position where the integer would go.
     */
    public  static int searchInsert(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) 
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {return mid;}
            else if (target > nums[mid]) {left = mid + 1;}
            else {right = mid - 1;}
        }      
        return left;
    }
}