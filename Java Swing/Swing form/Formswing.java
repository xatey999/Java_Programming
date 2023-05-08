import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// import javafx.*;

import java.awt.*;
import java.awt.event.*;

public class Formswing extends JFrame{
        public Formswing(){
            setSize(500,600);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel namelabel = new JLabel("Name");
            JTextField Jtext = new JTextField(20);
            JLabel JgradeLabel = new JLabel("Grade");
            JTextField Jgradetext = new JTextField(20);
            JLabel JgradeContact = new JLabel("Contact");
            JTextField Jcontacttext = new JTextField(20);
            JButton btn = new JButton("Submit");
            add(namelabel);
            add(Jtext);
            add(JgradeLabel);
            add(Jgradetext);
            add(JgradeContact);
            add(Jcontacttext);
            add(btn);
            setVisible(true);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        String name = Jtext.getText();
                        String grade = Jgradetext.getText();
                        String contact = Jcontacttext.getText(); 
                        System.out.println(name+" "+grade+" "+contact);
                        
                }
              });
        }
        public static void main(String[] args) {
            new Formswing();
        }
}