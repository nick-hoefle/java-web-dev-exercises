package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int oneInt : integerArray) {
            if (oneInt % 2 != 0) {
                System.out.println(integerArray[oneInt]);
                continue;
            }
            System.out.println("Not here");
        }
        String paragraph = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] paragraphArray = paragraph.split("\\.");
        System.out.println(Arrays.toString(paragraphArray));
    }
}
