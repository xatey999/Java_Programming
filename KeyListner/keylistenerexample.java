import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
//import java.util.logging.Formatter;
public class keylistenerexample extends Frame implements MouseListener, KeyListener{
  
    Label l;
    TextArea area;
    keylistenerexample(){
        addMouseListener(this);
        addKeyListener(this);
        Label l = new Label();
        l.setBounds (20, 50, 100, 20);
        area = new TextArea();
        area.setBounds (20, 8, 100, 20);
        area.addKeyListener(this);
        area.addMouseListener(this);
        add(l);
        add(area);
        setSize(200, 200);
        setVisible(true);

        addWindowListener (new WindowAdapter() 
{
        public void  windowClosing(WindowEvent e){
            dispose();
        }
});
        

    }

    public void keyPressed (KeyEvent e){
        l.setText ("Key Pressed");

    }

    public void mousePressed(MouseEvent e){
        l.setText ("Mouse pressed");
    }
    public void mouseClicked(MouseEvent e){
        l.setText ("Mouse Clicked");
    }

    public void mouseExited(MouseEvent e){
        l.setText ("Mouse Exited");

    }
    
    public void keyReleased(KeyEvent e){
        l.setText ("Key Released");
    }
    
    public void keyTyped(KeyEvent e){
        l.setText ("Key Typed");
    }
    
    public void mouseEntered(MouseEvent e){
        l.setText ("Mouse entered");
    }

    public void mouseReleased(MouseEvent e){
        l.setText ("Mouse Released");

    }

    public static void main(String[] args){
        new keylistenerexample();
    }
    
   

    // public void windowClosing(WindowEvent e){
    //     System.exit(0);
    // }
   

    
}

