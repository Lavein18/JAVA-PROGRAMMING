package Simple_java_programming;

import java.util.Scanner;

public class digit_into_words {
    public static void main(String args[]) {
        int num, i;
        int temp;
        String st[] = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scan.nextInt();
        if (num == 0) {
            System.out.println("Zero");
            System.exit(0);
        }
        for (i = 0, temp = num % 10; num != 0; num = num / 10, temp = num % 10, i += 1) {

            switch (temp) {
                case 1:
                    st[i] = "one";
                    break;
                case 2:
                    st[i] = "Two";
                    break;
                case 3:
                    st[i] = "Three";
                    break;
                case 4:
                    st[i] = "Four";
                    break;
                case 5:
                    st[i] = "Five";
                    break;
                case 6:
                    st[i] = "six";
                    break;
                case 7:
                    st[i] = "Seven";
                    break;
                case 8:
                    st[i] = "Eight";
                    break;
                case 9:
                    st[i] = "nine";
                case 0:
                    st[i] = "zero";
                default: {
                }
            }
        }
        System.out.println("Output in words : ");
        for (int n = i - 1; n >= 0; n--) {
            System.out.print(st[n] + "   ");
        }
    }
}
