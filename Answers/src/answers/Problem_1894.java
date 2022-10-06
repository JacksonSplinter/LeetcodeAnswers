package answers;
/**
 * There are n students in a class numbered from 0 to n - 1.
 * The teacher will give each student a problem starting with the student number 0,
 * then the student number 1, and so on until the teacher reaches the student number n - 1.
 * After that, the teacher will restart the process, starting with the student number 0 again.
 * <p>
 * You are given a 0-indexed integer array chalk and an integer k.
 * There are initially k pieces of chalk. When the student number i is given a problem to solve,
 * they will use chalk[i] pieces of chalk to solve that problem. However,
 * if the current number of chalk pieces is strictly less than chalk[i],
 * then the student number i will be asked to replace the chalk.
 * <p>
 * Return the index of the student that will replace the chalk.
 * 
 * @author jackson
 */
public class Problem_1894 
{
    /**
     * Return the index of the student that will replace the chalk.
     * <p>
     * Runs a loop that runs until a solution is found, first checks if the chalk has enough for the student to use.
     * if the chalk does not then it returns that student. if there is enough chalk the students amount is removed
     * from the total amount and then it moves on to the next student and that process is repeated.
     * Once the last student is reached it loops around to the first student. To make things faster all the students
     * values are added together, and if the value of the chalk is greater than the student sum after a full loop,
     * the student sum is subtracted from the value of the chalk.
     * <p>
     * O(2n)
     * 
     * @param chalk Array of integers, each students value
     * @param k     target integer
     * @return      Which student will have to replace the chalk
     */
    public static int chalkReplacer(int[] chalk, int k) 
    {
        int turn=0;
        int sum =0;
        while(true)
        {
            if(k<chalk[turn])
            {
                return turn;
            }
            k-=chalk[turn];
            sum+=chalk[turn];
            turn++;
            if(turn>=chalk.length)
            {
                turn=0;
                while(k>=sum)
                {
                    k-=sum;
                }
            }
        }
    }
}