/*
 more test
 */
public class ProgramLevel4 {
    public static void main(String[] args) {

        assert new MyStringStep1().strStr("hello","ll") == 2 : "offset shoule be 2.";
        assert new MyStringStep1().strStr("aaaaa","bba") == -1 : "offset should be -1";

        int result = new MyStringStep1().strStr("","");
        assert result == 0 : "offset should be 0" + " but actual was " + Integer.toString(result);
    }
}

