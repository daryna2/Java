package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(10);
        printConversion(5.1);
        printConversion(10.2);
        printConversion(-10);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);


        boolean dogBarking  = shouldWakeUp(true,1);
        System.out.println(dogBarking);
        dogBarking  = shouldWakeUp(false,2);
        System.out.println(dogBarking);
        dogBarking  = shouldWakeUp(true,44);
        System.out.println(dogBarking);
        dogBarking  = shouldWakeUp(true,-6);
        System.out.println(dogBarking);


        boolean leapYear = isLeapYear(-1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(2017);
        System.out.println(leapYear);
        leapYear = isLeapYear(2000);
        System.out.println(leapYear);

        boolean equalDecimal = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println(equalDecimal);
        equalDecimal = areEqualByThreeDecimalPlaces(3.155,3.176);
        System.out.println(equalDecimal);
        equalDecimal = areEqualByThreeDecimalPlaces(-4.125,3.123);
        System.out.println(equalDecimal);

       boolean equalSum =  hasEqualSum(2,2,4);
        System.out.println(equalSum);
        equalSum =  hasEqualSum(3,2,4);
        System.out.println(equalSum);









    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negativ");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h.");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesRest = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRest + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        }else if(hourOfDay>23 || hourOfDay<0){
            return false;
        }else if (hourOfDay < 8  || hourOfDay > 22) {
                return true;
            }
            return false;
        }


    public static boolean isLeapYear(int year){
        if (year<1  || year>9999 ) {
            return false;
        }if((year%4) != 0) {
            return false;
        }else if((year%100) != 0){
            return true;
        }else if((year%400) != 0){
            return false;
        }else{
            return true;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
        one = one*1000;
       two = two*1000;
       int numberOne = (int)one;
       int numberTwo = (int)two;
        if(numberOne == numberTwo){
            return true;

        }
        return false;
    }
    public static boolean hasEqualSum(int a, int b, int c) {
        if(c ==(a+b)) {
            return true;
        }
        return false;
    }
    public static boolean hasTeen(int d, int k, int j) {
        if(d>=13 && d<=19 || k>=13 && k<=19 || j>=13 && j<=19){
            return true;
        }
        return false;
    }
    public static boolean isTeen (int v) {
        if(v>=13 && v<=19){
            return true;
        }
        return false;
    }
}

