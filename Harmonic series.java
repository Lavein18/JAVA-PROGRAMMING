package Simple_java_programming;

import java.util.Scanner;

public class Harmonic_series {
    public static void main(String args[]) {
        int num, i;
        double sum = 0d;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = scan.nextInt();
        for (i = 1; i <= num; i++) {
            sum += 1d / (double) i;
        }
        System.out.println("The Sum of Harmonic Series is : " + sum);

    }
}
