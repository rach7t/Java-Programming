import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        byte b = sc.nextByte();
        short s = sc.nextShort();
        double d = sc.nextDouble();
        char ch = sc.next().charAt(0);
        boolean bl = sc.nextBoolean();
        sc.nextLine();
        String str = sc.nextLine();
        long lg = sc.nextLong();
        float ft = sc.nextFloat();
        System.out.println();
        System.out.println("Your inputs are : " + x + ' ' + b + ' ' + s + ' ' + d + ' ' + ch + ' ' + bl + ' '  + str + ' ' + lg + ' ' + ft);
    }
}