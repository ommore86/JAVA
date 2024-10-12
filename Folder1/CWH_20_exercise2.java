import java.util.Scanner;
import java.util.Random;
public class CWH_20_exercise2 {
    public static void main(String[] args) {
        //0 for Rock   //1 for Paper    //2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        System.out.print("Your choice: ");
        if (userInput == 0){
            System.out.println("Rock");
        } else if (userInput == 1) {
            System.out.println("Paper");
        }
        else {
            System.out.println("Scissor");
        }
        System.out.print("Computer choice: ");
        if (computerInput == 0){
            System.out.println("Rock");
        } else if (computerInput == 1) {
            System.out.println("Paper");
        }
        else {
            System.out.println("Scissor");
        }

        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Lose!");
        }
    }
}