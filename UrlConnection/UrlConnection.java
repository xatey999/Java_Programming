import java.io.*;
import java.net.*;
public class UrlConnection {
    public static void main(String[] args){
        try{
            URL url=new URL("https://www.lagrandee.edu.np/faculty-and-staff/");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}
    }
}