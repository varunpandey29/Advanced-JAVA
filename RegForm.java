import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegForm extends JFrame { 

    public RegForm() {
        super("TextField, Password Fields");
        JTextField nf = new JTextField(10);
        JTextField ef = new JTextField(10);
        JRadioButton m = new JRadioButton("Male");
        JRadioButton f = new JRadioButton("Female");
        m.setBounds(75,50,100,30);    
        f.setBounds(75,100,100,30);    
                
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        
        JLabel l1 = new JLabel("Name ");
        JLabel l2 = new JLabel("Email ");
        JLabel l3 = new JLabel("Gender");
        
        p.setLayout(new GridLayout(5, 2));
        add(p);
        add(p1, BorderLayout.SOUTH);
        p.add(l1);
        p.add(nf);
        p.add(l2);
        p.add(ef);
        p.add(l3);
        p.add(m);
        p.add(f);
        
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
        new RegForm();
    }
}
