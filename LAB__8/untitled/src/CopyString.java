import java.util.Scanner;
public class CopyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String str = sc.nextLine();

        int firstIndex = str.indexOf("the");
        int lastIndex = str.lastIndexOf("the");
        if(firstIndex == -1 || lastIndex == -1) {
            System.out.println("Word 'the' not found: ");
        }
        else if( firstIndex == lastIndex) {
            System.out.println("Only one occurance of word 'the' : " );
        }
        else {
            int start = firstIndex + 4;
            int end =  lastIndex;
            String result = str.substring(start, end);
            System.out.println(result);
        }
    }
}
