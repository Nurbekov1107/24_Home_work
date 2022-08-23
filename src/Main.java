import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }

        System.out.println("Array: before sort" + Arrays.toString(array));
        method(array);
        System.out.println("Array: after sort" + Arrays.toString(array));

        System.out.println("ArrayList: before sort" + arrayList);
        method(arrayList);
        System.out.println("ArrayList: after sort" + arrayList);

        System.out.println("LinkedList: before sort" + linkedList);
        method(linkedList);
        System.out.println("LinkedList: after sort" + linkedList);

    }

    public static void method(int[] array) {
        Arrays.sort(array);
    }
    public static void method(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }
    public static void method(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
    }

}