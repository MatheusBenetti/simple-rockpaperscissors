import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Rock, Paper and Scissors game!");
        System.out.println("""
                Select one of the options:\s
                1 - Play the game
                2 - Quit
                """);
        System.out.print("Enter your choice: ");
        int menuOption = Integer.parseInt(scanner.nextLine());

        while (menuOption != 2){
            System.out.println("""
                    Select one of the options:\s
                    1 - Rock
                    2 - Paper
                    3 - Scissor""");
            System.out.print("Enter your choice: ");

            int gameOption = Integer.parseInt(scanner.nextLine());

            int random = new Random().nextInt(3) + 1;

            if (gameOption == 1 && random == 3) {
                System.out.println("Opponent: " + random);
                System.out.println("Rock beats scissor. You won!");
            } else if (gameOption == 2 && random == 1) {
                System.out.println("Opponent: " + random);
                System.out.println("Paper beats rock. You won!");
            } else if (gameOption == 3 && random == 2) {
                System.out.println("Opponent: " + random);
                System.out.println("Scissor beats paper. You won!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println("\n");
            System.out.println("""
                Select one of the options:\s
                1 - Play again
                2 - Quit
                """);
            System.out.print("Enter your choice: ");
            menuOption = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("See you later!");

    }

    public static void main(String[] args) {
        RockPaperScissors.play();
    }
}
