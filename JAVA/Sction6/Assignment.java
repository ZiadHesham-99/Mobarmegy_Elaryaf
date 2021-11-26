package com.section6;

public class Assignment {
    private String inpuString;

    public Assignment(String inpuString) {
        this.inpuString = inpuString;
    }

    public String getInpuString() {
        return inpuString;
    }

    public void setInpuString(String inpuString) {
        this.inpuString = inpuString;
    }

    public String OutputString()
    {
        if(inpuString==null){System.out.println("You must input a string to the class first");return "";}
        String outString ="";
        String[] tempString = inpuString.split(" ");
        
        for (int i=0;i<tempString.length;i++) {
            char FirstCharacter = tempString[i].toCharArray()[0];
            FirstCharacter = (char) Character.toUpperCase(FirstCharacter);
            char[] Chars = tempString[i].toCharArray();
            Chars[0] = FirstCharacter;
            tempString[i] = String.valueOf(Chars);

            outString += tempString[i] + " ";
        }
            
        return outString;
    }
}
