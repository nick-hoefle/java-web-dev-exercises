package exercises;
import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(4);
        int i = Sum.sumEven(arrayList);

    }
}
