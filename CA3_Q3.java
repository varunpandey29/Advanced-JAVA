import java.awt.*;
import java.awt.event.*;

public class CA3_Q3 extends Frame implements ActionListener {
    private Button submitButton;
    private TextField t1;

    public CA3_Q3() {
        setTitle("StringLength");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label l1 = new Label("Enter a string: ");
        t1 = new TextField(10);
        
        add(l1);
        add(t1);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String str = t1.getText();
            int len = str.length();
            String message = "The length of the entered string is: " + len;
            Dialog d = new Dialog(this, "Result", true);
            d.setLayout(new FlowLayout());
            Label l = new Label(message);
            d.add(l);
            Button b = new Button("OK");
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.dispose();
                }
            });
            d.add(b);
            d.setSize(300, 100);
            d.setVisible(true);
        } catch (NumberFormatException ex) {
            Dialog d = new Dialog(this, "Error", true);
            d.setLayout(new FlowLayout());
            Label l = new Label("Please enter a valid string!");
            d.add(l);
            Button b = new Button("OK");
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.dispose();
                }
            });
            d.add(b);
            d.setSize(200, 100);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        CA3_Q3 StringLength = new CA3_Q3();
    }
}

