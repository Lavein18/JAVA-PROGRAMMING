package Simple_java_programming;

import java.util.Scanner;

public class triangle_pattern {
    public static void main(String args[]) {
        int i, j, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of triangle : ");
        num = scan.nextInt();
        for (i = 0; i <= num; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
