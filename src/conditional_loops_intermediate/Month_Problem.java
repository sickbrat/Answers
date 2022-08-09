package conditional_loops_intermediate;

public class Month_Problem {
    public static void main(String[] args) {
        int count =0;
        for (int i=1; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("No. of days = " + count);
    }
}

