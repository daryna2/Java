package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int count_2 = 1;
        while (count_2 != 6) {
            System.out.println("Count value is " + count_2);
            count_2++;
        }
        count_2 = 1;
        while (true) {
            if (count_2 == 5) {
                break;
            }
            System.out.println("Count value is " + count_2);
            count_2++;
        }
        int n = 4;
        int finishNumber = 20;
        int totalFound = 0;
        while (n <= finishNumber) {
            n++;
            if (!isEvenNumber(n)) {
                continue;
            }

            totalFound++;
            if (totalFound >= 5) {
                break;
            }
            System.out.println("Even number " + n);
        }

        System.out.println("Total even numbers found " + totalFound);

        printDay(3);
        printNumberInWord(5);
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2017));
        System.out.println(getDaysInMonth(2, -1993));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(isOdd(10));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("******************************");
        for (int i = 8; i >= 5; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        int count_1 = 0;
        int number = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                number += i;
                count_1++;
                System.out.println("This number met both condition " + i);
            }
            if (count_1 == 5) {
                break;
            }
        }
        System.out.println(number);

        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else if (value == 3) {
            System.out.println("Value was 3");
        } else {
            System.out.println("Was not 1,2,3");
        }
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Value was a 4 or a 5 or a 6");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1,2,3");
        }
        char challenge = 'D';
        switch (challenge) {
            case 'A':
                System.out.println("It was A");
                break;
            case 'B':
                System.out.println("It was B");
                break;
            case 'C':
            case 'D':
                System.out.println(challenge + " was found ");
                break;
            default:
                System.out.println("Maybe it was E");
                System.out.println("Not found");
                break;
        }
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
        printDayOfWeek(3);
    }

    private static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    public static void printDay(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("other");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if ((year % 4) != 0) {
            return false;
        } else if ((year % 100) != 0) {
            return true;
        } else if ((year % 400) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        boolean years = isLeapYear(year);
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (years) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

            }

        }
        return -1;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    static public int sumOdd(int start, int end) {
        int numSum = 0;
        if ((end < start) || (start < 0)) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    numSum += i;

                }
            }
            return numSum;
        }
    }

    public static boolean isEvenNumber(int n) {
        if ((n % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
