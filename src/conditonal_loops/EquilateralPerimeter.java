package conditonal_loops;

import java.util.Scanner;

public class EquilateralPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side: ");
        int side = sc.nextInt();

        System.out.println(circum(side));
    }
    static int circum(int side) {
        return 3 * side;
    }
}
