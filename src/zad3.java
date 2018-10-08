/*
Exercise 3:
        Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        Example:
        int[] array = {3,2,14,1,2,3,6};

        should print true
*/

public class zad3 {
    public static void main(String[] args) {

        int[] array = {3,2,1,14,1,1,1,2,2,1,1,2,1,2,3,3,3,5,1,2,3};
        int[] pattern = {1,2,3};

        int array_check_size, pattern_check_size, k = 0;

        array_check_size = array.length;
        pattern_check_size = pattern.length;
        boolean found = false;

        for (int i = 0; i < array_check_size; i++) {
            if (array[i] == pattern[k]) {
                k++;
            } else {
                k = 0;
            }
            if (k == pattern_check_size) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("True\nMatch found!");
        } else {
            System.out.println("False\nNo match found.");
        }
    }
}
