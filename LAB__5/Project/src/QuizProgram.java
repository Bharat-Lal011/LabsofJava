import java.util.Scanner;

enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class QuizProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char correct[] = {'C','A','B','D','B','C','C','A'};
        char submitted[] = new char[8];

        System.out.println("Enter your answers (A/B/C/D or X for unanswered):");

        for (int i = 0; i < 8; i++) {
            System.out.print("Q" + (i+1) + ": ");
            submitted[i] = sc.next().toUpperCase().charAt(0);
        }

        int correctCount = 0, wrongCount = 0, unansCount = 0;

        System.out.println("\nQ\tSUB\tCOR\tRESULT");

        for (int i = 0; i < 8; i++) {
            Result res;

            if (submitted[i] == 'X') {
                res = Result.UNANSWERED;
                unansCount++;
            }
            else if (submitted[i] == correct[i]) {
                res = Result.CORRECT;
                correctCount++;
            }
            else {
                res = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i+1) + "\t" + submitted[i] + "\t" + correct[i] + "\t" + res);
        }

        System.out.println("\nCorrect: " + correctCount);
        System.out.println("Wrong: " + wrongCount);
        System.out.println("Unanswered: " + unansCount);

        if (correctCount >= 5)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}
