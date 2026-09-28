package currencyconvert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

class CurrencyConvertTest {

    @Test
    void shouldReturnCorrectAmountOfCoins() {
        CurrencyConvert runner = new CurrencyConvert();

        int[] coins1 = {25, 10, 5, 2, 1};

        HashMap<Integer, Integer> expectedResult1 = new HashMap<>();
        expectedResult1.put(25, 2);
        expectedResult1.put(10, 0);
        expectedResult1.put(5, 0);
        expectedResult1.put(2, 0);
        expectedResult1.put(1, 0);

        assertEquals(expectedResult1, runner.toCoins(coins1, 50));

        HashMap<Integer, Integer> expectedResult2 = new HashMap<>();
        expectedResult2.put(25, 2);
        expectedResult2.put(10, 1);
        expectedResult2.put(5, 1);
        expectedResult2.put(2, 1);
        expectedResult2.put(1, 0);

        assertEquals(expectedResult2, runner.toCoins(coins1, 67));

        int[] coins2 = {200, 100, 50, 20, 10, 5, 2, 1};

        HashMap<Integer, Integer> expectedResult3 = new HashMap<>();
        expectedResult3.put(200, 3);
        expectedResult3.put(100, 1);
        expectedResult3.put(50, 1);
        expectedResult3.put(20, 1);
        expectedResult3.put(10, 1);
        expectedResult3.put(5, 0);
        expectedResult3.put(2, 1);
        expectedResult3.put(1, 1);

        assertEquals(expectedResult3, runner.toCoins(coins2, 783));
    }

    @Test
    void shouldOnlyAllowCoinsWithAPositiveValue() {
        CurrencyConvert runner = new CurrencyConvert();

        int[] coins1 = {-25, 10, 5, 2, 1};
        assertThrows(IllegalArgumentException.class, () -> runner.toCoins(coins1, 100));
        int[] coins2 = {25, 10, -5, 2, 1};
        assertThrows(IllegalArgumentException.class, () -> runner.toCoins(coins2, 100));

    }

    @Test
    void shouldOnlyAllowNonEmptyArrayOfCoins() {
        CurrencyConvert runner = new CurrencyConvert();

        int[] coins = {};
        assertThrows(IllegalArgumentException.class, () -> runner.toCoins(coins, 100));
    }

    @Test
    void shouldOnlyAllowPositiveNonZeroAmounts() {
        CurrencyConvert runner = new CurrencyConvert();

        int[] coins = {25, 10, 5, 2, 1};
        assertThrows(IllegalArgumentException.class, () -> runner.toCoins(coins, 0));
        assertThrows(IllegalArgumentException.class, () -> runner.toCoins(coins, -100));
    }

}