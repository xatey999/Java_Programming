//URLDemo.java
import java.net.*;
public class UrlClass{
    public static void main(String[] args){
        try{
            URL url=new URL("https://www.lagrandee.edu.np:10/faculty-and-staff/");
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
            System.out.println("File Name: "+url.getAuthority());

        }catch(Exception e){System.out.println(e);}
    }
}
