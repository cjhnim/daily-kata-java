import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiamondTest {
    @Test
    public void A_is_A()
    {
        Diamond diamond = new Diamond('A');
        String expected = "A\n";

        Assert.assertEquals(expected,diamond.print());
    }

    @Test
    public void B_is_three_height_diamond()
    {
        Diamond diamond = new Diamond('B');
        String expected =
                        " A\n" +
                        "B B\n"+
                        " A\n";

        Assert.assertEquals(expected,diamond.print());
    }

    @Test
    public void C_is_five_height_diamond()
    {
        Diamond diamond = new Diamond('C');
        String expected =
                        "  A\n" +
                        " B B\n"+
                        "C   C\n"+
                        " B B\n"+
                        "  A\n";

        Assert.assertEquals(expected,diamond.print());
    }

    @Test
    public void D_is_five_height_diamond()
    {
        Diamond diamond = new Diamond('D');
        String expected =
                        "   A\n" +
                        "  B B\n"+
                        " C   C\n"+
                        "D     D\n"+
                        " C   C\n"+
                        "  B B\n"+
                        "   A\n";

        Assert.assertEquals(expected,diamond.print());
    }
}