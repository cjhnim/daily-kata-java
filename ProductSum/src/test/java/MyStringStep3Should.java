import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyStringStep3Should {

    @Test
    public void test1() {
        Assert.assertThat(new MyStringStep3().strStr("Hello", "ll", 0), is(2));
    }
    @Test
    public void test2() {
        Assert.assertThat(new MyStringStep3().strStr("aaaaa", "bba", 0), is(-1));
    }

    @Test
    public void test3() {
        Assert.assertThat(new MyStringStep3().strStr("", "", 0), is(0));
    }

    @Test
    public void test4() {
        Assert.assertThat(new MyStringStep3().strStr("ddddddddddd", "ddddddddddd", 0), is(0));
    }

    @Test
    public void test5() {
        Assert.assertThat(new MyStringStep3().strStr("mississippi", "mississippi", 0), is(0));
    }

    @Test
    public void test6() {
        Assert.assertThat(new MyStringStep3().strStr("mississippi", "issipi", 0), is(-1));
    }

    @Test
    public void test7() {
        Assert.assertThat(new MyStringStep3().strStr("Hello", "ll", 3), is(-1));
    }

    @Test
    public void test8() {
        Assert.assertThat(new MyStringStep3().strStr("Hello", "ll", 5), is(-1));
    }

    @Test
    public void test9() {
        Assert.assertThat(new MyStringStep3().strStr("Hello", "ll", 2), is(2));
    }

}