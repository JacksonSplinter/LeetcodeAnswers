package answers;
/**
 * Given a positive integer, check whether it has alternating bits.
 * namely, if two adjacent bits will always have different values.
 * 
 * @author Jackson Splinter
 */
public class Problem_0693 
{
    /**
     * Takes in an integer and returns <code>true</code> is the bits alternate, 
     * returns <code>false</code> otherwise.
     * <p>
     * First converts the integer to binary, then it checks the binary and if its bits alternate.
     * Checks if bits alternate by checking if the current bit matches the next bit in the string.
     * <p>
     * O(n)
     * 
     * @param n integer to be checked 
     * @return  <code>true</code> if the integer has alternating bits in binary,
     * <code>false</code> if it does not
     */
    public static boolean hasAlternatingBits(int n) 
    {
        String binary="";
        while(n>0)
        {
            binary+=n%2; //converts the integer to binary.
            n=n/2;
        }
        for(int i=0;i<binary.length()-1;i++)
        {
            if(binary.charAt(i)==binary.charAt(i+1))
            {
                return false;
            }
        }
        return true;
    }
}