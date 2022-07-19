package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        double miles = input.nextDouble();
        System.out.println("How much gas was consumed?");
        double gas = input.nextDouble();
        double milesPerGallon = miles/gas;
        System.out.println("You have consumed " + milesPerGallon + "mpg.");
    }
}
