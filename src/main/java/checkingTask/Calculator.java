package checkingTask;

public class Calculator {
    public int divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Unable to divide by zero");
        }

        return a/b;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
