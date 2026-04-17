import java.util.Scanner;
public class FindVowels {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Vowels and thier positions: ");
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
                System.out.println(ch + " At Position " + (i+1));
            }
        }
    }
}
