package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {
        if (arabicNumber == 1) {
            return "I";
        } else if (arabicNumber == 2) {
            return "II";
        } else if (arabicNumber == 3) {
            return "III";
        } else if (arabicNumber == 4) {
            return "IV";
        } else if (arabicNumber == 5) {
            return "V";
        } else if (arabicNumber == 10) {
            return "X";
        } else if (arabicNumber == 50) {
            return "L";
        } else if (arabicNumber == 100) {
            return "C";
        } else if (arabicNumber == 500) {
            return "D";
        } else if (arabicNumber == 1000) {
            return "M";
        } else {
            return "null";
        }
    }
}
