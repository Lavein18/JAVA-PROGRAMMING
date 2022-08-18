package Simple_java_programming;

import java.util.Scanner;

public class min_of_2 {
    public static void main(String args[]) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number a : ");
        a = scan.nextInt();
        System.out.print("\nEnter number b : ");
        b = scan.nextInt();
        if (a < b)
            System.out.println("\na is smaller");
        else
            System.out.println("\nb is  smaller");
    }
}
