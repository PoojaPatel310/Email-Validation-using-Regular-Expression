package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationRFCPattern {

    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("poojaPatel@domain.co.in");
        emails.add("12453@domain.com");
        emails.add("poojaPatel.name@domain.com");
        emails.add("1poojaPatel#@domain.co.in");
        //Add invalid emails in list  
        emails.add("@yahoo.com");
        //Regular Expression   
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
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
