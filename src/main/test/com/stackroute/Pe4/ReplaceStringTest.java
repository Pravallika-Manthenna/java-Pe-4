package com.stackroute.Pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceStringTest {
ReplaceString replaceString;
  @Before
  public void setUp() {
    replaceString = new ReplaceString();
  }

  @After
  public void tearDown() {
    replaceString = null;
  }
  @Test
  public void givenStringContainsStringShouldReturnReplacedString(){
//Arrange
//Act
    String word = replaceString.stringreplace("daily dry");
//Assert
    assertEquals("faity fry", word);
  }
  @Test
  public void givenStringContainsStringShouldReturnMessageString(){
//Arrange
//Act
    String word = replaceString.stringreplace(" ");
//Assert
    assertEquals("word should not be Empty", word);
  }
  @Test
  public void givenStringContainsNullShouldReturnNull(){
//Arrange
//Act
    String word = replaceString.stringreplace(null);
//Assert
    assertEquals(null , word);
  }
}
