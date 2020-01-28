import org.junit.Assert;
import org.junit.Test;

public class DiamondKataTest {
    @Test
    public void A_should_return_A() {
        Diamond diamond = new Diamond('A');
        String expected = "A\n";

        Assert.assertEquals(expected, diamond.print());
    }

    @Test
    public void B_should_return_the_diamond_of_three_height() {
        Diamond diamond = new Diamond('B');
        String expected =
                        " A\n" +
                        "B B\n" +
                        " A\n";

        Assert.assertEquals(expected, diamond.print());
    }

    @Test
    public void C_should_return_the_diamond_of_three_height() {
        Diamond diamond = new Diamond('C');
        String expected =
                                 "  A\n" +
                                 " B B\n" +
                                 "C   C\n" +
                                 " B B\n" +
                                 "  A\n";

        Assert.assertEquals(expected, diamond.print());
    }
}
