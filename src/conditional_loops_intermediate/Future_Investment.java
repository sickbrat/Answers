package conditional_loops_intermediate;

import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        /*
         PV = Money invested today
         T = Number of years
         r = Annual Interest rate
         m = Number of periods based on compounding frequency
         FV =  Future Investment Value
         FV = PV * (1 + r / m) ^ (mT)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money invested: ");
        long money = sc.nextLong();
        System.out.print("Enter the time-period: ");
        int time = sc.nextInt();
        System.out.print("Enter the interest rate: ");
        float interest = sc.nextFloat();
        System.out.print("Enter periods based on compounding frequency: ");
        float compound_frequency = sc.nextFloat();

        double X = (money * (1 + (interest / compound_frequency)));
        double Y = compound_frequency * time;

        System.out.println("Future Investment Value " + Math.pow(X, Y));
    }
}
