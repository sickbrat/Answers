package conditional_loops_intermediate;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String name = sc.nextLine();

        System.out.println("Reversed String is: " + rev(name));
    }
    static String rev(String sen) {
        StringBuilder revstr = new StringBuilder();
        char ch;

        for (int i = 0; i < sen.length(); i++) {
            ch  = sen.charAt(i);
            revstr.insert(0, ch);
        }
        return revstr.toString();
    }
}
