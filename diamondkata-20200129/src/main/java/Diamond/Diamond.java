package Diamond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.repeat;

public class Diamond {
    private char stopLetter;
    private static final char START_LETTER = 'A';

    public Diamond(char stopLetter) {
        this.stopLetter = stopLetter;
    }

    public String[] print() {
        List<String> rows = createRows(stopLetter);

        mirroredRows(rows);

        return rows.toArray(new String[rows.size()]);
    }

    private List<String> createRows(char stopLetter) {
        List<String> rows = new ArrayList<>();

        for(int i = 0; i<= stopLetter - START_LETTER; i++) {
            char current = (char)(START_LETTER + i);
            String row = spaces(stopLetter - current) +
                    current + innerSpaces(current - START_LETTER);

            if(i > 0) {
                row+=current;
            }

            rows.add(row);
        }
        return rows;
    }

    private void mirroredRows(List<String> rows) {
        List<String> mirroredRows = new ArrayList<>(rows);
        Collections.reverse(mirroredRows);
        mirroredRows.remove(0);
        rows.addAll(mirroredRows);
    }

    private String innerSpaces(int interval) {
        return spaces(interval * 2 - 1);
    }

    private String spaces(int count) {
        return repeat(" ", count);
    }

    private String firstRow(int lettersInterval) {
        return spaces(lettersInterval) + START_LETTER;
    }
}
