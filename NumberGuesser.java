import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    int score = 0;

    public void playgame() {
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Generate a new random number for each game
        //System.out.println("Random NUMBER" + " " + number);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        boolean numberguesser = false;

        while (attempts < 5) {
            System.out.println("Enter your Guess");
            int usernumber = scanner.nextInt();
            attempts++;
            int difference = usernumber - number;
            if (number == usernumber) {
                System.out.println("Correct Guess");
                numberguesser = true;
                break;
            }
            if (Math.abs(difference) <= 10) {
                if (difference > 0) {
                    System.out.println("Guess is a little high");
                } else {
                    System.out.println("Guess is a little low");
                }
            } else {
                if (difference > 0) {
                    System.out.println("Guess is too High");
                } else {
                    System.out.println("Guess is too low");
                }
            }



        }

        if (numberguesser) {
            score++;
        } else {
            System.out.println("You have used all your 5 attempts. The correct number is" + " " + number);
        }
    }

    public static void main(String[] args) {
        NumberGuesser n = new NumberGuesser();
        Scanner sc = new Scanner(System.in);
        String s = "yes";
        while (s.equals("yes")) {
            n.playgame();
            System.out.println("Do you want to play again (yes/no)");
            s = sc.next();
        }
        System.out.println("Your score of winning rounds is" + " " + n.score);
        System.out.println("Thanks for playing!");
    }
}
