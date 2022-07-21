package exercises;

import java.util.ArrayList;

public class CallEvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);
        numbers.add(4);
        numbers.add(34);
        numbers.add(99);
        numbers.add(2);
        numbers.add(13);
        numbers.add(93);
        numbers.add(87);
        numbers.add(33);
        System.out.println(EvenSum.evenSum(numbers));
    }
}

