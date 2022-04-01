import java.util.List;

public class Player {
    private final String name;
    private List<Card> hand;
    private int score;

    /**
     *
     */
    public Player() {
        this.name = "";
        this.score = 0;

    }

    /**
     * @param name
     */
    public Player(String name) {
        this.score = 0;
        this.name = name;
    }


    /**
     *
     */
    public void describe() {

    }

    /**
     * @return
     */
    public Card flip() {
        return null;
    }

    /**
     * @param deck
     */
    public void draw(Deck deck) {

    }

    /**
     *
     */
    private void incrementScore() {
        this.score++;
    }
}
