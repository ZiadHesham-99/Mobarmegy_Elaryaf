package com.section6;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokinzerMaxMin {
    private String NumbersString;
    StringTokenizer TokenString;

    public TokinzerMaxMin(String numbersString) {
        NumbersString = numbersString;
        TokenString= new StringTokenizer(NumbersString, ",");
        System.out.println(TokenString);
    }

    public String getNumbersString() {
        return NumbersString;
    }

    public void setNumbersString(String numbersString) {
        NumbersString = numbersString;
        TokenString= new StringTokenizer(NumbersString, ",");
    }
    

    public void getMax()
    {
        ArrayList<Integer> Numbers= new ArrayList<Integer>();
        //Numbers.add( Integer.valueOf(TokenString.toString() ) );
        System.out.println(Numbers);
    }
}
