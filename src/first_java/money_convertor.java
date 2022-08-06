package first_java;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class money_convertor {
    public static void main(String[] args) {
        long INR;
        long USD;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your amount: ");
        long amount = sc.nextInt();

        System.out.println("Amount in INR: " + "INR" + (amount * 79.85));
        System.out.println("Amount in USD: " + "$" + (amount / 79.85));
        }
    }

