package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingWordTest {
    SortingWord sortingWord;
    @Before
    public void setUp(){
    sortingWord = new SortingWord();
    }

    @After
    public void tearDown() {
    sortingWord = null;
    }
    @Test
    public void givenStringContainsStringShouldReturnSortedString() {
        //arrange

        //Act
        String result= sortingWord.sortingwords("this is a java class");
        //Assert
        assertEquals("a class is java this", result);

    }
    @Test
    public void givenStringContainsNullShouldReturnNullMessage() {
        //arrange

        //Act
        String result= sortingWord.sortingwords(null);
        //Assert
        assertEquals("String should not be null", result);

    }
    @Test
    public void givenStringContainsNullShouldReturnEmptyMessage() {
        //arrange

        //Act
        String result= sortingWord.sortingwords("");
        //Assert
        assertEquals("String is empty", result);
    }
    @Test
    public void givenStringContainsIntegersShouldReturnErrorMessage(){
//Arrange
//Act
        String result = sortingWord.sortingwords("123");
//Assert
        assertNotEquals(" ", result);
    }
    @Test
    public void givenStringContainsSpecialCharactersShouldReturnErrorMessage(){
//Arrange
//Act
        String result = sortingWord.sortingwords("#");
//Assert
        assertNotEquals(" ", result);
    }
}