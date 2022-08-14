package functions;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = sd.nextInt();

        System.out.println(Factorial(num));
    }
    static int Factorial(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
