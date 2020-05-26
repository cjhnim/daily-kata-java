import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class  MyStringStep2Should {

    @Test
    public void test1() {
        Assert.assertThat(new MyStringStep1().strStr("Hello", "ll"), is(2));
    }

    @Test
    public void test2() {
        Assert.assertThat(new MyStringStep1().strStr("aaaaa", "bba"), is(-1));
    }

    @Test
    public void test3() {
        Assert.assertThat(new MyStringStep1().strStr("", ""), is(0));
    }
}
