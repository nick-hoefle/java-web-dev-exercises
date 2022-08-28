package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        String text = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] textSplit = text.split("\\W");

        ArrayList<String> textArrayList = new ArrayList<>(Arrays.asList(textSplit));
        System.out.println(textArrayList);
        PrintFives.getFives(textArrayList);
    }
}

