package first_java;
import java.util.*;

public class verySimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation: ");
        char op = sc.next().charAt(0);

        int o = 0;
        switch (op) {
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o = num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;
            default:
                System.out.println("You enter wrong input");
                break;
        }
        System.out.println();
        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}

