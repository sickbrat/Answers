package conditional_loops_intermediate;

import java.util.ArrayList;
import java.util.List;

public class Addition_2_Numbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(90);
        int sum = 0;
        for (Integer integer : list) sum += integer;

        System.out.println("sum-> " + sum);
    }
}
