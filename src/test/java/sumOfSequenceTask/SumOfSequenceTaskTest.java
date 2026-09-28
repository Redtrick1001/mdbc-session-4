package sumOfSequenceTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSequenceTaskTest {

    @Test
    void shouldSumToCorrectAmount() {
        SumOfSequenceTask runner = new SumOfSequenceTask();

        assertEquals(15, runner.sumOfSequence(1, 5,1));
        assertEquals(12, runner.sumOfSequence(2, 6, 2));
        assertEquals(18, runner.sumOfSequence(3,9, 3));
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