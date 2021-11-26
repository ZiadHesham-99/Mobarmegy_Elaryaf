package com.section6;

import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        
        /*Section
        System.out.println("Please enter a number : /n");
        Scanner INPUT = new Scanner(System.in);
        String str = new String();
        str = INPUT.nextLine();
        StringTokenizer str2 = new StringTokenizer(str);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> Enumbers = new ArrayList<Integer>();
        ArrayList<Integer> Onumbers = new ArrayList<Integer>();

        int i = 0;
        int SUM = 0;
        while (str2.hasMoreTokens()) {

            numbers.add(Integer.parseInt(str2.nextToken()));
            if(numbers.get(i) % 2 == 0){Enumbers.add(numbers.get(i));}
            else{Onumbers.add(numbers.get(i));}

            System.out.println(numbers.get(i));

            SUM += numbers.get(i);
            i++;
        }
        System.out.println(SUM);
        System.out.println(Enumbers);
        System.out.println(Onumbers);*/

        /*Assignment
        */
        Assignment Stringmodifier = new Assignment("hello all studnets From all departments");
        System.out.println(Stringmodifier.OutputString());
    }
}