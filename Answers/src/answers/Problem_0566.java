package answers;
/**
 * reshape an m x n matrix into a new one with a different size r x c keeping its original data.
 * <p>
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one
 * with a different size r x c keeping its original data.
 * <p>
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number
 * of columns of the wanted reshaped matrix.
 * <p>
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing
 * order as they were.
 * <p>
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
 * Otherwise, output the original matrix.
 * 
 * @author jackson Splinter
 */
public class Problem_0566 
{
    /**
     * Makes a new matrix and then fills it with the data of the original matrix,
     * if the data cannot fit returns the original matrix.
     * <p>
     * First checks if the new matrix will have the same number of spots as the original,
     * returns the original matrix if it does not. Then, it goes through and adds all the original data
     * into the new matrix 
     * <p>
     * O(n)
     * 
     * @param mat   original matrix to be filled
     * @param r     number of rows in the new matrix
     * @param c     number of columns in the new matrix
     * @return      the new matrix, if the specified new row and columns do not work returns the original matrix
     */
    public static int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int[][] reshaped = new int[r][c];
        if(mat.length*mat[0].length != r*c)
        {
            return mat; // if the new matrix is not properlly sized just return the original.
        }
        for(int i = 0;i<r*c;i++)
        {
            reshaped[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
        }
        return reshaped;  
    }   
}