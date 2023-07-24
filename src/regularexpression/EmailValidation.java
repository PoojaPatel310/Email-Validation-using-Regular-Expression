package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("pooja@domain.co.in");
        emails.add("pooja@domain.com");
        emails.add("pooja.patel@domain.com");
        emails.add("pooja#@domain.co.in");
        emails.add("poojaPatel@domain.com");

        //Add invalid emails in list
        emails.add("@yahoo.com");
        emails.add("poojaPatel#domain.com");

        //Regular Expression
        String regex = "^(.+)@(.+)$";

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


