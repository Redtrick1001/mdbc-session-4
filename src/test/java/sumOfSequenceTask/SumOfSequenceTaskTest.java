package sumOfSequenceTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSequenceTaskTest {

    @Test
    void shouldSumToCorrectAmount() {
        SumOfSequenceTask runner = new SumOfSequenceTask();

        assertEquals(runner.sumOfSequence(1, 5,1), 15);
        assertEquals(runner.sumOfSequence(2, 6, 2), 12);
        assertEquals(runner.sumOfSequence(3,9, 3), 18);
    }

    @Test
    void ShouldNotAllowInputToBeNegative() {
        SumOfSequenceTask runner = new SumOfSequenceTask();

        assertThrows(IllegalArgumentException.class, () -> runner.sumOfSequence(-1, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> runner.sumOfSequence(1, -1, 1));
        assertThrows(IllegalArgumentException.class, () -> runner.sumOfSequence(1, 1,-1));
    }

    @Test
    void ShouldReturnZeroIfEndIsGreaterThanStart() {
        SumOfSequenceTask runner = new SumOfSequenceTask();

        assertEquals(0, runner.sumOfSequence(10, 1, 1));
    }
}