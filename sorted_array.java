package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);

    }
    public static void printArray(int[] number) {
        for(int i = 0; i<number.length;i++) {
            System.out.println("Element "+i+" contents "+number[i]);
        }
    }
    public static int[] getIntegers(int number) {
        int[] value = new int[number];
        System.out.println("Enter a "+number+" integers value");
        for(int i=0;i<value.length;i++) {
        value[i] = scanner.nextInt();
        }
        return value;
    }
    public static int[] sortIntegers(int[] number) {
       int[] sortedArray = new int[number.length];
       for(int i=0;i<number.length; i++) {
           sortedArray[i] = number[i];
       }
       boolean flag = true;
int temp;
while(flag) {
    flag = false;
    for(int i = 0;i< sortedArray.length-1; i++) {
        if (sortedArray[i] < sortedArray[i+1]) {
temp = sortedArray[i];
sortedArray[i] = sortedArray[i+1];
sortedArray[i+1] = temp;
flag = true;
        }
    }
}
return sortedArray;
}
    }

