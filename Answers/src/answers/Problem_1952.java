package answers;
/**
 * Given an integer n, return <code>true</code> if n has exactly three positive divisors, otherwise, return <code>false</code>.
 * <p>
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * 
 * @author Jackson Splinter
 */
public class Problem_1952 
{
    /**
     * Returns <code>true</code> if the integer n has exactly three positive divisors,
     * otherwise returns <code>false</code>.
     * <p>
     * first goes through and checks if the number is greater than 2, once it passes that the program
     * goes through every possible positive integer and checks if n is divisible by that number.
     * Every time a divisor is found it is added to the count, if the count goes above 3 the program
     * returns <code>false</code>. If the program goes through and without terminating it then checks if the final count is 
     * exactly 3.
     * <p>
     * O(n)
     * 
     * @param n interger to be checked
     * @return  <code>true</code> if the integer n has exactly three positive divisors,
     * otherwise returns <code>false</code>.
     */
    public static boolean isThree(int n)
    {
        int count=0;
        if(n<3){return false;}
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){count++;}
            if (count>3){return false;}
        }
        return count==3;
    }
}