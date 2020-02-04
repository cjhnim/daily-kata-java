import Diamond.Diamond;
import org.junit.Assert;
import org.junit.Test;

public class DiamondShould {
    @Test
    public void When_input_is_A_should_print_only_A()
    {
        Diamond diamond = new Diamond('A');
        String expected = "A";
        Assert.assertEquals(expected,diamond.print()[0]);
    }

    @Test
    public void When_input_is_B_should_have_one_space_of_first_line()
    {
        Diamond diamond = new Diamond('B');
        String expected = " A";
        Assert.assertEquals(expected,diamond.print()[0]);
    }

    @Test
    public void When_input_is_C_should_have_two_space_of_first_line()
    {
        Diamond diamond = new Diamond('C');
        String expected = "  A";
        Assert.assertEquals(expected,diamond.print()[0]);
    }

    @Test
    public void have_B_in_the_second_row()
    {
        Diamond diamond = new Diamond('B');
        String expected = "B B";
        Assert.assertEquals(expected,diamond.print()[1]);
    }

    @Test
    public void have_C_in_the_third_row()
    {
        Diamond diamond = new Diamond('C');
        String expected = "C   C";
        Assert.assertEquals(expected,diamond.print()[2]);
    }

    @Test
    public void have_D_in_the_fourth_row()
    {
        Diamond diamond = new Diamond('D');
        String expected = "D     D";
        Assert.assertEquals(expected,diamond.print()[3]);
    }

    @Test
    public void have_B_row_when_stop_letter_is_C() {
        Diamond diamond = new Diamond('C');
        String expected = " B B";
        Assert.assertEquals(expected,diamond.print()[1]);
    }

    @Test
    public void have_B_row_when_stop_letter_is_D() {
        Diamond diamond = new Diamond('D');
        String expected = "  B B";
        Assert.assertEquals(expected,diamond.print()[1]);
    }

    @Test
    public void have_C_row_when_stop_letter_is_D() {
        Diamond diamond = new Diamond('D');
        String expected = " C   C";
        Assert.assertEquals(expected,diamond.print()[2]);
    }

    @Test
    public void have_rows_from_A_to_B() {
        Diamond diamond = new Diamond('D');
        Assert.assertEquals("   A",diamond.print()[0]);
        Assert.assertEquals("  B B",diamond.print()[1]);
        Assert.assertEquals(" C   C",diamond.print()[2]);
        Assert.assertEquals("D     D",diamond.print()[3]);
    }

    @Test
    public void have_mirrored_rows_at_the_bottom() {
        Diamond diamond = new Diamond('D');

        Assert.assertEquals("   A",diamond.print()[0]);
        Assert.assertEquals("  B B",diamond.print()[1]);
        Assert.assertEquals(" C   C",diamond.print()[2]);
        Assert.assertEquals("D     D",diamond.print()[3]);
        Assert.assertEquals(" C   C",diamond.print()[4]);
        Assert.assertEquals("  B B",diamond.print()[5]);
        Assert.assertEquals("   A",diamond.print()[6]);

    }
}
