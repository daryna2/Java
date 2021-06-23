package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

	int myValue = 10000;
	int myMinValue = Integer.MIN_VALUE;
	int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " +myMinValue);
        System.out.println("Integer Maximum Value = " +myMaxValue);
        System.out.println("Busted MAX value = " +(myMaxValue+1));
        System.out.println("Busted MIN value = " +(myMinValue-1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Maximum Value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+myMinShortValue);
        System.out.println("Short Maximum Value = "+myMaxShortValue);


        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+myMinLongValue);
        System.out.println("Long Maximum Value = "+myMaxLongValue);
        long bigLongLiteralValue = 2147483649244L;
        System.out.println(bigLongLiteralValue);


        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue =(short) (myMinShortValue/2);

        byte myByteVariable = 10;
        short myShortVariable = 11;
        int myIntVariable = 50;
        long myLastTask =  50000L +10L*(myByteVariable+myShortVariable+myIntVariable);
        System.out.println(myLastTask);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.d /3.d;
        System.out.println("MyIntValue = "+ myIntValue);
        System.out.println("MyFloatValue = "+ myFloatValue);
        System.out.println("MyDoubleValue = "+ myDoubleValue);
        double convertKgToPound = 0.45359237d;
        double pounds = 5d;
        double convertResult = convertKgToPound * pounds;
        System.out.println("Converted kilograms = " +convertResult);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567;
        System.out.println(pi);
        System.out.println(anotherNumber);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char uniCodeChar = '\u00A9';
        System.out.println(uniCodeChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " +myString);
        myString = myString + " and this is more.";
        System.out.println(myString);
        myString = myString + "\u00A9";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString +"49.6";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        int result = 1+2;
        System.out.println("1+2= " +3);
        int previousResult = result;
        System.out.println("previousResult = "+ previousResult);
        result= result - 1;
        System.out.println("3-1=" + result);
        System.out.println("previousResult = "+previousResult);
        result = result*10;
        System.out.println(result);
        result = result/5;
        System.out.println(result);
        result = result % 3;
        System.out.println(result);
        result++;
        System.out.println("1+1 = " + result);
        result--;
        System.out.println("2-1 = " +result);
        result += 2;
        System.out.println("1+2 = " +result);
        result *= 10;
        System.out.println("3*10 = " + result);
        result /= 3;
        System.out.println("30/3 = "+ result);
        result -= 2;
        System.out.println("10-2 = " +result);
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 66;
        if (topScore != 100) {
            System.out.println("You got the high score");
        }
        int topScore1 = 97;
        if (topScore >= 90) {
            System.out.println("You got the high score");
        }
        int secondTopScore = 90;
        if ((topScore > secondTopScore) && (topScore<=100)) {
            System.out.println("Greater than top score and less or equal 100");
        }
        if ((topScore >90) || (secondTopScore <=90)) {
            System.out.println("Either or both of the condition are true!");

        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        boolean wasCar = (isCar) ? true:false;
        if(!wasCar) {
            System.out.println("wasCar is true");
        }
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double thirdVariable = (firstVariable + secondVariable)*100.00d;
        double nextVariable = thirdVariable % 40.00;
        System.out.println(nextVariable);
        boolean resultOfTask = (nextVariable ==0)? true:false;
        System.out.println(resultOfTask);

        if (!resultOfTask) {
            System.out.println("Got some remainder");
        }
    }
}
