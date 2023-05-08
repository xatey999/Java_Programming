import java.*;
import java.applet.*;
import java.awt.*;
/* <applet code = labapplet width = 800 height = 800> </applet> */
public class labapplet extends Applet{
    public void init(){
        Label l1 = new label("Student name");
        add(l1);

    }
    public void paint(Graphics G){
        G.drawstring("Ujjwal");
    }
}


