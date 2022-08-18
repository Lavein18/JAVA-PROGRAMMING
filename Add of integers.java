package Simple_java_programming;

public class sum_of_integers {
    public static void main(String args[]) {
        int sum = 0, i;
        for (i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers between 100 and 200 that are divisible by 7 is : " + sum);
    }
}
