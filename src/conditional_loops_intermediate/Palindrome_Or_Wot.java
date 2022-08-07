package conditional_loops_intermediate;

import java.util.Scanner;

public class Palindrome_Or_Wot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
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
