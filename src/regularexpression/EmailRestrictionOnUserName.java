package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictionOnUserName {
    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("poojaPatel@domain.co.in");
        emails.add("poojaPatel@domain.com");
        emails.add("pooja-Patel#@domain.co.in");
        emails.add("pooja-patel@domain.com");
        emails.add("poojaPatel@domaincom");
        //Add invalid emails in list  
        emails.add("@yahoo.com");
        emails.add("12poojaPatel#domain.com");
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list  
        for(String email : emails){
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}



 /*   The regular expression "^[A-Za-z0-9+_.-]+@(.+)$" also check the user name part of the email address. In order to check the user name part of the email, we have added some restrictions by using a regular expression. The regex "^[A-Za-z0-9+_.-]+@(.+)$", ^[A-Za-z0-9+_.-] defines the following restriction.

        A-Z characters are allowed
        a-z characters are allowed
        0-9 numbers are allowed
        Additionally email can contain dot(.), underscore(_), and dash(-).
        The remaining characters are not allowed. */