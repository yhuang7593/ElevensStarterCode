package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"j", "q", "k"};
        int[] values = {1,2,3};
        String[] suits = {"red", "blue"};
        Deck deck = new Deck(ranks, suits, values);
        System.out.println(deck.toString());
    }
}

