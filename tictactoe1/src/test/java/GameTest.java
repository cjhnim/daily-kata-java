import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {
//    @Test
//    public void gameIsOverWhenWinningMoveMade() throws IOException {
//        Writer writer = new StringWriter();
//        Reader reader = new StringReader("6\n");
//        Prompt prompt = new Prompt(reader, writer);
//        Board board = new Board(
//                        "X - - " +
//                        "X O O " +
//                        "- - - ");
//        Game game = new Game(prompt, board);
//        Board updatedBoard = game.play();
//
//        assertThat(writer.toString(), containsString("Please enter move:"));
//        assertThat(writer.toString(), containsString("Player X won!"));
//        assertThat(updatedBoard.symbolAt(6), is('X'));
//
//    }
}
