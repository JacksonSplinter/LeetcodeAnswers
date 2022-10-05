package answers;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Return names sorted in descending order by the people's heights.
 * <p>
 * You are given an array of strings names, and an array heights that consists of distinct positive integers.
 * Both arrays are of length n.
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 * 
 * @author Jackson Splinter
 */
public class Problem_2418 
{
    /**
     * Returns the list of names sorted in order of height.
     * <p>
     * Uses a hash map to store the corresponding heights for every person. Then sorts the heights array in
     * ascending order. Then goes through the heights array and stores the corresponding name into the answer array.
     * <p>
     * O(2n)
     * 
     * @param names     array of names
     * @param heights   array of heights corresponding to the names
     * @return          array of names in descending order by height
     */
    public static String[] sortPeople(String[] names, int[] heights) 
    {
        HashMap<Integer,String> map= new HashMap<>();
        String[] ans= new String[names.length];
        int index=0;
                
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=names.length-1;i>=0;i--)
        {
            ans[index]=map.get(heights[i]);
            index++;
        }
        return ans;
    }
}