package com.stackroute.Pe4;
//program to replace the character in the string
public class CountOfCharacter {
  public String countCharacter(String sentence, char letter) {
    int count = 0;
    String result = "";
    //if given string is null
    if(sentence == null)
    {
      result = null;
    }
    //if string given is empty
    else if( sentence == " " || letter == ' ' )
    {
      result = "Empty Sentence or letter is not accepted";
    }
    //above conditions are not satisfied this block will run
    else {
      sentence = sentence.toLowerCase();

      int length = sentence.length();

      int a = sentence.replace(String.valueOf(letter), "").length();

      count = length - a;
      result += count;


    }
    return result;
  }
}

