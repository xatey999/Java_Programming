import java.io.*;
class Buffer{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("random.txt");

        BufferedReader input = new BufferedReader(file);

        String str = input.readLine();

        System.out.println("Data in the file:");
        System.out.println(str);

        input.close();

    }
}