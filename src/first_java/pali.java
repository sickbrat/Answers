package first_java;

import java.util.Scanner;

public class pali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a String: ");
        String s = sc.nextLine();

        System.out.println(palin(s) + "");
    }
    static boolean palin(String s) {
        String sd = "";
        boolean answer = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            sd  += s.charAt(i);
        }

        if (s.equals(sd)) {
            answer = true;
        }

        return answer;
    }
}
