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
public class Problem_0657 {
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
