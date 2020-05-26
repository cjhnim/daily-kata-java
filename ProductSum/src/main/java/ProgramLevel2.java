/*
using print statement
 */
public class ProgramLevel2 {
    public static void main(String[] args) {
        System.out.println(new MyStringStep2().strStr("hello","ll"));
        System.out.println(new MyStringStep2().strStr("aaaaa","bba"));
        System.out.println(new MyStringStep2().strStr("",""));
        System.out.println(new MyStringStep2().strStr("ddddddddddd","ddddddddddd"));
        System.out.println(new MyStringStep2().strStr("mississippi","mississippi"));
        System.out.println(new MyStringStep2().strStr("mississippi","issipi"));

        System.out.println(new MyStringStep1().strStr("hello","ll"));
        System.out.println(new MyStringStep1().strStr("aaaaa","bba"));


    }
}
