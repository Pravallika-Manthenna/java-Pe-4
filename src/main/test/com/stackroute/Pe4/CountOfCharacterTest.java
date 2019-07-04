package com.stackroute.Pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfCharacterTest {
  CountOfCharacter countOfCharacter;
  @org.junit.Before
  public void setUp() {
    countOfCharacter = new CountOfCharacter();
  }

  @org.junit.After
  public void tearDown() {
    countOfCharacter = null;
  }

  @Test
  public void givenStringContainsStringShouldReturnCountOfCharacter(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter(" java is a programming language", 'a');
//Assert
    assertEquals("6", count);
  }
  @Test
  public void givenStringContainsStringShouldReturnNull(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter(null, 'a');
//Assert
    assertEquals(null,count);
  }
  @Test
  public void givenStringContainsNullStringCharacterShouldReturnErrorMessage(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter(" ", ' ');
//Assert
    assertEquals("Empty Sentence or letter is not accepted",count);
  }
  @Test
  public void givenStringContainsNullStringShouldReturnErrorMessage(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter(" ", 'a');
//Assert
    assertEquals("Empty Sentence or letter is not accepted",count);
  }
  @Test
  public void givenStringContainsNullCharacterShouldReturnErrorMessage(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter("java is a programming language", ' ');
//Assert
    assertEquals("Empty Sentence or letter is not accepted",count);
  }
  @Test
  public void givenStringContainsIntegersShouldReturnErrorMessage(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter("123",' ');
//Assert
    assertNotEquals(" ",count);
  }
  @Test
  public void givenStringContainsSpecialCharacterShouldReturnErrorMessage(){
//Arrange
//Act
    String count = countOfCharacter.countCharacter("@",' ');
//Assert
    assertNotEquals(" ",count);
  }
}


