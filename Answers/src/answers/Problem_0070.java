package answers;
/**
 * In how many distinct ways can you climb to the top of a staircase using either one or two steps.
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * @author Jackson Splinter
 */
public class Problem_0070 
{
    /**
     * Calculates how many different ways to climb up a staircase of n height either using
     * one or two steps.
     * <p>
     * Answer is based on the fibonacci sequence, adds the pervious two number in order to get
     * the current number, works on every number over 2. for numbers 2 and under we need to manually enter
     * the return case.
     * <p>
     * O(n)
     * 
     * @param n height of the staircase that is being climbed.
     * @return  number of unique ways the staircase can traversed.
     */
    public static int climbStairs(int n) 
    {
        int[] fib = new int[n + 1];
        if(n<1){return 0;}
        if(n==1){return 1;}
        if(n==2){return 2;} // cases for n less than 3
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= n; i++) 
        {
            fib[i] = fib[i-1] + fib[i - 2]; //calculate each number in the fibonacci sequence
        }
        return fib[n];
    }   
}