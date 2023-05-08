import java.util.*;
import java.io.*;
public class FileWrite {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String name[] = new String[20];
            String address[] = new String[20];
            int i;

            for(i=0;i<2;i++){
                name[i] = sc.next();
                address[i] = sc.next();

            }
            FileWriter fr = new FileWriter("student.txt", true);
            try (BufferedWriter br = new BufferedWriter(fr)) {
                for(i=0;i<2;i++){
                    br.write(name[i] +" "+ address[i]);
                    br.newLine();

                }
                sc.close();
                //fr.close();
                br.close();
            }
        }
        
       
    }
    
}