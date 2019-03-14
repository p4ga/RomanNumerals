package com.pairinggood;

public class ArabicNumber {

    public int convert(String romanNumeral) {

        final char[] letters = romanNumeral.toCharArray();

        int arabicNumber = 0;

        for (char letter : letters) {

           if (letter == 'I') {

               arabicNumber = arabicNumber + 1;

           }

           if (letter == 'V') {

               arabicNumber = arabicNumber + 5;

           }

           if (letter == 'X') {

               arabicNumber = arabicNumber + 10;

           }

           if (letter == 'L') {

               arabicNumber = arabicNumber + 50;

           }

           if (letter == 'C') {

               arabicNumber = arabicNumber + 100;

           }

           if (letter == 'D') {

               arabicNumber = arabicNumber + 500;

           }

           if (letter == 'M') {

               arabicNumber = arabicNumber + 1000;

           }
        }

        return arabicNumber;

    }
}

/*

Write a class to represent Roman numerals. The class should have two constructors. One constructs
a Roman numeral from a string such as "XVII" or "MCMXCV". It should throw a NumberFormatException
if the string is not a legal Roman numeral. The other constructor constructs a Roman numeral from
an int. It should throw a NumberFormatException if the int is outside the range 1 to 3999.

In addition, the class should have two instance methods. The method toString() returns the string
that represents the Roman numeral. The method toInt() returns the value of the Roman numeral as an
int.

At some point in your class, you will have to convert an int into the string that represents the
corresponding Roman numeral. One way to approach this is to gradually "move" value from the Arabic
numeral to the Roman numeral. Here is the beginning of a routine that will do this, where number
is the int that is to be converted:


    String roman = " ";

    int N = number;

    while (N >= 1000) {
    // Move 1000 from N to roman.
        roman += "M";
        N -= 1000;
    }
    while (N >= 900) {
        roman += "CM";
        N -= 900;
    }
    while (N >= 500) {
        roman += "M";
        N -= 500;
    }
    while (N >= 400) {
        roman += "CM";
        N -= 400;
    }
    while (N >= 100) {
        roman += "M";
        N -= 100;
    }
    while (N >= 90) {
        roman += "CM";
        N -= 90;
    }
    while (N >= 50) {
        roman += "M";
        N -= 50;
    }
    while (N >= 40) {
        roman += "CM";
        N -= 40;
    }
    while (N >= 10) {
        roman += "M";
        N -= 10;
    }
    while (N >= 9) {
        roman += "CM";
        N -= 9;
    }
    while (N >= 5) {
        roman += "M";
        N -= 5;
    }
    while (N >= 4) {
        roman += "CM";
        N -= 4;
    }
    while (N >= 1) {
        roman += "M";
        N -= 1;
    }

    (You can save yourself a lot of typing in this routine
    if you use arrays in a clever way to represent the data in the above table.)

Once you've written your class, use it in a main program that will read both Arabic
numerals and Roman numerals entered by the user. If the user enters an Arabic numeral,
print the corresponding Roman numeral. If the user enters a Roman numeral, print the
corresponding Arabic numeral. (You can tell the difference by using TextIO.peek() to
peek at the first character in the user's input. If that character is a digit, then
the user's input is an Arabic numeral. Otherwise, it's a Roman numeral.) The program
should end when the user inputs an empty line. Here is an applet that simulates my
solution to this problem:

 */