package com.stackroute.Pe4;
import java.lang.String;

// program to transpose the given string
public class TransposeString {
    public String transpose(String str) {

        String[] words = str.split(" ");
        String reverseString = "";
        //if string given is null
        if (str == " ") {
            return "Empty string not accepted";
        } else {
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reverseString = reverseString + reverseWord + " ";
            }
            return reverseString.trim();
        }
    }
}
