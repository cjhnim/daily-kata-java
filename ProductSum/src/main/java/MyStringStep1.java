/*
Naive version
 */
public class MyStringStep1 {
    public int strStr(String haystack, String needle) {
        boolean match ;

        for(int i = 0; i<haystack.length(); i++) {
            match = true;
            for(int j=0; j<needle.length(); j++) {
                if(haystack.charAt(i) == needle.charAt(j)) {
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
