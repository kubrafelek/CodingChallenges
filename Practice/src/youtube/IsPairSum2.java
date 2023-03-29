package youtube;

import java.util.Arrays;

public class IsPairSum2 {

    public static void main(String[] args) {

        int[] arr = {10, 7, 3, 5, 8, 4, 6};
        isPairSum2(arr, 16);
    }

    public static void isPairSum2(int[] arr, int val) {

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == val) {
                return;
            } else if (arr[i] + arr[j] < val) {
                i++;
            } else {
                j--;
            }
        }

    }
}
