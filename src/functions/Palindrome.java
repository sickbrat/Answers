package functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        plaid(n);
    }
    static void plaid(int n) {
        int r, sum = 0, temp;

        temp = n;
        while(n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("Palindrome Number ");
        else
            System.out.println("not Palindrome");
    }
}
