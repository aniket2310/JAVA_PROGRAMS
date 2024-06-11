import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the String : ");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String line;

        while ((line =in.readLine())!=null && line.length()!=0)
        {
            System.out.println("You have Entered Data : "+line);
        }

    }
}
