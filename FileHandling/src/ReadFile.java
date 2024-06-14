import java.io.*;

public class ReadFile {
    public static void main(String args[]) {
        String path = "file1.txt";
        File file = new File(path);

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

            int c;
            int countChar=0;
            int countLines=0;
            int countWords=0;


            while ((c = br.read()) != -1) {
                System.out.print((char)c); // Use print instead of println to avoid extra newlines
                countChar++;
                if((char)c==' '|| (char)c=='\n' || (char)c=='\t'){
                    countWords++;
                }
                if((char)c=='\n'){
                    countLines++;
                }
            }
            System.out.println("\nDone");
            System.out.println(countChar);
            System.out.println(countLines+1);
            System.out.println(countWords+1);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
