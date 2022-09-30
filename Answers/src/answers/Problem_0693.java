package answers;

/*
 @author Jackson Splinter

Given a positive integer, check whether it has alternating bits:
namely, if two adjacent bits will always have different values.
 */
public class Problem_0693 
{
    public static boolean hasAlternatingBits(int n) 
    {
        String binary="";
        while(n>0)
        {
            binary+=n%2;
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
