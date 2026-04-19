package arrays;

/*
1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList 
to perform the following operations:
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 
4. Accessing elements, 5. Updating elements, 6. Removing elements, 
7. Searching elements, 8. List size, 9. Iterating over list, 
10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
*/

import java.util.*;

public class firsta {

    public static void operations(List<String> list) {

        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 2. Add at index
        list.add(1, "Mango");

        // 3. Add multiple
        list.addAll(Arrays.asList("Grapes", "Pineapple"));

        // 4. Access
        System.out.println("Element at 2: " + list.get(2));

        // 5. Update
        list.set(0, "Green Apple");

        // 6. Remove
        list.remove("Banana");

        // 7. Search
        System.out.println("Contains Orange: " + list.contains("Orange"));

        // 8. Size
        System.out.println("Size: " + list.size());

        // 9. Iterate (for-each)
        for (String s : list)
            System.out.println(s);

        // 10. Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // 11. Sorting
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // 12. Sublist
        System.out.println("Sublist: " + list.subList(0, 2));

        // 13. Clear
        list.clear();
        System.out.println("After clear: " + list);
    }

    public static void main(String[] args) {

        System.out.println("ArrayList:");
        operations(new ArrayList<>());

        System.out.println("\nLinkedList:");
        operations(new LinkedList<>());
    }
}