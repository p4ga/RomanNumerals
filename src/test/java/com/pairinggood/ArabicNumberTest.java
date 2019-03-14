package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberTest {

    @Test
    public void whenRomanNumeral_I_EnteredArabicNumber_1_Returned() {

        //arrange
        ArabicNumber converterZ = new ArabicNumber();

        //act
        int arabicNumberZ = converterZ.convert("I");

        //assert
        Assert.assertEquals(1, arabicNumberZ);

    }

    @Test
    public void whenRomanNumeral_II_EnteredArabicNumber_2_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("II");

        //assert
        Assert.assertEquals(2, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_III_EnteredArabicNumber_3_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("III");

        //assert
        Assert.assertEquals(3, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_V_EnteredArabicNumber_5_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("V");

        //assert
        Assert.assertEquals(5, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_X_EnteredArabicNumber_10_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("X");

        //assert
        Assert.assertEquals(10, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_L_EnteredArabicNumber_50_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("L");

        //assert
        Assert.assertEquals(50, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_C_EnteredArabicNumber_100_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("C");

        //assert
        Assert.assertEquals(100, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_D_EnteredArabicNumber_500_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("D");

        //assert
        Assert.assertEquals(500, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_M_EnteredArabicNumber_1000_Returned() {

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("M");

        //assert
        Assert.assertEquals(1000, arabicNumber);

    }
}