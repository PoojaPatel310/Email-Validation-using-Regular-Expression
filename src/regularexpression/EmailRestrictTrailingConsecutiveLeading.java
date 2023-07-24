package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictTrailingConsecutiveLeading {

  /*  ".example@example.com" (Leading dot in the local part)
            "example.@example.com" (Leading dot in the domain part)
            "example.@example.com." (Trailing dot in the domain part)
            "example..user@example.com" (Consecutive dots in the local part)
            "user@example..com" (Consecutive dots in the domain part) */

    public class EmailValidation4 {
        public static void main(String args[]) {
            ArrayList<String> emails = new ArrayList<String>();

            emails.add("poojaPatel@domain.co.in");
            emails.add("poojaPatel@domain.com");
            emails.add("poojaPatel.name@domain.com");
            emails.add("poojaPatel#@domain.co.in");
            emails.add("java'Tpoint@domain.com");
            //Add invalid emails in list  
            emails.add(".poojaPatel@yahoo.com");
            emails.add("poojaPatel@domain.com.");
            emails.add("poojaPatel#domain.com");
            emails.add("poojaPatel@domain..com");
            //Regular Expression   
            String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
            //Compile regular expression to get the pattern  
            Pattern pattern = Pattern.compile(regex);
            //Iterate emails array list  
            for (String email : emails) {
                //Create instance of matcher   
                Matcher matcher = pattern.matcher(email);
                System.out.println(email + " : " + matcher.matches() + "\n");
            }
        }
    }
}
