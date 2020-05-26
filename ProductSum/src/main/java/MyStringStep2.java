/*
bug fix
 */
public class MyStringStep2 {
    public int strStr(String haystack, String needle) {
        boolean match ;

        if(haystack.isEmpty() && needle.isEmpty())
            return 0 ;

        for(int i = 0; i<haystack.length(); i++) {
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
