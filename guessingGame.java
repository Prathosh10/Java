import java.util.*;
public class guessingGame {
    static Scanner sc = new Scanner(System.in);
    static boolean keepPlaying = true;
    public static void main(String[]args) {
        while (keepPlaying) {
            playGame();
        }
        System.out.println("...Thank You for Playing...");
    }

    public static void playGame() {
        int number,guess;
        boolean validInput;
        String repeatOrNot;

        // guess the number;
        guess = (int)(Math.random()*10) + 1;
        System.out.println("I guess the number between 1 and 10 ... \n now your turn" + guess);
    

        do {
            number = sc.nextInt();
            validInput = true;
            if (number < 0 || number > 10) {
                System.out.println("try again please enter number between 1 to 10");
                validInput = false;
            }
        } while (!validInput);

        if (guess == number) {
            System.out.println("wow You are Right!!!");
        } else {
            System.out.println("Oh no sry..");
        }

        // play again 
        do {
            System.out.println("want to repeat a game again ... press Y, if no press N");
            repeatOrNot = sc.next();
            validInput = true;
            if (repeatOrNot.equalsIgnoreCase("Y"));
            else if (repeatOrNot.equalsIgnoreCase("N")){
                keepPlaying = false;
            } else {
                validInput = false;
            }
        } while (!validInput);
    }
}