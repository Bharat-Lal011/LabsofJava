import java.util.*;

enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

public class QuizProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] correct = {'C', 'A', 'B', 'D'};
        char[] submitted = new char[4];
        Result[] results = new Result[4];

        int correctCount = 0, wrongCount = 0;

        try {
            System.out.println("Enter your answers (A/B/C/D or X for not answered):");

            for (int i = 0; i < 4; i++) {
                System.out.print("Question " + (i + 1) + ": ");
                submitted[i] = sc.next().toUpperCase().charAt(0);

                if (submitted[i] == 'X') {
                    results[i] = Result.NOT_ANSWERED;
                } else if (submitted[i] == correct[i]) {
                    results[i] = Result.CORRECT;
                    correctCount++;
                } else {
                    results[i] = Result.WRONG;
                    wrongCount++;
                }
            }

            System.out.println("QUESTION  SUBMITTED  CORRECT  RESULT");

            for (int i = 0; i < 4; i++) {
                System.out.println((i + 1) + "          " + submitted[i] +
                        "          " + correct[i] +
                        "        " + results[i]);
            }

            System.out.println("\nNo. of correct answers: " + correctCount);
            System.out.println("No. of wrong answers: " + wrongCount);

            if (correctCount >= 2) {
                System.out.println("The candidate passed.");
            } else {
                System.out.println("The candidate failed.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter only A/B/C/D/X.");
        }
    }
}