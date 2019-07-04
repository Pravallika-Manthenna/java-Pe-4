package com.stackroute.Pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//program to find the occurrence of word
public class FindOccurenceOfWords {
    String result="";

    public String findWords(String input, String sequence) {

        if(input == "" || sequence == ""){
            result = "Empty String not accepted";
        }
        else if ( input == null || sequence == null){
            result = "Null not accepted";
        }
        else {
// Create a pattern to be searched
            Pattern pattern = Pattern.compile(sequence);

//Search for the given sequencein the given pattern
            Matcher m = pattern.matcher(input);

// Storing starting and ending indexes of the pattern
            while (m.find())
                result += m.start() + "-" + (m.end()) + " ";

        }
        return result.trim();
    }
}
