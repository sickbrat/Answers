package first_java;

import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        System.out.println(isEligible(a));
    }
    static String isEligible(int age) {
        if (age >= 18) {
            return "Eligible";
        } else return "Not Eligible";
    }
}
