package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxPathSumOfTriangle {

    public static final int ROW = 15;
    public static final int COLUMN = 15;
    public static int[][] newArray = new int[15][15];

    public FindMaxPathSumOfTriangle() {
    }


    public static int findMaxSum(String fileName, ArrayList<Coodinates> path) throws FileNotFoundException {
        readNumbersFromFile(fileName, newArray);
        return checkPrime(newArray[0][0]) ? 0 : findMaxSumRec(0, 0, 15, path);
    }

    private static int findMaxSumRec(int x, int y, int size, ArrayList<Coodinates> path) {
        int totalLeft = 0;
        int totalRight = 0;
        ArrayList<Coodinates> tempListLeft = new ArrayList();
        ArrayList<Coodinates> tempListRight = new ArrayList();
        if (x >= size) {
            return 0;
        } else if (x == size - 1) {
            path.add(new Coodinates(x, y, newArray[x][y]));
            return newArray[x][y];
        } else {
            if (!checkPrime(newArray[x + 1][y])) {
                totalRight = findMaxSumRec(x + 1, y, size, tempListRight);
            }

            if (!checkPrime(newArray[x + 1][y + 1])) {
                totalLeft = findMaxSumRec(x + 1, y + 1, size, tempListLeft);
            }

            if (checkPrime(newArray[x + 1][y + 1]) && checkPrime(newArray[x + 1][y])) {
                return Integer.MIN_VALUE;
            } else if (totalLeft > totalRight) {
                path.addAll(tempListLeft);
                path.add(new Coodinates(x, y, newArray[x][y]));
                return totalLeft + newArray[x][y];
            } else {
                path.addAll(tempListRight);
                path.add(new Coodinates(x, y, newArray[x][y]));
                return totalRight + newArray[x][y];
            }
        }
    }

    private static boolean checkPrime(int number) {
        for (int i = 2; i < number; ++i) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void readNumbersFromFile(String fileName, int[][] numbersArray) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(inputStream);

        for (int index = 0; scanner.hasNextLine(); ++index) {
            String line = scanner.nextLine();
            String[] numbers = line.split("\\s+");

            for (int i = 0; i < numbers.length; ++i) {
                numbersArray[index][i] = Integer.parseInt(numbers[i]);
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Coodinates> path = new ArrayList();
        System.out.printf("Maximum Path Sum is %d", findMaxSum("/Users/kubrafelek/Workspace/CodingChallenges/Practice/src/resources/text.txt", path));
    }

    private static class Coodinates {
        private int x;
        private int y;
        private int number;

        public Coodinates(int x, int y, int number) {
            this.x = x;
            this.y = y;
            this.number = number;
        }
    }
}