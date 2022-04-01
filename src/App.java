public class App {
    public static void main(String[] args) {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        Deck deck1 = new Deck();
        deck1.shuffle();

        //draw from deck, alternate between iteration
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck1);
            } else {
                player2.draw(deck1);
            }
        }

        player1.describe();
        player2.describe();

        //run simulation
        for (int i = 0; i < 26; i++) {
            Card p1DrawnCard = new Card(player1.flip());
            Card p2DrawnCard = new Card(player2.flip());

            if (p1DrawnCard.getValue() > p2DrawnCard.getValue()) {
                player1.incrementScore();
            } else if (p2DrawnCard.getValue() > p1DrawnCard.getValue()) {
                player2.incrementScore();
            }
        }

        //print final scores
        String finalScoreText = "\r\n****FINAL SCORE:****\r\n" + "    " + player1.getName() + ": " + player1.getScore() + "\r\n" + "    " + player2.getName() + ": " + player2.getScore() + "\r\n" + "WINNER: ";
        if (player1.getScore() > player2.getScore()) {
            finalScoreText += player1.getName();
        } else if (player2.getScore() > player1.getScore()) {
            finalScoreText += player2.getName();
        } else {
            finalScoreText += "Draw";
        }
        finalScoreText += "\r\n";
        System.out.println(finalScoreText);
    }
}
