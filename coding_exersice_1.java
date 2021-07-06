package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double doubleNumber = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);
        System.out.println("doubleNumber " + doubleNumber);
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(0, 5, 5));
        System.out.println(getLargestPrime(45));
        printSquareStar(5);
        printSquareStar(8);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        int sumBig = bigCount * 5;
        int sumSmall = smallCount;
        if ((sumBig + sumSmall) < goal) {
            return false;
        } else if (bigCount > 0 && (goal % 5 == 0)) {
            return true;
        } else if ((goal % 5 != 0) && (smallCount >= (goal % 5))) {
            return true;
        } else if ((bigCount == 0) && (goal <= smallCount)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for(int row = 1; row <= number; row++) {
                for(int column = 1; column <= number; column++) {
                  if((row == 1) || (column == 1) ||(row == number) || (column == number)) {
                      System.out.print ('*');
                  }else if(row == column) {
                      System.out.print ('*');
                  }else if(column == number - row+1) {
                          System.out.print ('*');
                      }else{
                          System.out.print (' ');
                      }
                }
                System.out.println();
            }

        }
    }
}
