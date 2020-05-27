
public class Board {
    private String board;

    public Board(String board) {
        this.board = board;
    }

    public Board update(int pos, char player) {
        StringBuilder newBoard = new StringBuilder(board);
        newBoard.setCharAt(getIndex(pos), player);
        return new Board(newBoard.toString());
    }

    public char symbolAt(int pos) {
        return board.charAt(getIndex(pos));
    }

    private int getIndex(int pos) {
        return pos - 1;
    }

    @Override
    public boolean equals(Object obj) {
        return board.compareTo((String) obj) == 0;
    }

    @Override
    public String toString() {
        return board;
    }

    public boolean hasWinningLine() {

        for (int i = 0; i < board.length(); i += 3) {
            if (winning(i, i + 1, i + 2))
                return true;
        }
        return false;
    }

    private boolean winning(int pos1, int pos2, int pos3) {
        return board.charAt(2 * pos1) != '-' && board.charAt(2 * pos2) != '-' && board.charAt(2 * pos3) != '-';
    }
}
