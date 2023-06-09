import javax.swing.*;
import java.awt.*;

public class CA7_Q3 extends JFrame {

    public CA7_Q3() {
        setTitle("Text Input Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a panel to hold the text input controls
        JPanel inputPanel = new JPanel(new GridLayout(0, 1));

        // create a text field
        JTextField textField = new JTextField("Enter text here");
        inputPanel.add(textField);

        // create a password field
        JPasswordField passwordField = new JPasswordField();
        inputPanel.add(passwordField);

        // create a text area
        JTextArea textArea = new JTextArea("Enter longer text here");
        JScrollPane scrollPane = new JScrollPane(textArea);
        inputPanel.add(scrollPane);

        // add the input panel to the frame
        add(inputPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CA7_Q3();
    }
}
