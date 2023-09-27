import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(welcome());
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(greeting(name));
        int systemNumber = generateRandomNumber();
        startTheGame(scanner);
        boolean isWinner = checkUserNumber(systemNumber, scanner);

        if (isWinner) {
            System.out.printf("%s, you are a winner!\n", name);
        } else {
            System.out.printf("%s, you ran out of attempts.\n", name);
        }

        System.out.println(gameOver());
        scanner.close();
    }



/**
 * The function "welcome" returns a string that says "Welcome to the game".
 *
 * @return The string "Welcome to the game" is being returned.
 */
    public static String welcome() {
        return "Welcome to the game";
    }



    /**
     * Returns a greeting message with the given name.
     *
     * @param name the name of the person to greet
     * @return a greeting message with the given name
     */
    public static String greeting(String name) {
        return "Hello " + name;
    }


    /**
     * This method starts the game by prompting the user to press Y to start the game.
     * It will keep prompting the user until they press Y (case-insensitive).
     *
     * @param scanner the scanner object used to read user input
     */
    public static void startTheGame(Scanner scanner) {
        String choice;
        do {
            System.out.println("Press Y to start the game.");
            choice = scanner.next();
        } while (!choice.equalsIgnoreCase("Y"));
    }


    /**
     * Generates a random number between 1 and 100 (inclusive).
     *
     * @return the randomly generated number
     */
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }


    /**
     * Checks if the user's input matches the system generated number within 5 attempts.
     * @param systemNumber the randomly generated number by the system.
     * @param scanner the scanner object to read user input.
     * @return true if the user's input matches the system generated number, false otherwise.
     */
    public static boolean checkUserNumber(int systemNumber, Scanner scanner) {
        int attempts = 10;
        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter a number between 1 and 100: ");
            int userNumber = scanner.nextInt();

            if (systemNumber == userNumber) {
                return true;
            } else if (userNumber > systemNumber) {
                System.out.println("Guess lower.");
            } else {
                System.out.println("Guess higher.");
            }
        }
        return false;
    }


    /**
     * Returns a string indicating that the game is over.
     *
     * @return a string indicating that the game is over
     */
    public static String gameOver() {
        return "Game Over.";
    }
}
