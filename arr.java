// write a java program to tAKE inpput 5 elements randomly 
// take input name key 
// sort the arrat of 5 elements 
// do a binary search over the array for the inserted key 

// write a function to print the array for last x elements {1,5} added by four 
// import java.util.Arrays;
import java.util.Scanner;

public class arr {
    // Function to perform binary search
    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid; // key found
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // key not found
    }

    // Function to print array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Function to print last x elements, each increased by 4
    static void printLastXPlusFour(int[] arr, int x) {
        int n = arr.length;
        System.out.print("Last " + x + " elements +4: ");
        for (int i = n - x; i < n; i++) {
            System.out.print((arr[i] + 4) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter key to search:");
        int key = sc.nextInt();

        // Sort array
        java.util.Arrays.sort(a);
        System.out.print("Sorted array: ");
        printArray(a);

        // Binary search
        int result = binarySearch(a, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found.");
        }

        // Example: print last 2 elements +4
        printLastXPlusFour(a, 2);

        sc.close();
    }
}
