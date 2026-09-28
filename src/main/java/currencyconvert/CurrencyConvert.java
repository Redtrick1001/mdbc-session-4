package currencyconvert;

import java.util.Arrays;
import java.util.HashMap;

public class CurrencyConvert {
    public HashMap<Integer, Integer> toCoins(int[] coins, int amounts) throws IllegalArgumentException {
        if (amounts <= 0) throw new IllegalArgumentException("Amount (" + amounts + ") Can not be less than or equal to zero");

        if (Arrays.equals(coins, new int[]{})) throw new IllegalArgumentException("Coins can not be an empty Array");

        for (int coin: coins) {
            if (coin < 0) throw new IllegalArgumentException("Coin (" + coin + ") is less then zero");
        }

        HashMap<Integer, Integer> totalAmount = new HashMap<>();

        for (int coin: coins) {
            int singleCoinAmount = 0;
            while (amounts - coin >= 0) {
                singleCoinAmount++;
                amounts -= coin;
            }
            totalAmount.put(coin, singleCoinAmount);
        }

        return totalAmount;
    }
}
