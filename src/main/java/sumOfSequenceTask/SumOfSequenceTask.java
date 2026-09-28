package sumOfSequenceTask;

public class SumOfSequenceTask {
    public int sumOfSequence(int start, int end, int step) throws IllegalArgumentException {
        int total = 0;
        if (start < 0) {
            throw new IllegalArgumentException("Start arguments is less than 0 (" + "start = " + start + ")");
        } else if (end < 0) {
            throw new IllegalArgumentException("End arguments is less than 0 (" +  "end = " + end + ")");
        } else if (step < 0) {
            throw new IllegalArgumentException("Step arguments is less than 0 (" + "step = " + step + ")");
        }

        if (end < start) {
            return 0;
        }

        for (int i = start; i <= end ; i += step) {
            total += i;
        }

        return total;
    }
}
