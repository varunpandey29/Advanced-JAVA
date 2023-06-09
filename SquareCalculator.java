import java.awt.*;
import java.awt.event.*;

public class SquareCalculator extends Frame implements ActionListener {
    private TextField t1;
    private Label resultLabel;
    
    public SquareCalculator() {
        setTitle("Square Calculator");
        setLayout(new FlowLayout());
        
        Label l1 = new Label("Enter the number");
        add(l1);
        // Create the number input field
        t1 = new TextField(10);
        add(t1);
        
        // Create the "Calculate" button
        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);
        
        // Create the label for the result
        resultLabel = new Label(" ");
        add(resultLabel);
        
        // Set the size of the frame and make it visible
        setSize(500, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            // Get the number from the input field
            int number = Integer.parseInt(t1.getText());
            
            // Calculate the square and display the result
            int square = number * number;
            resultLabel.setText("The square of " + number + " is " + square);
        } catch (NumberFormatException ex) {
            // Handle invalid input (non-numeric)
            resultLabel.setText("Please enter a valid number");
        }
    }
    
    public static void main(String[] args) {
        new SquareCalculator();
    }
}
