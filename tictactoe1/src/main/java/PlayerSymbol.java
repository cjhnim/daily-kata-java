public class PlayerSymbol {
    public static final PlayerSymbol X = new PlayerSymbol('X');
    public static final PlayerSymbol O = new PlayerSymbol('O');
    private Character symbol;

    public PlayerSymbol(char symbol) {

        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Character)
            return symbol == ((Character) obj).charValue();

        if(obj instanceof PlayerSymbol)
            return symbol == ((PlayerSymbol)obj).getSymbol();

        return false;
    }

    public Character getSymbol() {
        return symbol;
    }
}
