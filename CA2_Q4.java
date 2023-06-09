import java.awt.*;
public class CA2_Q4 {
    public static void main(String args[])
    {
        Frame f = new Frame();
        Label l = new Label("Choose your favorite programming language: ");
        Choice c = new Choice();   
        c.setBounds(250, 250, 75, 75);    
        c.add("Java");    
        c.add("Python");    
        c.add("C#");    
        c.add("C/C++");    
           
        f.add(c);
        f.add(l);
        
        f.setVisible(true);
        f.setSize(500,500);
        
        
    }  
}
