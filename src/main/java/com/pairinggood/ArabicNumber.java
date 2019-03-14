package com.pairinggood;

public class ArabicNumber {


    public int convert(String romanNumeral) {

        final char[] letters = romanNumeral.toCharArray();

        int arabicNumber = 0;

        for (char letter : letters) {
           if (letter == 'I') {
               arabicNumber = arabicNumber + 1;

           }

        }
        return arabicNumber;
    }
}
