import java.awt.*;
public class CA2_Q3 {
    public static void main(String args[])
    {
        Frame f = new Frame();
        TextField t1 = new TextField();
        Label l = new Label("Enter your Name");
        t1.setBounds(20, 300, 300, 30);
        
        f.setSize(500, 500);        
        f.add(t1);
        f.add(l);
        f.setVisible(true);
        
    }   
}
