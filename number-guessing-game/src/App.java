import java.util.Scanner;
public class App {
     public static void main(String[] args) throws Exception {
     int number;
     number = (int) (Math.random() * 100) + 1;
     int attempt = 5;
     int userGuess;

     System.out.println("Welcome to the Number Guessing Game!");
     System.out.println("You have " + attempt + " attempts to guess the number between 1 and 100.");

     for (int i = 0; i < attempt; i++) {
         System.out.println("Attempt " + (i + 1) + " of " + attempt);
         System.out.println("Guess a number between 1 and 100: ");
         Scanner scanner = new Scanner(System.in);
         userGuess = scanner.nextInt();
         

            if (userGuess == number) {
                System.out.println("Congratulations! You guessed the number.");
                scanner.close();
                break;
            } else if (userGuess < number) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            
            if(i==4){
                System.out.println("Sorry, you've used all your attempts. The number was: " + number);
                scanner.close();
            }   
            

     }
     
    }


}