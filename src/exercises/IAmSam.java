package exercises;

import java.util.Arrays;

public class IAmSam {
    public static void main(String[] args) {
        String iAmSam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] samArray = iAmSam.split("\\.");
        System.out.println(Arrays.toString(samArray));
    }
}
