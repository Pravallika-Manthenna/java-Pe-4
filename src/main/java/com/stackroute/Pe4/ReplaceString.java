package com.stackroute.Pe4;
//program to replace the characters in the given string
public class ReplaceString {

  public String stringreplace(String word) {

    String result = "";
//if word is ull
    if(word == null)
    {
      result = null;
    }
    //if word is empty
    else if(word == " ")
    {
      result = "word should not be Empty";
    }
//replace character using string replace
    else
      {
          String word1 = word.replace('d', 'f');
           result = word1.replace('l', 't');
      }
    return result;
  }

}
