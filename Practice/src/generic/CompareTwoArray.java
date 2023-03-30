package generic;

import java.util.Arrays;

public class CompareTwoArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 4, 4, 5};

        int index = Arrays.mismatch(array1, array2);

        if (index == -1) {
            System.out.println("Arrays are identical");
        } else {
            System.out.println("First mismatch at index: " + index);
        }

        //Mismatch method returns the index of the first mismatch between two arrays.
        //It returns -1 if the two arrays are identical.
    }
}
