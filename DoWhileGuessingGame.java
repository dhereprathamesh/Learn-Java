import java.util.Scanner;

public class DoWhileGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 7; 
        int userGuess;
        
        do {
            System.out.print("Guess the number between 1 and 10: ");
            userGuess = sc.nextInt();
            
            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it correctly.");
            }
        } while (userGuess != secretNumber); // Continue looping 
    }
}
