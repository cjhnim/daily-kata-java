import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PlayerSymbolTest {
    @Test
    public void compareSymbolX() {
        PlayerSymbol playerSymbol = new PlayerSymbol("X");

        assertThat(playerSymbol, is(PlayerSymbol.X));
    }

    @Test
    public void compareSymbolY() {
        PlayerSymbol playerSymbol = new PlayerSymbol("O");

        assertThat(playerSymbol, is(PlayerSymbol.O));
    }
}
