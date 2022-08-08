package conditional_loops_intermediate;

import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        Vowel_Or_Consonants(ch);
    }
    static void Vowel_Or_Consonants(char x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println(x + " is a Vowel.");
        } else {
            System.out.println(x + " is a Consonant.");
        }
    }
}
