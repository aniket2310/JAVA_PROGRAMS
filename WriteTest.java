import java.io.FileWriter;
public class WriteTest {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("C:/Users/WIN10-PC/Desktop/Desk Folder/ANUDIP/src/input.txt");
            fw.write("Jai Shree Ram...!");
            fw.close();
        }
        catch(Exception e){System.out.println(e);}
        System.out.println("Written Sucessfully....");
    }
}  