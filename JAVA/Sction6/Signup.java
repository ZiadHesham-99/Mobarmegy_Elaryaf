package com.section6;

import javax.swing.Action;

public class Signup {
    private String Email,Password;

    public Signup(String email, String password) {
        Email = email;
        Password = password;
    }

    public boolean VerifyMail()
    {
        if(Email.isBlank() || Email.isEmpty()){return false;}
        String SubMail,Domain;
        SubMail = Email.split("@")[0];
        Domain = Email.split("@")[1];
        if(!Domain.equalsIgnoreCase("@helwan.edu.eg")) // verifying format
        {
            System.out.println("Email format is incorrect #1");
            return false;
        }
        if(SubMail.length()>=12) // verifying length
        {
            System.out.println("Email format is incorrect #2");
            return false;
        }
        
        boolean IsFirstCaseUpper = (SubMail.charAt(0)<=65 && SubMail.charAt(0)>=90); 
        boolean IsFirstCaseLower = (SubMail.charAt(0)<=97 && SubMail.charAt(0)>=122);
        boolean IsFirstCaseLetter = (IsFirstCaseLower || IsFirstCaseUpper);
        if(!IsFirstCaseLetter)
        {
            System.out.println("First character of email has to be a letter");
            return false;
        }
        System.out.println("Email verified");
        return true;
    }

    public boolean VerifyPassword()
    {
        boolean HasDigit = false;
        if(Password.isBlank() || Password.isEmpty()){return false;}
        if(Password.length()<6)
        {
            System.out.println("Password has to be greater than 6 digits");
            return false;
        }

        if(Password.toLowerCase() == Password || Password.toUpperCase() == Password)
        {
            System.out.println("Password has to have atleast a lower case and an upper case");
            return false;
        }

        for (char character : Password.toCharArray() ) 
        {
            HasDigit = Character.isDigit(character) ;   
        }

        if(HasDigit == false)
        {
            System.out.println("Password has to have at least one digit");
            return false;
        }
        return true;
    }

    public boolean VerifyPassword(Action CallBack)
    {
        boolean HasDigit = false;
        if(Password.isBlank() || Password.isEmpty()){return false;}
        if(Password.length()<6)
        {
            System.out.println("Password has to be greater than 6 digits");
            return false;
        }

        if(Password.toLowerCase() == Password || Password.toUpperCase() == Password)
        {
            System.out.println("Password has to have atleast a lower case and an upper case");
            return false;
        }

        for (char character : Password.toCharArray() ) 
        {
            HasDigit = Character.isDigit(character) ;   
        }

        if(HasDigit == false)
        {
            System.out.println("Password has to have at least one digit");
            return false;
        }
        CallBack.setEnabled(true);
        return true;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Signup [Email=" + Email + ", Password=" + Password + "]";
    }


}
