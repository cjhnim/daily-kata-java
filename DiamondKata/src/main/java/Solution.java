public class Solution {


    private char mid;

    public Solution(char mid) {

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
        String line = addLeadingSpaces(c) + c;

        if (c != 'A') {
            line += addMidSpaces(c) + c;
        }

        return line + "\n";
    }

    private String addMidSpaces(char c) {
        int n = getMidSpacesCount(c);
        return addSpaces(n);
    }

    private int getMidSpacesCount(char c) {
        int index = c - 'A';
        return index * 2 - 1;
    }

    private String addLeadingSpaces(char c) {
        int n = getLeadingSpacesCount(c);
        return addSpaces(n);
    }

    private int getLeadingSpacesCount(char c) {
        return mid - c;
    }

    private String addSpaces(int n) {
        String spaces = "";
        for (int i = 0; i < n; i++)
            spaces += " ";

        return spaces;
    }
}
