import java.awt.*;
public class CA2_Q2 {
    public static void main(String args[])
    {
        Frame f = new Frame();
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b1 = new Button("Button");
        b1.setBounds(120, 200, 50, 50);
        t1.setBounds(50, 100, 200, 30);
        t2.setBounds(50, 150, 200, 30);
        f.setSize(500, 500);
        
        
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.setVisible(true);
        
    }   
}
