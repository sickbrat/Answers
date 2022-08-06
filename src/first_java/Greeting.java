package first_java;
import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println(name + ", how are you?");
    }
}
