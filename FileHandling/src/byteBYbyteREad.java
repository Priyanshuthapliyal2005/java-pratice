import java.io.*;

public class byteBYbyteREad {
    public static void main(String args[]) {
        File inputFile = new File("file1.txt");
        File outputFile = new File("file2.txt");

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int c;
            while ((c = fis.read()) != -1) {
                System.out.print(c + " ");
                System.out.println((char)c);
                fos.write(c);
            }

            System.out.println("File copying done!");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
