import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class CA5_Q1 extends Frame implements ActionListener {
    private TextField FnameField, LnameField, AttField, idField, AddField;
    private Button addButton, updateButton, deleteButton;
    private Label messageLabel;
    private Connection connection;

    public CA5_Q1() {
        super("Attend");

        // Create text fields
        idField = new TextField(20);
        FnameField = new TextField(20);
        LnameField = new TextField(20);
        AddField = new TextField(20);
        AttField = new TextField(20);
        

        // Create buttons
        addButton = new Button("Add");
        addButton.addActionListener(this);
        updateButton = new Button("Update");
        updateButton.addActionListener(this);
        deleteButton = new Button("Delete");
        deleteButton.addActionListener(this);

        // Create message label
        messageLabel = new Label("");

        // Add components to window
        setLayout(new GridLayout(4, 2));
        add(new Label("ID:"));
        add(idField);
        add(new Label("First Name:"));
        add(FnameField);
        add(new Label("Last Name:"));
        add(LnameField);
        add(new Label("Address:"));
        add(AddField);
        add(new Label("Attendance:"));
        add(AttField);
        
        add(addButton);
        add(updateButton);
        add(deleteButton);
        add(messageLabel);

        // Connect to MySQL database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/attend", "root", "");
        } catch (Exception ex) {
            messageLabel.setText("Error connecting to DB" + ex.getMessage());
        }

        // Set window size and visibility
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Statement statement = connection.createStatement();
            String fname = FnameField.getText();
            String lname = LnameField.getText();
            String adr = AddField.getText();
            String abs = AttField.getText();
            int id = Integer.parseInt(idField.getText());

            if (e.getSource() == addButton) {
                statement.executeUpdate("INSERT INTO lab5 (idField, FnameField, LnameField, AddField, AttField) VALUES (" + id + ", '" +fname+ "', '" + lname + "','"+adr+"','"+abs+"')");
                messageLabel.setText("Record added successfully");
            } else if (e.getSource() == updateButton) {
                statement.executeUpdate("UPDATE mytable SET FnameField = '" + fname + "',LnameField = '" + lname + "',AddField = '" + adr + "', AttField= " + abs + " WHERE idField = " + id);
                messageLabel.setText("Record updated successfully");
            } else if (e.getSource() == deleteButton) {
                statement.executeUpdate("DELETE FROM mytable WHERE idField = " + id);
                messageLabel.setText("Record deleted successfully");
            }
        } catch (Exception ex) {
            messageLabel.setText("Error performing operation: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new CA5_Q1();
    }
}
