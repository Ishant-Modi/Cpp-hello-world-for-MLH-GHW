import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your move (rock, paper, or scissors) or 'exit' to quit: ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                System.out.println("Exiting the game. Goodbye!");
                break;
            }

            if (!isValidMove(playerMove)) {
                System.out.println("Invalid move. Please enter rock, paper, or scissors.");
                continue;
            }

            String computerMove = generateComputerMove();
            System.out.println("Computer's move: " + computerMove);

            String result = determineWinner(playerMove, computerMove);
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static boolean isValidMove(String move) {
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }

    private static String generateComputerMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[new Random().nextInt(moves.length)];
    }

    private static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "It's a tie!";
        } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                   (playerMove.equals("paper") && computerMove.equals("rock")) ||
                   (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
