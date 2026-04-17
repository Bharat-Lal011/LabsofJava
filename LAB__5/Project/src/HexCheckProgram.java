import java.util.Scanner;

class NotHexException extends Exception {
    NotHexException(String message) {
        super(message);
    }
}

public class HexCheckProgram {

    static void checkHex(String input) throws NotHexException {

        if (!input.matches("[0-9A-Fa-f]+")) {
            throw new NotHexException("Not a hexadecimal number!");
        }

        if (input.endsWith("H") || input.endsWith("h")) {
            System.out.println("Ends with H/h (valid hex format).");
        }

        System.out.println("It is a valid hexadecimal number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.next();
            checkHex(input);

        } catch (NotHexException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program Ended.");

        sc.close();
    }
}
