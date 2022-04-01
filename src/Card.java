public class Card {
    private int value;
    private String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public Card(Card card) {
        this.value = card.getValue();
        this.name = card.getName();
    }

    /**
     * @return value of card.
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value of card.
     */
    public void setValue(int value) {
        if (value < 2 || value > 14) {
            throw new ArithmeticException("Value must be between 2 and 14.");
        } else {
            this.value = value;
        }
    }

    /**
     * @return name of card.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name of card.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints out info about card.
     */
    public void describe() {
        StringBuilder build = new StringBuilder();
        //only used for cards with names
        if (this.value > 10) {
            switch (this.value) {
                case 11:
                    build.append("Jack");
                    break;

                case 12:
                    build.append("Queen");
                    break;

                case 13:
                    build.append("King");
                    break;

                case 14:
                    build.append("Ace");
                    break;
            }
        } else {
            build.append(this.value);
        }
        build.append(" of ").append(this.name);
        System.out.print(build);
    }
}
