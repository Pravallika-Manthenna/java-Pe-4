package com.stackroute.Pe4;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class FindOccurenceOfWordsTest {

    FindOccurenceOfWords findOccurenceOfWords;
    private FindOccurenceOfWords findOccurenceOfWords1;

    @Before
    public void setUp() {
        findOccurenceOfWords = new FindOccurenceOfWords();
    }

    @After
    public void tearDown() {
        findOccurenceOfWords = null;
    }
    @Test
    public void givenStringContainsNullStringCharacterShouldReturnErrorMessage(){
//Arrange
//Act
        String count = findOccurenceOfWords.findWords("She sells seashells by the seashore", "se");
//Assert
        assertEquals("4-6 10-12 27-29",count);
    }
    @Test
    public void givenStringContainsNullShouldReturnFalse() {
//Arrange
//Act
        String result = findOccurenceOfWords.findWords(null, null);
//Assert
        assertEquals( "Null not accepted",result);
    }
    @Test
    public void givenStringContainsEmptyShouldReturnFalse() {
//Arrange
//Act
        String result = findOccurenceOfWords.findWords("", "");
//Assert
        assertEquals( "Empty String not accepted" ,result);
    }
    @Test
    public void givenStringContainsSpecialCharacterShouldReturnErrorMessage(){
//Arrange
//Act
        String result = findOccurenceOfWords.findWords("@","");
//Assert
        assertNotEquals(" ",result);
    }
    @Test
    public void givenStringContainsIntegerShouldReturnErrorMessage(){
//Arrange
//Act
        String result = findOccurenceOfWords.findWords("123","");
//Assert
        assertNotEquals(" ",result);
    }
}

