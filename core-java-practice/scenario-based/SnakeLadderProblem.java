import java.util.*;
public class SnakeLadderProblem {
	// constants
    static final int winPosition = 100;
    static final int noPlay = 0;
    static final int ladder = 1;
    static final int snake = 2;

    static Random random = new Random();

    // method to roll dice (1 to 6)
    static int rollDice() {
        return random.nextInt(6) + 1;
    }

    // method to get option: No Play, Ladder, Snake
    static int getOption() {
        return random.nextInt(3);
    }
    
    // method to calculate new position
    static int calculatePosition(int currentPos, int dice, int option) {

        if (option == ladder) {
            currentPos += dice;
            System.out.println("Ladder climbed");
        } 
        else if (option == snake) {
            currentPos -= dice;
            System.out.println("Snake bitten");
        } 
        else {
            System.out.println("No Play");
        }

        // if position goes below 0
        if (currentPos < 0) {
            currentPos = 0;
        }
        
        // if position goes above 100
        if (currentPos > winPosition) {
            currentPos -= dice;
        }

        return currentPos;
    }
	public static void main(String[] args){
		System.out.println("🎲 Welcome to Snake & Ladder Game 🎲");
		
        int player1Pos = 0;
        int player2Pos = 0;

        int diceCount1 = 0;
        int diceCount2 = 0;

        boolean player1Turn = true;
        
        while (player1Pos != winPosition && player2Pos != winPosition){ // UC 4 & UC 7 loop
            if (player1Turn) {
                System.out.println("\nPlayer 1 Turn");
                int dice = rollDice();
                diceCount1++;
                System.out.println("Dice rolled: " + dice);

                int option = getOption();
                player1Pos = calculatePosition(player1Pos, dice, option);
                System.out.println("Player 1 Position: " + player1Pos);

                if (option != ladder){ // if ladder, play again
                    player1Turn = false;
                }
            }else {
                System.out.println("\nPlayer 2 Turn");
                int dice = rollDice();
                diceCount2++;
                System.out.println("Dice rolled: " + dice);
                
                int option = getOption();
                player2Pos = calculatePosition(player2Pos, dice, option);
                System.out.println("Player 2 Position: " + player2Pos);
                
                if (option != ladder){ // if ladder, play again
                    player1Turn = true;
                }
            }
        }
        
        System.out.println("\n Game Over "); // UC 6 & UC 7 result
        if(player1Pos == winPosition){
            System.out.println(" Player 1 Wins!");
            System.out.println("Total Dice Rolls by Player 1: " + diceCount1);
        }else{
        	System.out.println(" Player 2 Wins!");
            System.out.println("Total Dice Rolls by Player 2: " + diceCount2);
        }
	}
}
