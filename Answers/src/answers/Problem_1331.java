package answers;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Given an array of integers arr, replace each element with its rank.
 * <p>
 * The rank represents how large the element is. The rank has the following rules:
 * <p>
 * Rank is an integer starting from 1.
 * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
 * Rank should be as small as possible.
 * 
 * @author Jackson Splinter
 */
public class Problem_1331 
{
    /**
     * Given an array of integers arr, replaces each element with its rank.
     * <p>
     * Uses a hash map to store the rank of each position. Gets the rank by sorting a copied array
     * of the original arr array. Then replaces the data in the array with the rank stored in the hash map.
     * <p>
     * O(2n)
     * 
     * @param arr  array of integers
     * @return     array of integers where the data is replaced by the rank
     */
    public static int[] arrayRankTransform(int[] arr) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] dummy = new int[arr.length];
        int[] ans= new int[arr.length];
        int offset=1;
        
        System.arraycopy(arr, 0, dummy, 0, arr.length);
        Arrays.sort(dummy);
        for(int i : dummy)
        {
            if(!map.containsKey(i))
            {
                map.put(i, offset);
                offset++;
            }
            else
            {
                map.put(i,map.get(i));
            }
        }       
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}