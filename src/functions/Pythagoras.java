package functions;

public class Pythagoras {
    public static void main(String[] args) {

        int[] ar = {3, 1, 6, 5};
        int ar_size = ar.length;
        if (isTriplet(ar, ar_size))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean isTriplet(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = array[i] * array[i], y = array[j] * array[j], z = array[k] * array[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }
        return false;
    }
}
