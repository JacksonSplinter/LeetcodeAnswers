package answers;

/*
@author Jackson Splinter

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
*/
public class Problem_0231 {
    public static boolean isPowerOfTwo(int n) 
    {
        double m = n;
        if(n<1){return false;}
        if(n==1){return true;}
        if(n%2==1){return false;}
        while(m>2)
        {
            m=m/2.0;
            if(m%2!=0){return false;}
        }
        return true;
    }
}
