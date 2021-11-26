

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;
import java.util.*;
import java.util.StringTokenizer ;
import java.util.ArrayList;
//import java.lang.Character;
/**
 *
 * @author ziad
 */
/* ArrayList<String> cars = new ArrayList<String>();*/
public class Capitalize {
    private String str;
    private ArrayList<String> words = new ArrayList<String>();
    public Capitalize (String str)
    {
        this.str = str ;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public void print()
    {
        int i=0;
        StringTokenizer token = new StringTokenizer(this.str);
        while(token.hasMoreTokens())
        {
            words.add(token.nextToken());
            char first_char ;
            first_char = Character.toUpperCase((words.get(i).toCharArray())[0]);
            char[] temp_str = words.get(i).toCharArray();
            temp_str[0] = first_char;
            words.set(i, String.valueOf(temp_str));
            System.out.print(words.get(i) +" ");
            i++;
        }
        System.out.print("\n");
        
        
    }
    
}
