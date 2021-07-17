package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,5,3,7,9,9,15};
        reverse(array);
    }

    private static void reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        int maxIndex = reversedArray.length - 1;
        int halfLength = reversedArray.length/2;
        for (int i = 0; i< halfLength;i++) {
int temp = reversedArray[i];
reversedArray[i] = reversedArray[maxIndex-i];
reversedArray[maxIndex-i] = temp;
        }
        System.out.println("Array = "+ Arrays.toString(array));
        System.out.println("Reversed array = "+Arrays.toString(reversedArray));
    }
}
