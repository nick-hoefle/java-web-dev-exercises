package exercises;

import java.util.Scanner;

public class Gas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double driven = input.nextDouble();
        System.out.println("How many gallons of gas have been consumed?");
        double gallons = input.nextDouble();
        double mpg = (driven / gallons);
        System.out.println("Trip MPG:" + mpg);
    }
}

