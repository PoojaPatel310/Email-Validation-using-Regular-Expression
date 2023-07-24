package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictTopLevelDomain {

    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("poojaPatel@domain.co.in");
        emails.add("poojaPatel@domain.com");
        emails.add("poojaPatel.name@domain.com");
        emails.add("poojaPatel#@domain.co.in");
        //Add invalid emails in list  
        emails.add(".poojaPatel@yahoo.com");
        emails.add("poojaPatel@yahoo.com.");
        emails.add("poojaPatel@yahoo..com");
        emails.add("poojaPatel@yahoo.c");
        emails.add("poojaPatel@yahoo.corporate");
        emails.add("pooja'Patel@domain.com");
        //Regular Expression   
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
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
