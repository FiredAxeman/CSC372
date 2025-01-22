package chapter6;

public class discussion602 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i; // Found the target
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3, 9, 4};
        int targetNumber = 3;
        int indexNumber = linearSearch(numbers, targetNumber);

        if (indexNumber != -1) {
            System.out.println("Number " + targetNumber + " found at index " + indexNumber);
        } else {
            System.out.println("Number " + targetNumber + " not found.");
        }
        String[] words = {"apple", "banana", "cherry", "avocado", "blueberry"};
        String targetWord = "cherry";
        int indexWord = linearSearch(words, targetWord);

        if (indexWord != -1) {
            System.out.println("Word \"" + targetWord + "\" found at index " + indexWord);
        } else {
            System.out.println("Word \"" + targetWord + "\" not found.");
        }
    }
}
