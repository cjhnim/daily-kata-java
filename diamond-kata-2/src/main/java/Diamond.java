public class Diamond {
    private char mid;

    public Diamond(char mid) {

        this.mid = mid;
    }

    public String print() {
        String top = "";
        String bottom = "";

        for(char c='A'; c<=mid; c++) {
            String line = "";

            if(c !=mid) {

                for(int i=0; i<mid-c; i++)
                    line += " ";
            }

            line += c;

            if(c != 'A') {
                int count = (c-'A')*2-1;
                for(int i=0; i<count; i++)
                    line += " ";
                line += c;
            }

            line += '\n';

            top += line;

            if(c != mid)
                bottom = line + bottom;
        }

        return top + bottom;
    }
}
