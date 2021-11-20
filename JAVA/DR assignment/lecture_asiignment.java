/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_asiignment;

/**
 *
 * @author ziad
 */
public class lecture_asiignment {
    public static void main(String[]args)
    {
        Shape c1 = new Circle();
        Shape T1 = new Triangle();
        Shape r1 = new rectangle();
        c1.data();
        T1.data();
        r1.data();
        Shape [] arr = new Shape[3];
        arr[0] = c1;
        arr[1] = T1;
        arr[2] = r1;
        System.out.println("\nprintimg using array :.....\n");
        for(int i=0 ; i<3 ;i++)
        {
            arr[i].data();
        }
    }
    
}
