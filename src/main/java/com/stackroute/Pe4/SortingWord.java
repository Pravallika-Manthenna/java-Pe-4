package com.stackroute.Pe4;
//sort the words in the string in alphabetical order
public class SortingWord {
    public String sortingwords(String input){
        String result="";String words="";
        int i=0,j=0;
//if given string is null
        if(input == null){
            return "String should not be null";
        }
        //if given string is empty
        else if(input==""){
            return "String is empty";
        }
        // if the above blocks are not statisfied this block will run
        else {
            String[] input1=input.split(" ");
            for (i = 0; i <= input1.length - 1; i++) {
                for (j = 1; j <= input1.length - 1; j++) {
                    if (input1[j - 1].compareTo(input1[j]) > 0) {
                        String temp = input1[j - 1];
                        input1[j - 1] = input1[j];
                        input1[j] = temp;
                    }
                }
            }
            for (i = 0; i <= input1.length - 1; i++) {
//System.out.println(input1[i]+"");
                result += input1[i] + " ";
            }
        }

        return result.trim();

    }
}

