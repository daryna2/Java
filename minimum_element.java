package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int number =  readInteger();
       int[] userArray = readElements(number);
        System.out.println(findMin(userArray));
    }
  private static int readInteger() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a count: ");
        int userInput = scanner.nextInt();
        return userInput;

   }
    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i=0;i<array.length;i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
            scanner.nextLine();

        }
        return array;
    }
    private static int findMin (int[] userArray ) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i< userArray.length;i++) {
            if(userArray[i]<min) {
                min = userArray[i];
            }
        }
        return min;
    }
}
