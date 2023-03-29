package youtube;

public class Complexity {

    public static void main(String[] args) {

        int n = 10;
        int p = 0;
        int q = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    p = i + j + k;
                }
            }
        }
        System.out.println(p);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    q = i * j * k;
                }
            }
        }
        System.out.println(q);
    }
}
