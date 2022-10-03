package answers;
/**
 * Given an integer n (in base 10) and a base k, return the sum of the digits of n 
 * after converting n from base 10 to base k.
 * <p>
 * After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 * 
 * @author Jackson Splinter
 */
public class Problem_1837 
{
    /**
     * Converts an integer n into base k and returns the sum of the digits.
     * <p>
     * First converts n into base k and then adds each digit together into the sum and returns the sum.
     * <p>
     * O(n)
     * 
     * @param n integer base 10
     * @param k new base number
     * @return  sum of the digits in n base k
     */
    public static int sumBase(int n, int k) {
        int sum=0;
        while(n>0)
        {
            sum+=n%k;
            n=n/k;
        }
        return sum;
    }
}