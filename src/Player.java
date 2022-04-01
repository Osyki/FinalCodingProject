import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand;
    private int score;

    /**
     * Default Constructor
     */
    public Player() {
        this.name = "";
        this.score = 0;
        this.hand = new ArrayList<>();
    }

    /**
     * @param name of player.
     */
    public Player(String name) {
        this.score = 0;
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * @return name of player.
     */
    public String getName() {
        return name;
    }

    /**
     * @return score of player;
     */
    public int getScore() {
        return score;
    }

    /**
     * Prints out info on player.
     */
    public void describe() {
        String build = this.name + "'s score: " + this.score + "\r\nCurrent hand:\r\n";
        System.out.print(build);
        if (hand.isEmpty()) {
            System.out.print("    Empty\r\n");
        } else {
            hand.forEach(e -> {
                e.describe();
                System.out.print("\r\n");
            });
            System.out.print("--------------------\r\n");
        }
    }

    /**
     * @return card at index 0 of player hand.
     */
    public Card flip() {
        if (hand.isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("No cards in hand.");
        } else {
            return hand.remove(0);
        }
    }

    /**
     * @param deck to draw from
     */
    public void draw(Deck deck) {
        hand.add(new Card(deck.draw()));
    }

    /**
     * Increments score of player.
     */
    public void incrementScore() {
        this.score++;
    }
}
