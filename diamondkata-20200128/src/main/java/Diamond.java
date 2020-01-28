public class Diamond {
    private char mid;

    public Diamond(char mid) {
        this.mid = mid;
    }

    public String print() {
        String top = "";
        String bottom = "";

        for (char c = 'A'; c <= mid; c++) {
            String line = buildLine(c);
            top += line;
            if (c != mid)
                bottom = line + bottom;
        }
        return top + bottom;
    }

    private String buildLine(char c) {
        return addIndent(c) + c + addRestOfLine(c) + '\n';
    }

    private String addRestOfLine(char c) {
        if (c != 'A') {
            int count = (c - 'A') * 2 - 1;
            return addSpaces(count) + c;
        }
        else
            return "";
    }

    private String addIndent(char c) {
        return addSpaces(mid - c);
    }

    private String addSpaces(int count) {
        String spaces = "";
        for (int i = 0; i < count; i++)
            spaces += " ";
        return spaces;
    }
}
