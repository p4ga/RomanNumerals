package com.pairinggood;

public class RomanNumeral {

    public String convert(int arabicNumber) {

        String romanNumeral = "";

        while (arabicNumber > 0) {

            if (arabicNumber == 1000) {

                arabicNumber = arabicNumber - 1000;
                romanNumeral = romanNumeral + "M";
            }

            if (arabicNumber == 500) {

                arabicNumber = arabicNumber - 500;
                romanNumeral = romanNumeral + "D";
            }

            if (arabicNumber == 100) {

                arabicNumber = arabicNumber - 100;
                romanNumeral = romanNumeral + "C";
            }

            if (arabicNumber == 50) {

                arabicNumber = arabicNumber - 50;
                romanNumeral = romanNumeral + "L";
            }

            if (arabicNumber == 10) {

                arabicNumber = arabicNumber - 10;
                romanNumeral = romanNumeral + "X";
            }

            if (arabicNumber >= 5) {

                arabicNumber = arabicNumber - 5;
                romanNumeral = romanNumeral + "V";
            }

            if (arabicNumber == 4) {

                arabicNumber = arabicNumber - 4;
                romanNumeral = romanNumeral + "IV";
            }

            if (arabicNumber > 0) {
                romanNumeral = romanNumeral + "I";
                arabicNumber = arabicNumber - 1;
            }
        }




        return romanNumeral;
    }
}
