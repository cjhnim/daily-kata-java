
public class Board {
    private String board;
    private int boardSize;
    private int colSize;
    private int rowSize;

    public Board(String board) {
        this.board = board;
        colSize = 3;
        rowSize = 3;
        boardSize = colSize * rowSize;
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
        return pos*2;
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
        return hasWinningRow() || hasWinningCol() || hasWinningDiagonal() ;
    }

    private boolean hasWinningDiagonal() {

        return winning(0 * colSize, 1 * colSize + 1, 2 * colSize + 2) ||
                winning(0 * colSize + 2, 1 * colSize + 1, 2 * colSize + 0);
    }

    private boolean hasWinningRow() {
        for (int i = 0; i < rowSize; i++)
            if (winning(i * colSize, i * colSize + 1, i * colSize + 2))
                return true;

        return false;
    }

    private boolean hasWinningCol() {
        for (int i = 0; i < colSize; i++)
            if (winning(0 * colSize + i, 1 * colSize + i, 2 * colSize + i))
                return true;

        return false;
    }

    private boolean winning(int pos1, int pos2, int pos3) {
        return board.charAt(2 * pos1) != '-' && board.charAt(2 * pos2) != '-' && board.charAt(2 * pos3) != '-';
    }
}
