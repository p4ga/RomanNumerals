package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberTest {

    @Test
    public void whenRomanNumeral_I_EnteredArabicNumber_1_Returned(){

        //arrange
        ArabicNumber converterZ = new ArabicNumber();

        //act
        int arabicNumberZ = converterZ.convert("I");

        //assert
        Assert.assertEquals(1, arabicNumberZ);

    }

    @Test
    public void whenRomanNumeral_II_EnteredArabicNumber_2_Returned(){

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("II");

        //assert
        Assert.assertEquals(2, arabicNumber);

    }

    @Test
    public void whenRomanNumeral_III_EnteredArabicNumber_3_Returned(){

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("III");

        //assert
        Assert.assertEquals(3, arabicNumber);

    }

}
