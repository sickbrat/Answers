package conditional_loops_intermediate;
import java.util.*;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of Current: ");
        double amps = sc.nextDouble();
        System.out.print("Enter the Voltage: ");
        double volts = sc.nextDouble();
        System.out.print("Enter total Usage: ");
        double usage = sc.nextDouble();
        System.out.print("Enter Electricity Rate: " );
        System.out.println();
        double electricity = sc.nextDouble();

        System.out.println("Electricity Bill = " + Bill(amps, volts, usage, electricity));
    }
    static double Bill(double amps, double volts, double usage, double electricity_rate) {
        double Watts = (amps) * (volts);
        double Kilowatt_hours = (Watts) * (usage) / 1000;
        return (Kilowatt_hours) * (electricity_rate);
    }
}
