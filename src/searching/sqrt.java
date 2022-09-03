package searching;

public class sqrt {
    public static void main(String[] args) {
        int input = 49;
        System.out.println(mySqrt(input));
    }
    static int mySqrt(int x) {
        int t;
        int square = x / 2;

        do {
            t = square;
            square = (t + x / t) / 2;
        }
        while ((t - square) != 0);

        return square;
    }
}
