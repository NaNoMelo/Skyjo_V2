public class Player {
    private Card[][] cards;
    private String name;

    public Player(String name) {
        this.name = name;
        this.cards = new Card[4][3];
    }

    public void drawCards(Deck deck) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cards[i][j] = deck.drawCard();
            }
        }
    }





}