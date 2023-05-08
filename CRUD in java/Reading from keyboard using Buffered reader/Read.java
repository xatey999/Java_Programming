import java.io.*;
import java.util.*;

import javax.xml.stream.util.StreamReaderDelegate;
public class Read{
    public static void main(String[] args) throws IOException{
        //If file or input doesn't exist then it throws IOException;

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Integer a = Integer.parseInt(br.readLine());
        Float b = Float.parseFloat(br.readLine());
        String str = br.readLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(str);

    }
}