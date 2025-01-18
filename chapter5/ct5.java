package chapter5;

import java.util.Scanner;

public class ct5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Critical Thinking 5");
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int product = calculateProduct(numbers, 0);
        System.out.println("Product of all numbers: "  +  product);
    }

    public static int calculateProduct(int[] numbers, int index) {
       
        if (index == numbers.length) {
            return 1; 
        }
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}
