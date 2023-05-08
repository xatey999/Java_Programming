import java.awt.*;
import java.awt.event.*;
public class ListenerAdapter extends MouseAdapter{
    Frame f;
    Label l;
    TextArea area;
    ListenerAdapter() {
        f = new Frame ("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        l = new Label();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        f.add(l);
        f.add(area);
        //area.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    // main method
    public static void main(String[] args) {
        new ListenerAdapter();
    }
}