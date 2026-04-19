package arrays;

/*
1c. Linked List Programs (Combined)

1. Iterate through all elements starting from 2nd position using iterator
2. Iterate linked list in reverse order using descendingIterator()
3. Insert element at end using offerLast()
4. Display elements and their positions using get(p)
5. Swap first and third elements using Collections.swap()
*/

import java.util.*;

public class firstc {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.addAll(Arrays.asList("Apple", "Banana", "Orange", "Mango"));

        System.out.println("Original List: " + list);

        // 1. Iterate from 2nd position (index 1)
        System.out.println("\nIterating from 2nd position:");
        ListIterator<String> it1 = list.listIterator(1);
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // 2. Reverse iteration
        System.out.println("\nReverse order:");
        Iterator<String> it2 = list.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // 3. Insert at end
        list.offerLast("Pink");
        System.out.println("\nAfter adding at end: " + list);

        // 4. Display elements with positions
        System.out.println("\nElements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }

        // 5. Swap first and third elements
        if (list.size() >= 3) {
            Collections.swap(list, 0, 2);
            System.out.println("\nAfter swapping 1st and 3rd elements: " + list);
        } else {
            System.out.println("\nNot enough elements to swap");
        }
    }
}