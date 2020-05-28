public class PlayerSymbol {
    public static final PlayerSymbol X = new PlayerSymbol("X");
    public static final PlayerSymbol O = new PlayerSymbol("O");
    private String symbol;

    public PlayerSymbol(String symbol) {

        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        return symbol.compareTo(((PlayerSymbol)obj).getSymbol()) == 0;
    }

    public String getSymbol() {
        return symbol;
    }
}
