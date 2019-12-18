import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @DisplayName("Should return Zero if Amount is 1000")
    @Test
    void shouldReturnZeroIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @DisplayName("Should return 500 if Amount is 500")
    @Test
    void shouldReturn500IfAmount500() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @DisplayName("Should return 800 if Amount is 1200")
    @Test
    void shouldReturn800IfAmount1200() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(1200);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @DisplayName("Should Throw if Amount is 0")
    @Test
    void shouldThrowIfAmount0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(0),
                "amount must be greater than zero");
    }

    @DisplayName("Should return Throw if Amount is -1")
    @Test
    void shouldThrowIfAmountLess0() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(-1),
                "amount must be greater than zero");
    }
}