package youtube;

public class StringsWrong {

    private static int NUMBER = 1_000_000;

    public static void main(String[] args) {
        String a = "A";
        String b = null;
        String result = a + b;
        System.out.println("First " + result);

        StringBuilder sb = new StringBuilder();
        sb.append(b);
        System.out.println("Second " + sb.toString());

        long now = System.currentTimeMillis();
        slow();
        System.out.println("slow elapsed " + (System.currentTimeMillis() - now) + " ms");

        now = System.currentTimeMillis();
        fast();
        System.out.println("fast elapsed " + (System.currentTimeMillis() - now) + " ms");

    }

    private static void fast() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < NUMBER; i++) {
            s.append("*");
        }
    }

    private static void slow() {
        String s = "";
        for (int i = 0; i < NUMBER; i++) {
            s += "*";
        }
    }
}
