package answers;

/*
 @author Jackson Splinter

Given an integer n (in base 10) and a base k, return the sum of the digits of n
after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 */
public class Problem_1837 {
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
