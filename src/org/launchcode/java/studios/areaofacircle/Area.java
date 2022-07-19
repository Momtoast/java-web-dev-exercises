package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        if (radius>=0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of the circle is " + area);
        } else {
            System.out.println("Incorrect input.");
        }
        input.close();
    }
}
