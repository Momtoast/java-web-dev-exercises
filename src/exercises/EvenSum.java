package exercises;

import java.util.ArrayList;

public class EvenSum {
    public static int evenSum(ArrayList<Integer> arr) {
        int sumTotal = 0;
        for (int integer : arr) {
            sumTotal += integer;
        }
        return sumTotal;
    }
}
