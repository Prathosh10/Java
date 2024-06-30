import java.util.*;
public class guessGame2 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[]args) {
        do {
            playGame();
        } while (keepPlaying());
        System.out.println("...Thank You for Playing...");
    }

    public static void playGame() {
        int number,guess;

        // guess the number;
        guess = guessInput();
        System.out.println("I guess the number between 1 and 10 ... \n now your turn" + guess);
    
        number = getGuess();

        if (guess == number) {
            System.out.println("wow You are Right!!!");
        } else {
            System.out.println("Oh no sry..");
        }
    }

    public static int guessInput() {
        return (int)(Math.random()*10) + 1;
    }
    public static int getGuess() {
        while (true) {
            int number = sc.nextInt();
            if (number < 0 || number > 10) {
                System.out.println("try again please enter number between 1 to 10");
            } else {
                return number;
            }
        } 
    }
    public static boolean keepPlaying() {
        // play again 
        while (true) {
            System.out.println("want to repeat a game again ... press Y, if no press N");
            String repeatOrNot = sc.next();
            if (repeatOrNot.equalsIgnoreCase("Y")) {
                return true;
            }
            else if (repeatOrNot.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}