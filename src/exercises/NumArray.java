package exercises;

public class NumArray {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};

        for (int i : numArray) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
