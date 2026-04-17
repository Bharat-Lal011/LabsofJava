import java.io.*;

public class HerReplaceHis {
    public static void main(String[] args)
            throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("sdj.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sdj.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            line = line.replace("his", "her");
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        System.out.println("Done");
    }
}
