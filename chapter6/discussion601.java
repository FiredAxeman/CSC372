package chapter6;

import java.util.Arrays;

public class discussion601 {

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {5, 2, 8, 1, 3, 9, 4};

        Arrays.sort(numbers);
        System.out.println("Sorted array of numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        String[] words = {"apple", "banana", "cherry", "avocado", "blueberry"};
        Arrays.sort(words);
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

}
