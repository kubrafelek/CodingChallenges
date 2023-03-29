package youtube;

import java.util.Arrays;

public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println("******Brute Force Method******");
        System.out.println("******Stream Api Method******");
        System.out.println("******TwoPointer Method******");
    }

    // Brute Force Method
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    //Stream Api
    public static int[] sortedSquaresWithStream(int[] nums) {
        return Arrays.stream(nums)
                .map(i -> i * i)
                .sorted().toArray();
    }

    //TwoPointer Method
    public int[] sortedSquaresWithTwoPointers(int[] nums) {
        int[] array = new int[nums.length];

        int i = 0;

        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];

            if (val1 > val2) {
                array[k] = val1;
                i++;
            } else {
                array[k] = val2;
                j--;
            }
            k--;
        }
        return array;
    }
}
