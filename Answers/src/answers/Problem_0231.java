package answers;
/**
 * Given an integer n, return <code>true</code> if it is a power of two, otherwise, return <code>false</code>.
 * <p>
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 * 
 * @author Jackson Splinter
 */
public class Problem_0231 
{
    /**
     * Determines is a number is a power of two, if it is return <code>true</code>,
     * otherwise return <code>false</code>.
     * <p>
     * A number is a power of two if you can continually divide it by 2. So keep on dividing the number by 2
     * if the number mod 2 is not 0 then you know the number is odd and cannot be a power.
     * <p>
     * O(1)
     * 
     * @param n number we are determining if it is a power of 2
     * @return  <code>true</code> if the number is a power of 2, otherwise <code>false</code>.
     */
    public static boolean isPowerOfTwo(int n) 
    {
        double m = n;
        if(n<1){return false;}
        if(n==1){return true;}
        if(n%2==1){return false;}
        while(m>2)
        {
            m=m/2.0;
            if(m%2!=0){return false;} // if the number is odd it cannot be a power of 2
        }
        return true;
    }
}