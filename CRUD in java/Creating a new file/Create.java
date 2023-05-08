import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
    public class Create {
        public static void main(String[] args) throws Exception {
            File myFile = new File("random.txt");
            // File cannot create new file to create file we should use createNewFile() Command
            // try {
                myFile.createNewFile();
                System.out.println("File created successfully.");
            //} 
            // catch (IOException e) {
            //     e.printStackTrace();
            // }
        }
    }