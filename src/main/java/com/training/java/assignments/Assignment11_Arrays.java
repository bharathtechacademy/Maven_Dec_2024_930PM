package com.training.java.assignments;

public class Assignment11_Arrays {
    public static void main(String[] args) {
        // Given array of numbers
        int[] numbers = {12, 34, 11, 36, 87, 98, 93};
        
        // Initialize the min variable with the first element of the array
        int min = numbers[0];

        // Iterate through the array to find the minimum value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Variables to store the largest, second largest, and third largest numbers
        int largest = min;
        int secondLargest = min;
        int thirdLargest = min;

        // Iterate through the array to find the largest, second largest, and third largest
        for (int num : numbers) {
            if (num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != largest && num != secondLargest) {
                thirdLargest = num;
            }
        }

        // Print the results
        System.out.println("Second largest number: " + secondLargest);
        System.out.println("Third largest number: " + thirdLargest);
    }
}
