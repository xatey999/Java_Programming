import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
    public class Delete {
        public static void main(String[] args) {
            File myFile= new File("random.txt");
            if(myFile.delete()){
                System.out.println("I have deleted:" + myFile.getName());
            }
            else{
                System.out.println("Some problems occured while deleting the file");
            }
        }
    }