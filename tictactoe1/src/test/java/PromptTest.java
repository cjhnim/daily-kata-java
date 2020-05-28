import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PromptTest {
    @Test
    public void MakeNewInstance() {
        Prompt prompt = new Prompt(null);
    }

    @Test
    public void promptsForNextMove() throws IOException {
        Writer writer = new StringWriter();
        Prompt prompt = new Prompt(writer);
        prompt.askForNextMove();
        assertThat(writer.toString(), is("Please enter move:"));
    }

    @Test
    public void displaysCongratulatoryMessage() throws IOException {
        Writer writer = new StringWriter();
        Reader reader = new StringReader("");
        Prompt prompt = new Prompt(reader, writer);

        prompt.displayWinningMessageForPlayer(PlayerSymbol.X);

        assertThat(writer.toString(), is("Player X won!"));
    }
}
