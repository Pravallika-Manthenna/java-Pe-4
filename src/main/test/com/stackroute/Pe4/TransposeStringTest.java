package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() {

        transposeString = new TransposeString();
    }

    @After
    public void tearDown() {
        transposeString = null;
    }

    @Test
    public void givenStringShouldReturnReverseString() {
        //arrange

        //Act
        String result= transposeString.transpose("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", result);

    }

    @Test
    public void givenStringContainsEmptyStringShouldReturnErrorMessage() {
        //arrange

        //Act
        String result= transposeString.transpose(" ");
        //Assert
        assertEquals("Empty string not accepted", result);

    }
    @Test
    public void givenStringContainsIntegerShouldReturnErrorMessage(){
//Arrange
//Act
        String result = transposeString.transpose("123");
//Assert
        assertNotEquals(" ", result);
    }
    @Test
    public void givenStringContainsSpecialCharacterShouldReturnErrorMessage(){
//Arrange
//Act
        String result = transposeString.transpose("!");
//Assert
        assertNotEquals(" ", result);
    }

}

