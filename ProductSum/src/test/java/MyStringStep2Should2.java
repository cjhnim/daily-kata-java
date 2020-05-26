import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class MyStringStep2Should2 {
    @Test
    public void test1() {
        Assert.assertThat(new MyStringStep2().strStr("Hello", "ll"), is(2));
    }

    @Test
    public void test2() {
        Assert.assertThat(new MyStringStep2().strStr("aaaaa", "bba"), is(-1));
    }

    @Test
    public void test3() {
        Assert.assertThat(new MyStringStep2().strStr("", ""), is(0));
    }

    @Test
    public void test4() {
        Assert.assertThat(new MyStringStep2().strStr("ddddddddddd", "ddddddddddd"), is(0));
    }

    @Test
    public void test5() {
        Assert.assertThat(new MyStringStep2().strStr("mississippi", "mississippi"), is(0));
    }

    @Test
    public void test6() {
        Assert.assertThat(new MyStringStep2().strStr("mississippi", "issipi"), is(-1));
    }
}
