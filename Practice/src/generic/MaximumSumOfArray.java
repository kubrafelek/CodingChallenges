package generic;

public class MaximumSumOfArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1}, {8, 4}, {2, 6, 9}, {8, 5, 9, 3}};
        int[][] array2 = new int[][]{{215}, {193, 124}, {117, 237, 442}, {218, 935, 347, 235}, {320, 804, 522, 417, 345}, {229, 601, 723, 835, 133, 124}, {248, 202, 277, 433, 207, 263, 257}, {359, 464, 504, 528, 516, 716, 871, 182}, {461, 441, 426, 656, 863, 560, 380, 171, 923}, {381, 348, 573, 533, 447, 632, 387, 176, 975, 449}, {223, 711, 445, 645, 245, 543, 931, 532, 937, 541, 444}, {330, 131, 333, 928, 377, 733, 15, 778, 839, 168, 197, 197}, {131, 171, 522, 137, 217, 224, 291, 413, 528, 520, 227, 229, 928}, {223, 626, 28, 683, 839, 43, 627, 310, 713, 999, 629, 817, 410, 121}, {924, 622, 911, 233, 325, 139, 721, 218, 253, 223, 107, 233, 230, 124, 233}};
        System.out.println("Max Sum of array is " + maxSum(array));
        System.out.println("Max Sum of array2 is " + maxSum(array2));
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                System.out.print(array[i][j] + "\t\t");
            }

            System.out.println();
        }

    }

    public static int maxSum(int[][] array) {
        int[][] newArray = array;

        for (int i = array.length - 2; i >= 0; --i) {
            for (int j = 0; j < newArray[i].length; ++j) {
                int a = newArray[i][j];
                int b = newArray[i + 1][j];
                int c = newArray[i + 1][j + 1];
                if (!checkPrime(b) || !checkPrime(c) || !checkPrime(c) && !checkPrime(b)) {
                    array[i][j] = a + Math.max(c, b);
                }
            }
        }

        return array[0][0];
    }

    public static boolean checkPrime(int number) {
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
