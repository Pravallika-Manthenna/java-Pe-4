package com.stackroute.Pe4;
//program to find the name in the given string
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public boolean matchingStringChecker(String input,String sequence){
        boolean result = false;
        if(input==null || sequence==null){
            return false;
        }
        else if(input==""|| sequence==""){
            return false;
        }
        else {

            Pattern pattern = Pattern.compile(sequence);

// Search above pattern in "She sells seashells by the seashore"
            Matcher m = pattern.matcher(input);
            if (m.find()) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
