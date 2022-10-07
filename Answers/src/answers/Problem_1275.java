package answers;

/**
 *Tic-tac-toe is played by two players A and B on a 3 x 3 grid.
 * The rules of Tic-Tac-Toe are:
 * <p>
 * Players take turns placing characters into empty squares ' '.
 * The first player A always places 'X' characters, while the second player B always places 'O' characters.
 * 'X' and 'O' characters are always placed into empty squares, never on filled ones.
 * The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given a 2D integer array moves where moves[i] = [rowi, coli]
 * indicates that the ith move will be played on grid[rowi][coli].
 * return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw".
 * If there are still movements to play return "Pending".
 * <p>
 * You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe),
 * the grid is initially empty, and A will play first.
 * 
 * @author Jackson Splinter
 */
public class Problem_1275 
{
    /**
     * Returns the winner of the game, pending if more moves can be made, or Draw is all spaces are filled.
     * <p>
     * Goes through the 2D array moves and puts each move into a 2D array called board. After,
     * manually goes through all 7 possible ways of winning and checks if they have been met.
     * If a winning condition has been found, the program returns the player who won. 
     * If no winning condition has been found, it returns pending if the board is not full.
     * Programs returns draw if the board is full.
     * <p>
     * O(n)
     * 
     * @param moves 2D array of the moves
     * @return      the winner of the game, pending if more moves can be made, or Draw is all spaces are filled
     */
    public static String tictactoe(int[][] moves)
    {
        String[][] board = new String[3][3];
        int turn =1;
        for(int[] move:moves)
        {
         if(turn==1)
         {
            board[move[0]][move[1]]="A";
            turn++;
         }
         else
         {
            board[move[0]][move[1]]="B";
            turn=1;
         }
        }
        if(board[0][0]!=null && board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]))
        {
            return board[0][0];
        }
        
        if(board[1][0]!=null && board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]))
        {
            return board[1][0];
        }
        
        if(board[2][0]!=null && board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]))
        {
            return board[2][0];
        }
        
        if(board[0][0]!=null && board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0]))
        {
            return board[0][0];
        }
        
        if(board[0][1]!=null && board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1]))
        {
            return board[0][1];
        }
        
        if(board[0][2]!=null && board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2]))
        {
            return board[0][2];
        }

        if(board[0][0]!=null && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]))
        {
            return board[0][0];
        }
        
        if(board[0][2]!=null && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]))
        {
            return board[0][2];
        }
        
        if(moves.length>=9){return "Draw";}
        return"Pending";
    }
}