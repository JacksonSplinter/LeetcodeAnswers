/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answers;

/**
 *
 * @author jackson
 */
public class Problem_2255 {
    public static int countPrefixes(String[] words, String s) 
    {
        int ans = 0;
        for (String w : words)
            if (s.startsWith(w))
                ans++;
        return ans;
    }
}
