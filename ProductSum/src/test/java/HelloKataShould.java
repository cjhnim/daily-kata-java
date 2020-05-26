import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloKataShould {
    @Test
    public void HelloTest() {
        assertThat(Hello.say(), is("Hello"));
    }
}
