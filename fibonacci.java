// write a program in Java that calculates the kth Fibonacci number using recursion.
// Sure! Below is a simple Java program that calculates the kth Fibonacci number using recursion:```java
// import java.util.Scanner;
import java.util.Scanner;

public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci number you want to calculate: ");
        int k = scanner.nextInt();
        System.out.println("The " + k + "th Fibonacci number is: " + fibonacci(k));
    }
}