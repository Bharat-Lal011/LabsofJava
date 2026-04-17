import java.util.Scanner;
public class UpperCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() > 0) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }
        String result = String.join(" ", words);

        System.out.println("Resulting String :--" + result);
    }
} 