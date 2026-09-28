package bouncingBallTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BounceCounterTest {
    @Test
    void ArgumentsShouldBeValid(){
        BounceCounter runner = new BounceCounter();

        assertEquals(-1, runner.bounceCounter(-1, 0.5, 5));
        assertEquals(-1, runner.bounceCounter(100, -1, 5));
        assertEquals(-1, runner.bounceCounter(100, 2, 5));
        assertEquals(-1, runner.bounceCounter(100, -1, 200));
        assertNotEquals(-1, runner.bounceCounter(100, 0.5, 50));
    }


    @Test
    void ShouldReturnCorrectNumberOfBounces() {
        BounceCounter runner = new BounceCounter();

        assertEquals(9, runner.bounceCounter(10, 0.66, 1.5));
        assertEquals(7, runner.bounceCounter(10, 0.66, 2));
        assertEquals(5, runner.bounceCounter(10, 0.66, 4));

        assertEquals(11, runner.bounceCounter(15, 0.66, 1.5));
        assertEquals(9, runner.bounceCounter(15, 0.66, 2));
        assertEquals(7, runner.bounceCounter(15, 0.66, 4));
    }
}