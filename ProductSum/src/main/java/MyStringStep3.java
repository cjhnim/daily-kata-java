/*
add argument fo start.
 */
public class MyStringStep3 {
    public int strStr(String haystack, String needle, int start) {
        boolean match ;

        if(haystack.isEmpty() && needle.isEmpty())
            return 0 ;

        for(int i = start; i<haystack.length(); i++) {
            match = true;
            for(int j=0; j<needle.length(); j++) {
                if(haystack.length() > i+j && haystack.charAt(i+j) == needle.charAt(j)) {
                } else {
                    match = false;
                    break;
                }
            }

            if(match)
                return i;
        }
        return -1;
    }
}
