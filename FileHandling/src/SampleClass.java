import java.io.*;

public class SampleClass {
    public static void main(String[] args) throws IOException{
        
        String path="file1.txt";
        File file=new File(path);
        FileWriter fw=new FileWriter(file);

        BufferedWriter bw=new BufferedWriter(fw);

        fw.write("Hello World");

        System.out.println("Done");
        bw.close();
        fw.close();
    }
}
