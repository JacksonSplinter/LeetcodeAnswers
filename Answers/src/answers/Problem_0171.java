package answers;
/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 * 
 * @author Jackson Splinter
 */
public class Problem_0171 
{
    /**
     * Returns a column number from a string representing an Excel column title. 
     * <p>
     * Goes through the string provided and uses the formula provided in order to convert
     * the characters into an integer.
     * <p>
     * O(n)
     * 
     * @param columnTitle   String representing column title in an Excel spread sheet
     * @return              the integer corresponding to a Excel column title
     */
    public static int titleToNumber(String columnTitle) 
    {
        if(columnTitle==null){return -1;}
        int ans=(int)(columnTitle.charAt(columnTitle.length()-1)-64);
        for(int i=0;i<columnTitle.length()-1;i++)
        {
            ans+=(int) (columnTitle.charAt(i)-64)*(Math.pow(26,columnTitle.length()-i-1));
        }
        return ans;    
    }
}