import java.util.*;
public class PlayDeckOfCards {
	
	//initailize the cards
	static String[] initDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[idx] = ranks[j] + " of " + suits[i];
                idx++;
            }
        }
        return deck;
    }
	
	//shuffle
	static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

	//distribute
	static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            return null;
        }
        String[][] data = new String[players][cards];
        int idx = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                data[i][j] = deck[idx++];
            }
        }
        return data;
    }
	
	//print the number of player
	static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1));
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = initDeck(suits, ranks);
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int p = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int c = sc.nextInt();
        String[][] players = distribute(deck, p, c);
        if (players == null) {
            System.out.println("Cannot distribute cards");
        } else {
            printPlayers(players);
        }

	}

}
