// write a program in Java that calculates the kth Fibonacci number using recursion.
// Sure! Below is a simple Java program that calculates the kth Fibonacci number using recursion:```java

import java.util.Scanner;

public class fibonacci {

    public static int calculateFibonacci(int n) {

        // Base condition
        if (n <= 1) {
            return n;
        }

        // Recursive call
        return calculateFibonacci(n - 1)
             + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci number: ");
        int k = sc.nextInt();

        System.out.println(
            "The " + k + "th Fibonacci number is: "
            + calculateFibonacci(k)
        );

        sc.close();
    }
}

