package answers;
/**
 * There is a biker going on a road trip.
 * The road trip consists of n + 1 points at different altitudes.
 * The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain
 * in altitude between points i​​​​​​ and i + 1 for all (0 {@literal <}= i {@literal <} n).
 * Return the highest altitude of a point.
 * 
 * @author Jackson Slinter
 */
public class Problem_1732 
{
    /**
     * Adds each integer in the array, and returns the highest number reached.
     * <p>
     * Goes through every element in the array gain, adds that element to the total. Then compares
     * the sum after each edition to the max. If a new max is found it is then replaced. Returns the max
     * after each element has been added.
     * <p>
     * O(n)
     * 
     * @param gain  Array of integers
     * @return      highest integer reached in the sum
     */
    public static int largestAltitude(int[] gain) 
    {
        int curr = 0;
        int max=0;
        for(int i: gain)
        {
            curr+=i;
            max = Math.max(max, curr);
        }
        return max;
    }
}