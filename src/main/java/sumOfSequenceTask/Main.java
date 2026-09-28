package sumOfSequenceTask;

import java.util.Scanner;

public class Main {
    static void main() {
        SumOfSequenceTask runner = new SumOfSequenceTask();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("What number would you like to start at");
            String rawStart = scanner.nextLine();
            int start = Integer.parseInt(rawStart);

            System.out.println("What number would you like to end at");
            String rawEnd = scanner.nextLine();
            int end = Integer.parseInt(rawEnd);

            System.out.println("What number would you like to step by");
            String rawStep = scanner.nextLine();
            int step = Integer.parseInt(rawStep);

            System.out.println(runner.sumOfSequence(start, end, step));
        } catch (Exception e) {
              System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
