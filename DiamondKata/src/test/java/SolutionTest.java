import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void A_is_A()
    {
        Solution sol = new Solution('A');
        String expected = "A\n";

        Assert.assertEquals(expected, sol.print());
    }

    @Test
    public void B_is_Diamond_Of_Three_Size()
    {
        Solution sol = new Solution('B');
        String expected =
                        " A\n" +
                        "B B\n" +
                        " A\n";

        Assert.assertEquals(expected, sol.print());
    }

    @Test
    public void C_is_Diamond_Of_Five_Size()
    {
        Solution sol = new Solution('C');
        String expected =
                        "  A\n" +
                        " B B\n" +
                        "C   C\n" +
                        " B B\n" +
                        "  A\n";

        Assert.assertEquals(expected, sol.print());
    }

    @Test
    public void D_is_Diamond_Of_Seven_Size()
    {
        Solution sol = new Solution('D');
        String expected =
                        "   A\n" +
                        "  B B\n" +
                        " C   C\n" +
                        "D     D\n" +
                        " C   C\n" +
                        "  B B\n" +
                        "   A\n";

        Assert.assertEquals(expected, sol.print());
    }
}