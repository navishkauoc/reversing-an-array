package com.timbuchalka;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] originalArray = new int[5];
        System.out.println("Enter 5 integers: ");
        for (int i=0; i<5; i++){
            originalArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        reverse(originalArray);

    }

    private static void reverse(int[] array){
        System.out.println("The non-reversed array is " + Arrays.toString(array));

        int element = 0;

        int halfLength = array.length/2;
        int maxIndex = array.length-1;
        for (int i=0; i<halfLength; i++){
            element = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = element;
        }

        System.out.println("The reversed array is : " + Arrays.toString(array));

    }

}
