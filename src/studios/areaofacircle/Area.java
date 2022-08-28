package studios.areaofacircle;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");

        radius = Double.valueOf(input.next());

        if (Double.isNaN(radius) || radius < 0 || radius.toString().equals("")){
            System.out.println("Invalid Input");
        } else {
            System.out.println(radius);
            System.out.println("The area of the circle is " + (Circle.getArea((radius))));
        }
        input.close();
    }
}
