package com.pairinggood;

import org.junit.Assert;
import org.junit.Test;

public class ArabicNumberTest {

    @Test
    public void whenRomanNumeral_I_EnteredArabicNumber_1_Returned(){

        //arrange
        ArabicNumber converter = new ArabicNumber();

        //act
        int arabicNumber = converter.convert("I");

        //assert
        Assert.assertEquals(1, arabicNumber);

    }

}
