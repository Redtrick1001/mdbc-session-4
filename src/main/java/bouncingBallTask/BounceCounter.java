package bouncingBallTask;

public class BounceCounter {
    public int bounceCounter(double bounceHeight, double elasticity, double windowHeight) {
        if (bounceHeight < 0) {
            return -1;
        } else if ((elasticity < 0) || (elasticity > 1)) {
            return -1;
        } else if (windowHeight > bounceHeight) {
            return -1;
        }

        int occurrences = 0;
        while (bounceHeight > windowHeight) {
            occurrences++;
            bounceHeight = bounceHeight * elasticity;
            if (bounceHeight > windowHeight) {
                occurrences++;
            }
        }

        return occurrences;
    }
}
