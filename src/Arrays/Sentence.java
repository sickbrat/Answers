package Arrays;

public class Sentence {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPanicV4(sentence));
    }
    static boolean checkIfPanicV4(String str) {
        boolean[] yo = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.length() <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            else
                continue;
            yo[index] = true;
        }
        for (int i = 0; i < 25; i++)
            if (!yo[i])
                return false;

        return true;
    }
}
