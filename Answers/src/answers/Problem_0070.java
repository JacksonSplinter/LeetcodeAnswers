package answers;

/*
@author Jackson Splinter

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class Problem_0070 {
    public static int climbStairs(int n) 
    {
        int[] fib = new int[n + 1];
        if(n<1){return 0;}
        if(n==1){return 1;}
        if(n==2){return 2;}
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= n; i++) 
        {
            fib[i] = fib[i-1] + fib[i - 2];
        }
        return fib[n];
    }   
}
