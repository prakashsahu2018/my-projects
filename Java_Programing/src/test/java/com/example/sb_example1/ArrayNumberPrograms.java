package com.example.sb_example1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArrayNumberPrograms {

    @Test
    void Test() {
        int[] arr = {1, 2, 4, 9, 8, 1};
        System.out.println("Array elements : " + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        System.out.println("Array length : " + arr.length);

        /*SUM of two number equal 10*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    System.out.println("SUM of two number equal 10 : " + arr[i] + "," + arr[j]);
                }
            }
        }

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


        /*Missing number*/
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Missing number : " + (sum - total));

        System.out.println("========================================================");

        /*Find the element which is repeated more than once*/
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Element which is repeated more than once : " + arr[i]);
            }
        }

        System.out.println("========================================================");

        /*Reverse array*/
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        System.out.println("Reverse array : " + reverse[0] + " " + reverse[1] + " " + reverse[2] + " " + reverse[3] + " " + reverse[4] + " " + reverse[5]);
        System.out.println("========================================================");

        /*Find the smallest element*/
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element : " + min);
        System.out.println("========================================================");


        /*Find the largest element*/
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element : " + max);
        System.out.println("========================================================");


        /*Find the second largest element*/
        int secondLargest = arr[0];
        int largest = arr[0];
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


        /*Find the second smallest element*/
        int secondSmallest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest element : " + secondSmallest);
        System.out.println("========================================================");

        /*Find the sum of alternate elements*/
        int sumOfAlternateElement = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sumOfAlternateElement += arr[i];
        }
        System.out.println("Sum of alternate elements : " + sumOfAlternateElement);
        System.out.println("========================================================");


        /*Find the sum of all elements*/
        int sumOfAllElement = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfAllElement += arr[i];
        }
        System.out.println("Sum of all elements : " + sumOfAllElement);
        System.out.println("========================================================");

        /*Find the average of all elements*/
        int avg = sumOfAllElement / arr.length;
        System.out.println("Average of all elements : " + avg);
        System.out.println("========================================================");

        /*Find the number of even elements*/
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of even elements : " + count);
        System.out.println("========================================================");

        /*Find the number of odd elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Number of odd elements : " + count);
        System.out.println("========================================================");

        /*Find the number of prime elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println("Number of prime elements : " + count);
        System.out.println("========================================================");

        /*Find the number of palindrome elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rev = 0;
            while (num != 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }
            if (arr[i] == rev) {
                count++;
            }
        }
        System.out.println("Number of palindrome elements : " + count);
        System.out.println("========================================================");

        /*Find the number of perfect square elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sqrt = (int) Math.sqrt(arr[i]);
            if (sqrt * sqrt == arr[i]) {
                count++;
            }
        }
        System.out.println("Number of perfect square elements : " + count);
        System.out.println("========================================================");

        /*Find the number of perfect cube elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int cbrt = (int) Math.cbrt(arr[i]);
            if (cbrt * cbrt * cbrt == arr[i]) {
                count++;
            }
        }
        System.out.println("Number of perfect cube elements : " + count);
        System.out.println("========================================================");

        /*Find the number of Armstrong elements*/
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sumOfTotal = 0;
            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sumOfTotal += Math.pow(digit, 3);
                temp /= 10;
            }
            if (num == sumOfTotal) {
                count++;
            }
        }
        System.out.println("Number of Armstrong elements : " + count);
        System.out.println("========================================================");
    }


}
