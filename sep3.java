
//waap to sort n number of names in lexicographical order using  array sort function
//n would be user given input and names would be user given 

import java.util.Scanner;
import java.util.Arrays;
public class sep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        System.out.println("Names in lexicographical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
