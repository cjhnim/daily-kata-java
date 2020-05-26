/*
using assert with -ea option
 */
public class ProgramLevel3 {
    public static void main(String[] args) {

        assert new MyStringStep1().strStr("hello","ll") == 2 : "offset shoule be 2.";
        assert new MyStringStep1().strStr("aaaaa","bba") == -1 : "offset should be -1";
    }
}
