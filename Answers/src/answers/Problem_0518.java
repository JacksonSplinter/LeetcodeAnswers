package answers;
/**
 *You are given an integer array coins representing coins of different denominations 
 * and an integer amount representing a total amount of money, 
 * Return the number of combinations that make up that amount.
 * <p>
 * If that amount of money cannot be made up by any combination of the coins, return 0.
 * <p>
 * You may assume that you have an infinite number of each kind of coin.
 * <p>
 * The answer is guaranteed to fit into a signed 32-bit integer.
 * 
 * @author Jackson Splinter
 */
public class Problem_0518 
{
    /**
     * Returns the number of combinations possible to create the total out of provided coin values.
     * <p>
     * Based on the Knapsack problem.
     * <p>
     * O(n^2)
     * 
     * @param amount    integer total
     * @param coins     integer array of coin values
     * @return          Number of combinations to create the total out of provided coin values
     */
    public static int change(int amount, int[] coins) 
    {
        int[] val = new int[amount + 1];
        val[0] = 1;
        for (int coin : coins) 
        {
            for (int i = coin; i <= amount; i++) 
            {
                val[i] += val[i-coin];
            }
        }
        return val[amount];
    }
}