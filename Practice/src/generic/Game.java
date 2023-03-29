package generic;

public class Game {

    public static void main(String[] args) {
        int countPlayerA = 0;
        int countPlayerB = 0;
        int countTies = 0;

        for (int gameCount = 0; gameCount < 200; ++gameCount) {
            int playerA = 2;
            int playerB = (int) (Math.random() * 3.0);
            System.out.println("scissor (0), rock (1), paper (2): ");
            if (playerA == 2) {
                if (playerB == 0) {
                    System.out.println("The PlayerB is scissor. The PlayerA is paper. PlayerB won.");
                    ++countPlayerB;
                } else if (playerB == 1) {
                    System.out.println("The playerB is rock. The PlayerA is paper. PlayerA won.");
                    ++countPlayerA;
                } else if (playerB == 2) {
                    System.out.println("The playerB is paper. The PlayerA is paper. It is a draw");
                    ++countTies;
                }
            }
        }

        System.out.println("*********GAME OVER*********");
        System.out.println("Player A wins " + countPlayerA + " of 100 games");
        System.out.println("Player B wins " + countPlayerB + " of 100 games");
        System.out.println("Tie: " + countTies + " of 100 games");
        System.out.println("*********GAME OVER*********");
    }
}