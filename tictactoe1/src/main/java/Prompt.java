import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Prompt {
    private Writer writer;
    private Reader reader;

    public Prompt(Writer writer) {

        this.writer = writer;
    }

    public Prompt(Reader reader, Writer writer) {

        this.reader = reader;
        this.writer = writer;
    }

    public void askForNextMove() throws IOException {
        writer.write("Please enter move:");
    }

    public void displayWinningMessageForPlayer(PlayerSymbol player) throws IOException {
        if(player == PlayerSymbol.X)
            writer.write("Player X won!");
        else if(player == PlayerSymbol.O)
            writer.write("Player O won!");

    }
}
