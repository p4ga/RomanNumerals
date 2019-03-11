package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void whenArabicNumberOneEntered_RomanNumeral_I_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(1);

        //assert
        Assert.assertEquals("I",romanNumeral);

    }

    @Test
    public void whenArabicNumberTwoEntered_RomanNumeral_II_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(2);

        //assert
        Assert.assertEquals("II",romanNumeral);

    }

    @Test
    public void whenArabicNumberThreeEntered_RomanNumeral_III_Returned(){

        //arrange
        RomanNumeral converter = new RomanNumeral();

        //act
        String romanNumeral = converter.convert(3);

        //assert
        Assert.assertEquals("III",romanNumeral);

    }

}
