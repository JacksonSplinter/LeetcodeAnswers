package answers;
/**
 * The Tribonacci sequence Tn is defined as follows: 
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0
 * 
 * Given n, return the value of Tn.
 * 
 * @author Jackson Splinter
 */
public class Problem_1137 
{
    /**
     * Returns the Nth tribonacci number.
     * <p>
     * Calculates the tribonacci number by using a array. n = n-1 + n-2 + n-3.
     * <p>
     * O(n)
     * 
     * @param n nth number in the tribonacci sequence
     * @return  the nth number in the tribonacci sequence
     */
    public static int tribonacci(int n) 
    {
        int[] seq= new int[n+3];
        seq[0]=0;
        seq[1]=1;
        seq[2]=1;
        for(int i=3;i<=n;i++)
        {
            seq[i]=seq[i-1]+seq[i-2]+seq[i-3];
        }
        return seq[n];
    }
}