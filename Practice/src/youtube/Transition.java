package youtube;

public class Transition {

    public static void main(String[] args) {

        String output = checkTransition(1, 4, 5, 9);
        String output2 = checkTransition(1, 1, 5, 2);
        System.out.println(output2);
    }

    public static String checkTransition(int a, int b, int c, int d) {
        if (a == c && b == d) {
            return "Yes";
        } else if (a > c || b > d) {
            return "No";
        } else {
            if (a < c)
                checkTransition(a + b, b, c, d);
            if (b < d)
                checkTransition(a, b + a, c, d);
            return "Yes";
        }
    }
}
