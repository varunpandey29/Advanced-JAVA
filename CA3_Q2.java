import java.awt.*;
import java.awt.event.*;


public class CA3_Q2 extends Frame implements ActionListener {
    private TextField txtf1;
    private TextField txtf2;
    private Button button;

    public CA3_Q2(){
        super("Text copy");

        txtf1 = new TextField(20);
        txtf2 = new TextField(20);
        button = new Button("Copy");

        button.addActionListener(this);

        setLayout(new FlowLayout());
        add(txtf1);
        add(txtf2);
        add(button);

        setSize(400, 250);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            txtf2.setText(txtf1.getText());
        }
    }

    public static void main(String[] args) {
        new CA3_Q2();
    }
    
}