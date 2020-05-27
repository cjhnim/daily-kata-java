import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

// TODO:
// [ ] changeable row & col

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
    public void testUpdate() {
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
    public void testSymbolAt() {
        Board board = new Board(
                        "- - - " +
                        "- - - " +
                        "- - - ");
        Board updateBoard = board.update(1, 'X');
        assertThat(updateBoard.symbolAt(1), is('X'));
    }

    @Test
    public void hasWinningRow() {
        Board board = new Board(
                        "X X X " +
                        "- - - " +
                        "- - - ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningRow2() {
        Board board = new Board(
                        "- - - " +
                        "X X X " +
                        "- - - ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningRow3() {
        Board board = new Board(
                        "- - - " +
                        "- - - " +
                        "X X X ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningCol() {
        Board board = new Board(
                        "X - - " +
                        "X - - " +
                        "X - - ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningCol2() {
        Board board = new Board(
                        "- X - " +
                        "- X - " +
                        "- X - ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningCol3() {
        Board board = new Board(
                        "- - X " +
                        "- - X " +
                        "- - X ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningDiagonal() {
        Board board = new Board(
                        "X - - " +
                        "- X - " +
                        "- - X ");

        assertThat(board.hasWinningLine(), is(true));
    }

    @Test
    public void hasWinningDiagonal2() {
        Board board = new Board(
                        "- - X " +
                        "- X - " +
                        "X - - ");

        assertThat(board.hasWinningLine(), is(true));
    }
}
