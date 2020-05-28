import java.io.IOException;
import java.io.Writer;

public class Prompt {
    private Writer writer;

    public Prompt(Writer writer) {

        this.writer = writer;
    }

    public void askForNextMove() throws IOException {
        writer.write("Please enter move:");
    }
}
