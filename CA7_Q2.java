import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CA7_Q2 extends JFrame implements ActionListener {

    private JLabel messageLabel;
    private JButton changeButton;
    private String[] numbers = {"1", "2", "3", "4", "5","6","7","8","9","10"};

    public CA7_Q2() {
        setTitle("Random Number");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with GridBagLayout and add the label to it
        JPanel centerPanel = new JPanel(new GridBagLayout());
        messageLabel = new JLabel("0");
        centerPanel.add(messageLabel, new GridBagConstraints());

        // Add the panel and button to the frame
        add(centerPanel, BorderLayout.CENTER);
        changeButton = new JButton("Click here");
        changeButton.addActionListener(this);
        add(changeButton, BorderLayout.SOUTH);

        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int index = random.nextInt(numbers.length);
        messageLabel.setText(numbers[index]);
    }

    public static void main(String[] args) {
        new CA7_Q2();
    }
}
