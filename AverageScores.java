import java.util.Scanner;

public class AverageScores {
    public static void main(String[] args) {
        //A variable to store the average score
        double average;
        //A variable to store a score
        int score;
        //A variable to store the sum of scores
        int sum = 0;
        //A variable to store the number of scores
        int numScores = 0;
        //Create a Scanner object
        Scanner scan = new Scanner(System.in);
        boolean hasMoreScores = true;


        while(hasMoreScores){
        //Prompt user to enter a score
        System.out.println("Enter score: ");
        //Retrieve score input and put in score variable
        score = scan.nextInt();
        scan.nextLine(); //Get rid of new line character
        //increment number of scores entered
        numScores++;
        //Add score to sum of scores
        sum += score;

            System.out.println("Do you have another score (y/n)?");
            String response = scan.nextLine();

            if(response.equalsIgnoreCase("n")){
                hasMoreScores = false;
            }
        }

        //Calculate the average and display result
        average = (double)sum/numScores;
        System.out.println("The average score was: " + average);
    }
}
