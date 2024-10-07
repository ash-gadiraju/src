import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //Randomly generate an integer between 1 & 100
        int randomInteger = (int)(Math.random()*100 + 1);
        //Number of guesses
        int numGuesses = 0;
        //Number of guesses higher than generated integer
        int higherGuesses = 0;
        //Number of guesses lower than generated integer
        int lowerGuesses = 0;
        boolean incorrectResponse;
        //Ask user to try to guess the number
        Scanner userAttempt = new Scanner(System.in);
        int guessedInt = userAttempt.nextInt();
        if(guessedInt == randomInteger){
            incorrectResponse = false;
        } else{
            incorrectResponse = true;
        }

        while(!incorrectResponse){
            //If user guess incorrectly, program should ask them to try again
            System.out.println("WRONG. Try again.");
            //Add attempt to number of guesses
            numGuesses++;
            //If guess is too high/low, add value to number of high/low guesses
            if(guessedInt > randomInteger){
                System.out.println("Too high. Whoops.");
                higherGuesses++;
            } else if(guessedInt < randomInteger){
                System.out.println("Too low. Whoops.");
                lowerGuesses++;
            }
            //Let player know if guess needs to be higher or lower
            //Repeat until guess is correct
            if(guessedInt == randomInteger){
                //When it is correct, print congratulatory message
                System.out.println("Ding ding ding! Correct!");
                //Print number of guesses
                System.out.println("Number of guesses: "+numGuesses);
                //Print number of high/low guesses
                System.out.println("Number of higher guesses: " + higherGuesses + "\n" + "Number of lower guesses: "+lowerGuesses);
                //Ask player if they wish to play again
                System.out.println("Would you like to play again?(answer y/n)");
                String response = userAttempt.nextLine();
                //If yes, then generate new number
                if(response.equalsIgnoreCase("y")){

                }

        }
        }
    }

}
