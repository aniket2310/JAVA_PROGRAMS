import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputOutput {

    //source is file and destination is file

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:/Users/WIN10-PC/Desktop/Desk Folder/ANUDIP/src/input.txt");
        File file2 = new File("C:/Users/WIN10-PC/Desktop/Desk Folder/ANUDIP/src/output.txt");

        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);

        int ch ;
       while((ch =reader.read())!=-1)
        {
            writer.write(ch);

        }

        reader.close();
        writer.close();
        System.out.println("File Copied ....!");

    }
}
