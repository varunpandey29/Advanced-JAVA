import java.awt.*;
public class CA2_Q5 {
    public static void main(String args[]){
        Frame f = new Frame();     
        Label l = new Label("Select a color: ");


        Checkbox checkbox1 = new Checkbox("Red");    
        checkbox1.setBounds(100, 400,  50, 10);    
        Checkbox checkbox2 = new Checkbox("Green");    
        checkbox2.setBounds(100, 450,  50, 10);    
        Checkbox checkbox3 = new Checkbox("Blue");    
        checkbox3.setBounds(100, 500,  50, 10);  
        
        
        f.add(checkbox1);    
        f.add(checkbox2);    
        f.add(checkbox3);    
        f.add(l);
        
        f.setVisible(true);
        f.setSize(600,600);
        
    }
}