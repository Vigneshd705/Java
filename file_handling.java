import java.io.*;

import javax.swing.text.AbstractDocument.Content;

public class file_handling {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("op.txt"));
            out.write("Hello the content is added to the file");
            out.write("\nthis is sibaath");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("op.txt"));
            String line = in.readLine();
            System.out.println(line);

            in.close();
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
