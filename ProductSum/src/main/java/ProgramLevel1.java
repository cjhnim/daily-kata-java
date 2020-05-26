/*
manual test
 */
public class ProgramLevel1 {
    public static void main(String[] args) {

        int i, result ;
        boolean match = false;

        for(i = 0; i<args[0].length(); i++) {
            match = true;
            for(int j=0; j<args[1].length(); j++) {
                if(args[0].charAt(i) != args[1].charAt(j)) {
                    match = false;
                    break;
                }
            }

            if(match)
                break;
        }

        result = match ? i : -1;

        System.out.println(result);
    }
}
