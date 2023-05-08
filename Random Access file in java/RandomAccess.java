import java.io.*;
public class RandomAccess {
    public static void main(String[] args) throws IOException{
        RandomAccessFile file = new RandomAccessFile("java.txt", "rw");
        // If the file already exist it reads from it else it creates a new file of the name FILE_NAME.txt.
        file.seek(file.length()); // Moving file pointer to the end
        file.writeBytes("\nUjjwal is a Java Programmer");
        file.close();
    }
}