import java.io.*;

public class FeedbackAnalyzer {
    public static void main(String[] args) {

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("feedback.txt"));

            String line;
            int count = 0;

            for (int i = 0; i < 5; i++) {
                line = br.readLine();

                if (line != null &&
                    line.toLowerCase().contains("good")) {
                    count++;
                }
            }

            br.close();

            System.out.println("Good Feedback Count = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("feedback.txt file not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}