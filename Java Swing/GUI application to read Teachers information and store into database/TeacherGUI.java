import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TeacherGUI extends JFrame implements ActionListener {
    private JLabel labelTchId, labelTchName, labelTchAdd, labelTchPhone;
    private JTextField txtTchId, txtTchName, txtTchAdd, txtTchPhone;
    private JButton btnAdd;
    
    public TeacherGUI() {
        setTitle("Teacher Information");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2));
        getContentPane().add(panel, BorderLayout.CENTER);

        labelTchId = new JLabel("Teacher ID:");
        panel.add(labelTchId);

        txtTchId = new JTextField();
        panel.add(txtTchId);

        labelTchName = new JLabel("Teacher Name:");
        panel.add(labelTchName);

        txtTchName = new JTextField();
        panel.add(txtTchName);

        labelTchAdd = new JLabel("Teacher Address:");
        panel.add(labelTchAdd);

        txtTchAdd = new JTextField();
        panel.add(txtTchAdd);

        labelTchPhone = new JLabel("Teacher Phone:");
        panel.add(labelTchPhone);

        txtTchPhone = new JTextField();
        panel.add(txtTchPhone);

        btnAdd = new JButton("Add");
        btnAdd.addActionListener(this);
        panel.add(btnAdd);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            String tchId = txtTchId.getText();
            String tchName = txtTchName.getText();
            String tchAdd = txtTchAdd.getText();
            String tchPhone = txtTchPhone.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");

                PreparedStatement ps = con.prepareStatement("INSERT INTO teachers (TchId, TchName, TchAdd, TchPhone) VALUES (?, ?, ?, ?)");
                ps.setString(1, tchId);
                ps.setString(2, tchName);
                ps.setString(3, tchAdd);
                ps.setString(4, tchPhone);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Teacher information added successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add teacher information.");
                }

                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }
}
