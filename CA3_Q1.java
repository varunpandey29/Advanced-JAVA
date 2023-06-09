import java.awt.*;
import java.awt.event.*;

public class CA3_Q1 extends Frame implements ActionListener {
    private Button submitButton;
    private TextField t1;

    public CA3_Q1() {
        setTitle("SquareNumber");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label l1 = new Label("Enter a number: ");
        t1 = new TextField();
        add(l1);
        add(t1);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(t1.getText());
            int square = num * num;
            String message = "The square of the number you entered is: " + square;
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
            Label l = new Label("Please enter a valid number!");
            d.add(l);
            //Button b = new Button("OK");
            //b.addActionListener(new ActionListener() {
                //public void actionPerformed(ActionEvent e) {
                    //d.dispose();
                //}
            //};
            //d.add(b);
            //d.setSize(200, 100);
            //d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        CA3_Q1 SquareNumber = new CA3_Q1();
    }
}
