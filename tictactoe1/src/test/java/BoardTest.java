import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void makeNewInstance() {
        Board board = new Board("");
    }

    @Test
    public void compareBoard() {
        String expected =
                "- - - " +
                "- - - " +
                "- - - " ;

        Board board = new Board(expected);

        assertThat(board, is(expected));
    }

    @Test
    public void updateBoardWithUsersMove1() {
        String given =
                        "- - - " +
                        "- - - " +
                        "- - - " ;
        String expected =
                        "X - - " +
                        "- - - " +
                        "- - - " ;

        Board board = new Board(given);

        assertThat(board.update(1, 'X'), is(expected));
    }

    @Test
    public void updateBoardWithUsersMove2() {
        Board board = new Board(
                        "- - - " +
                        "- - - " +
                        "- - - ");
        Board updateBoard = board.update(1, 'X');
        assertThat(updateBoard.symbolAt(1), is('X'));
    }
}
