import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int Num = 5;
        int attempts = 3;

        if(attempts == 0){
            System.out.println("you have no more remaining guesses");
        }
        else{
            System.out.println("enter your guess");
            int guess = reader.nextInt();

            if(guess == Num){
                System.out.println("your guess is correct");
            }
            else if(guess > Num){
                System.out.println("choose a smaller number");
            }
            else{
                System.out.println("choose a larger number");
            }
            attempts --;

        }

        if(attempts == 0){
            System.out.println("you have no more remaining guesses");
        }
        else {
            System.out.println("enter your guess");
            int guess2 = reader.nextInt();

            if (guess2 == Num) {
                System.out.println("your guess is correct");
            } else if (guess2 > Num) {
                System.out.println("choose a smaller number");
            } else {
                System.out.println("choose a larger number");
            }
            attempts--;
        }

        if(attempts == 0){
            System.out.println("you have no more remaining guesses");
        }
        else{
            System.out.println("enter your guess");
            int guess3 = reader.nextInt();

            if(guess3 == Num){
                System.out.println("your guess is correct");
            }
            else if(guess3 > Num){
                System.out.println("choose a smaller number");
            }
            else{
                System.out.println("choose a larger number");
            }
            attempts--;
        }

        if(attempts == 0){
            System.out.println("you have no more remaining guesses");
        }


    }
}