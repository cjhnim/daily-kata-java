import java.io.IOException;

public class Game {
    private Prompt prompt;
    private Board board;

    public Game(Prompt prompt, Board board) {

        this.prompt = prompt;
        this.board = board;
    }

    public Board play() throws IOException {
        prompt.askForNextMove();
        return board;
    }
}
