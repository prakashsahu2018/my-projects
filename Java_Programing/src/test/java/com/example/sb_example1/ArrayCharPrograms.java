package com.example.sb_example1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArrayCharPrograms {

    @Test
    void Test() {
        Character[] arr = {'a', 'b', 'c', 'a', 'e', 'f'};
        System.out.println("Array elements : " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        System.out.println("Array length : " + arr.length);
        System.out.println("========================================================");

        /*Duplicate element*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element : " + arr[i]);
                }
            }
        }
        System.out.println("========================================================");

        /*Count of duplicate element*/
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Count of duplicate element : " + arr[i] + " : " + count);
            }
        }
        System.out.println("========================================================");

        /*Count of each element*/
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("Count of each element : " + arr[i] + " : " + count);
        }
        System.out.println("========================================================");

        /*Small Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                System.out.println("Small Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Vowel Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                System.out.println("Vowel Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Vowel Count*/
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                count++;
            }
        }
        System.out.println("Vowel Count : " + count);
        System.out.println("========================================================");

        /*Consonant Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a' && arr[i] != 'e' && arr[i] != 'i' && arr[i] != 'o' && arr[i] != 'u') {
                System.out.println("Consonant Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Special Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isLetter(arr[i])) {
                System.out.println("Special Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Digit Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                System.out.println("Digit Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Alphanumeric Charcter*/
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetterOrDigit(arr[i])) {
                System.out.println("Alphanumeric Charcter : " + arr[i]);
            }
        }
        System.out.println("========================================================");

        /*Reverse array*/
        Character[] reverse = new Character[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println("Reverse array : " + reverse[0] + " " + reverse[1] + " " + reverse[2] + " " + reverse[3] + " " + reverse[4] + " " + reverse[5]);
        System.out.println("========================================================");

        /*Find the smallest element*/
        char min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element : " + min);
        System.out.println("========================================================");

        /*Find the largest element*/
        char max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element : " + max);
        System.out.println("========================================================");

        /*Find the second largest element*/
        char secondLargest = arr[0];
        char largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element : " + secondLargest);
        System.out.println("========================================================");


    }


}
