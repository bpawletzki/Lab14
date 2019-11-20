package edu.cscc;

public class BubbleSort {
    public static String[] sort(String[] list) {
        // Implement a Bubble Sort for a String array
        // Use the integer Bubble Sort from Unit 14 as a starting point
        // You'll need to use the String compareTo() method to compare Strings

        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j <= list.length - 2; j++)
                if (list[j].compareTo(list[j + 1])>0) {
                    //swap list[j] with list[j+1]
                    String temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
        return list;

    }
}
