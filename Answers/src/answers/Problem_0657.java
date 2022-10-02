package answers;
/**
 * Judge if a robot moves away from (0,0) after a set of moves.
 * <p>
 * There is a robot starting at the position (0, 0), the origin, on a 2D plane.
 * Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
 * <p>
 * You are given a string moves that represents the move sequence of the robot where moves[i]
 * represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
 * <p>
 * Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
 * <p>
 * Note: The way that the robot is "facing" is irrelevant. 'R' will always make the robot move to the right once,
 * 'L' will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same
 * for each move.
 * 
 * @author Jackson Splinter
 */
public class Problem_0657 
{
    /**
     * Interpret a string of moves and determine if the robot moved away from its origin,
     * returns <code>true</code> if the robot stayed at the origin,<code>false</code> if it moved away.
     * <p>
     * Keeps track of each move as an x or y movement, 
     * if the robot does not return to (0,0) then it has moved away from the origin.
     * <p>
     * O(n)
     * 
     * @param moves String of letters that represent moves.
     * @return  <code>true</code> if the robot stays in place or returns to the origin,
     * <code>false</code> if the robot does not end up at the origin point.
     */
    public static boolean judgeCircle(String moves) 
    {
        int x=0,y=0;
        for(int i=0; i< moves.length();i++)
        {
            if(moves.charAt(i)=='U')
                y++;
            else if(moves.charAt(i)=='D')
                y--;
            else if(moves.charAt(i)=='L')
                x--;
            else if(moves.charAt(i)=='R')
                x++;
        }
        if(x==0&&y==0)
        {
            return true;
        }
        else
            return false;
    }
}