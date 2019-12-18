import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest2 {

    @ParameterizedTest
    @CsvFileSource(resources = "/BonusData.csv", numLinesToSkip = 1)
    void shouldReturnCashBack(int amount, int expected, String message) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual, message);

    }
}