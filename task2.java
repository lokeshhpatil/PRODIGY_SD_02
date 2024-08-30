import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int numToGuess = random.nextInt(100) + 1; 
        boolean guessedCorrectly = false;
        int attempt = 0;
        Scanner sc = new Scanner(System.in);
        while(!guessedCorrectly){
            System.out.println("Enter Your Guess : ");
            try{
                int guess = sc.nextInt();
                attempt++;

                if(guess < numToGuess){
                    System.out.println("Too low. try again!");
                }
                else if(guess > numToGuess){
                    System.out.println("Too high. try again!");
                }
                else{
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number correctly in " + attempt + " attempts");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }
        sc.close();
    }
}
