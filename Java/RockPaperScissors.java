package rockpaperscissors;

/* Idris Sadiq

** 02/22/2017

** This program simulates a game of Rock, Paper, Scissors. The program prompts 
   the user for their choice, then generates the computer's choice at random.
   The winner of each round gains one point.
*/

import java.util.*;

public class RockPaperScissors {
    
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        // Variable declarations
        int computerChoice;
        int userChoiceAsInteger = 0;
        int userScore = 0, computerScore = 0;
        String userChoice;
        String playAgain = "Y";
        
        System.out.println("Let's play Rock, Paper, Scissors!\n");
        // Loop until user enters (N)No
        while(playAgain.equals("Y")){
            // Prompt user for input
            System.out.println("Type (R) for Rock, (P) for Paper, or (S) for Scissors");
            System.out.print("Enter your choice here: ");
            userChoice = console.next();
            // Convert user choice to a number
            if(userChoice.equals("R"))
                userChoiceAsInteger = 0;
            else if(userChoice.equals("P"))
                userChoiceAsInteger = 1;
            else if(userChoice.equals("S"))
                userChoiceAsInteger = 2;
            
            // Generate psuedo-random computer choice between 0-2
            computerChoice = rand.nextInt(3);
            if(computerChoice == 0)
                System.out.println("The computer chooses Rock(R)");
            else if(computerChoice == 1)
                System.out.println("The computer chooses Paper(P)");
            else if(computerChoice == 2)
                System.out.println("The computer chooses Scissors(S)");
            
            // Compare user and computer choices, then compute the winner
            if(userChoiceAsInteger == computerChoice)
                System.out.println("Result: It's a tie!");
            else if((userChoiceAsInteger == 0) && (computerChoice == 2)){
                System.out.println("Result: You win!");
                userScore++;
            }
            else if((computerChoice == 0) && (userChoiceAsInteger == 2)){
                System.out.println("Result: Computer wins!");
                computerScore++;
            }    
            else if(userChoiceAsInteger < computerChoice){
                System.out.println("Result: Computer wins!");
                computerScore++;
            }    
            else if(computerChoice < userChoiceAsInteger){
                System.out.println("Result: You win!");
                userScore++;
            }
            // Display score and ask user to play again
            System.out.println("\nScore: You("+ userScore +") vs Computer("+computerScore+")");
            System.out.println("Would you like to play again? (Enter (Y) for Yes or (N) for No)");
            playAgain = console.next(); // Accept user input for program loop
        }
    }
}