public enum Suits {
    // convention is to put in all caps
    // 4 categories
    // kind of "source of truth" for a set of categories
    HEARTS("Hearts", "Red"), DIAMONDS("Diamonds", "Red"),
    SPADES("Spades", "Black"), CLUBS("Clubs", "Black");

    private final String displayName;
    private final String color;

    Suits(String displayName, String color) {
        this.displayName = displayName;
        this.color = color;
    }
}
