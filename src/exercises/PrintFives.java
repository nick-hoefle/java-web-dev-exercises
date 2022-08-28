package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintFives {
    public static void getFives(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters in each word?: ");
        int searchNumber = input.nextInt();
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() == searchNumber) {
                System.out.println(arr.get(i));
            }
        }
    }

}
