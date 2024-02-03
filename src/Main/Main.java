package Main;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* List<Integer> list = new ArrayList<Integer>(); */    // can insert only Integer data type
        /* List<String> list = new ArrayList<String>(); */      // can insert only String data type

        List list = new ArrayList();    // can insert any data type

        list.add("Viraj");  // adds the value to the list
        list.add(2002);
        list.add("Dilshan");
        list.add(true);
        list.add(50.75);    // adds the value to the list

        System.out.println(list.isEmpty());       // false
        System.out.println(list);                // [Viraj, 2002, true, 50.75]
        System.out.println(list.size());        // 5

        System.out.println(list.contains("Viraj"));    // true
        System.out.println(list.indexOf(2002));       // 1

        System.out.println(list.get(2));            // Dilshan
        list.set(2, "Viraj Dilshan");              // replaces the value at the given index
        System.out.println(list.get(2));          // Viraj Dilshan

        list.add(1, 2024);               // inserts the value at the given index
        System.out.println(list);                    // [Viraj, 2024, 2002, Viraj Dilshan, true, 50.75]
        System.out.println(list.size());            // 6

        Object removedValue = list.remove(2);               // captures the removed value   ->  2002
        System.out.println("Deleted value: " + removedValue);    // Deleted value: 2002
        System.out.println(list);                               // [Viraj, 2024, Viraj Dilshan, true, 50.75]

        boolean isRemoved = list.remove("Viraj");             // stores the boolean value   ->  true
        System.out.println("Is Viraj removed? " + isRemoved);   // Is Viraj removed? true
        System.out.println(list);                              // [2024, Viraj Dilshan, true, 50.75]

        list.clear();
        System.out.println(list);           // removes all the values   ->   []

        /* Object[] array = list.toArray();     ->      converts the list to an array */
    }
}
