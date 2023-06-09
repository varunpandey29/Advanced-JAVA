import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registration extends JFrame { 

    public registration() {
        super("TextField, Password Fields");
        JTextField nf = new JTextField(20);
        JTextField ef = new JTextField(20);
        JPasswordField pf = new JPasswordField(20);
        JPasswordField cpf = new JPasswordField(20);
        
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        
        JLabel l1 = new JLabel("Name ");
        JLabel l2 = new JLabel("Email ");
        JLabel l3 = new JLabel("Password ");
        JLabel l4 = new JLabel("Confirm Password ");
        
        p.setLayout(new GridLayout(5, 2));
        add(p);
        add(p1, BorderLayout.SOUTH);
        p.add(l1);
        p.add(nf);
        p.add(l2);
        p.add(ef);
        p.add(l3);
        p.add(pf);
        p.add(l4);
        p.add(cpf);
        
        JButton b1 = new JButton("Submit");
        JButton b2 = new JButton("Cancel");
        p1.setLayout(new FlowLayout());
        p1.add(b1);
        p1.add(b2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);  
    }

    public static void main(String[] args) {
        new registration();
    }
}
