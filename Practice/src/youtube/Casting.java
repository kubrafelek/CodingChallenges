package youtube;

import java.util.List;

public class Casting {

    public static void main(String[] args) {
        List<Integer> marks = List.of(new Integer[]{50, 30, 20, 80, 70});
        int res = calculate(marks);
        double size = (2 / 5.0) * 100;
        System.out.println((int) size);
    }

    public static int calculate(List<Integer> marks) {
        double avg = 0;
        int count = 0;
        for (int i = 0; i < marks.size(); i++) {
            avg += marks.get(i);
        }

        avg /= marks.size();

        for (int mark : marks) {
            if (mark > avg) {
                count++;
            }
        }

        return count;
    }
}
