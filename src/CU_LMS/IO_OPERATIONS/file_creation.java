package CU_LMS.IO_OPERATIONS;
import java.io.File;
import java.io.IOException;
public class file_creation {
    static File newfile = new File("newfile.create");

    public static void main(String[] args) {
        try{
            if(newfile.createNewFile()){
                System.out.println("File Created.");
            }
            else {
                System.out.println("Error creating file.");
            }
        }
        catch(IOException e){
            System.out.println("Error ");
        }
    }

}
