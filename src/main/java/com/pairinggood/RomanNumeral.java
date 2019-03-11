package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        } else if (arabicNumber == 2) {
            return "II";
        } else {
            return "III";
        }
    }
}
