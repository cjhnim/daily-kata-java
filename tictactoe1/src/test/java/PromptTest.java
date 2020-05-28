import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

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
}
