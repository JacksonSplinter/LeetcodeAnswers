package answers;

import java.util.Arrays;

/**
 * Given a sentence text (A sentence is a string of space-separated words) in the following format:
 * <p>
 * First letter is in upper case.
 * Each word in text are separated by a single space.
 * Your task is to rearrange the words in text such that all words are rearranged
 * in an increasing order of their lengths. If two words have the same length, arrange them in their original order.
 * <p>
 * Return the new text following the format shown above.
 * 
 * @author Jackson Splinter
 */
public class Problem_1451 
{
    /**
     * Returns a sentence in order by word length, with only the first letter capitalized.
     * <p>
     * Takes the original sentence and splits it into an array, then sorts the array by world length.
     * Then joins the array together to form a sentence. Then every letter is made lowercase,
     * the first letter is then made uppercase. The newly arranged sentence is returned.
     * <p>
     * O(nlogn)
     * 
     * @param text  Sentence
     * @return      Sentence arranged by word length
     */
    public static String arrangeWords(String text) 
    {
        String ans;
        String[] s= text.split(" ");
        Arrays.sort(s,(a,b) -> a.length() - b.length());
        ans= String.join(" ", s);
        ans = ans.toLowerCase();
        ans = ans.substring(0, 1).toUpperCase()+ ans.substring(1);
        return ans;
    }
}