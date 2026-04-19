package arrays;

/*
1b. ArrayList Programs (Combined)

1. Search whether the color "Red" is available or not
2. Remove the 2nd element and "Blue"
3. Sort the ArrayList using Collections.sort()
4. Extract 1st and 2nd elements using subList()
5. Delete nth element using remove by index
*/

import java.util.*;

public class firstb {

    public static void main(String[] args) {

        // Create ArrayList
        List<String> colors = new ArrayList<>();

        // Add colors
        colors.addAll(Arrays.asList("Blue", "Green", "Red", "Yellow", "Black"));

        System.out.println("Original List: " + colors);

        // 1. Search for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red is present in the list");
        } else {
            System.out.println("Red is NOT present");
        }

        // 2. Remove 2nd element (index 1) and "Blue"
        colors.remove(1);       // removes 2nd element
        colors.remove("Blue");  // removes Blue
        System.out.println("After removing 2nd element and Blue: " + colors);

        // 3. Sorting
        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);

        // 4. Extract 1st and 2nd elements
        List<String> sub = colors.subList(0, Math.min(2, colors.size()));
        System.out.println("SubList (1st & 2nd elements): " + sub);

        // 5. Delete nth element (example: index 1)
        int n = 1;
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After deleting element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}