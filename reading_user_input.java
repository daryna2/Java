package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 -yearOfBirth;
            if (age>=0 && age<=100) {
                System.out.println("Your name is " + name +", and you are "+ age+" years old.");
            }else
                System.out.println("Invalid year of birth");
        }else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
       Scanner nextScanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean validValue = nextScanner.hasNextInt();
            if (validValue) {
                int number = nextScanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            nextScanner.nextLine();
        }
        System.out.println("sum = "+ sum);
        nextScanner.close();

       Scanner maxMinScanner = new Scanner(System.in);
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;
        while(true) {
            System.out.println("Enter number: ");
            boolean isInt = maxMinScanner.hasNextInt();
            if(isInt) {
                int input = maxMinScanner.nextInt();
//                if(first) {
//                    first = false;
//                    min = input;
//                    max = input;
//                }
                if(input>max) {
                    max = input;
                }
                if(input < min) {
                    min = input;
                }
            }else {
                break;
            }

            maxMinScanner.nextLine();
            }
              System.out.println("max = "+max+ "  min = "+min);
        maxMinScanner.close();


        }
        public static void inputThenPrintSumAndAverage() {
        long average = 0;
        int sum = 0;
        int count = 0;
        Scanner scanner  = new Scanner (System.in);
        while(true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = Math.round((double) sum / (double) count);
            }else{
                break;
            }

        }
            System.out.println("SUM = "+ sum+" AVG = "+average);
        scanner.close();
        }
}


