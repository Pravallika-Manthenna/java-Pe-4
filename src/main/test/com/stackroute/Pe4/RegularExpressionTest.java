package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression regularExpression;
    @Before
    public void setUp() {
        regularExpression = new RegularExpression();
    }

    @After
    public void tearDown()  {
        regularExpression = null;
    }
    @Test
    public void givenStringContainsStringShouldReturnTrue() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker("This is Harry" , "Harry");
        //Assert
        assertTrue( result);

    }
    @Test
    public void givenStringContainsStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker("This is Henry" , "Harry");
        //Assert
        assertFalse( result);

    }
    @Test
    public void givenStringContainsNullStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker(null , null);
        //Assert
        assertFalse( result);

    }
    @Test
    public void givenStringContainsEmptyStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker("", "");
        //Assert
        assertFalse( result);

    }
    @Test
    public void givenStringContainsEmptyAndNullStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker("", null);
        //Assert
        assertFalse( result);

    }
    @Test
    public void givenStringContainsNullAndEmptyStringShouldReturnFalse() {
        //arrange

        //Act
        boolean result= regularExpression.matchingStringChecker(null, "");
        //Assert
        assertFalse( result);

    }
}