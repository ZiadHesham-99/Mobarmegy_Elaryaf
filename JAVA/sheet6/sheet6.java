/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet6;

/**
 *
 * @author ziad
 */
public class sheet6
       
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "the first letter should be in upper case for every word of this string";
        Capitalize STR = new Capitalize(str);
        STR.print();
        String str1 = "hello all students From all departments";
        String str2 = "Can you play football?";
        Capitalize STR1 = new Capitalize(str1);
        STR1.print();
        Capitalize STR2 = new Capitalize(str2);
        STR2.print();
    }
    
}
