import javax.swing.*;
public class SwingInheritance extends JFrame{
    //inheritingJFrame
    JFrame f;
    SwingInheritance(){
        JButton b = new JButton("click");//createbutton
        b.setBounds(130,100,100,40);
        add(b);//addingbuttononframe
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[]args){
        new SwingInheritance();
    }
}