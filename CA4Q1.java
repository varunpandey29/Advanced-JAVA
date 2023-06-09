import java.awt.*;
import java.awt.event.*;


public class CA4Q1 extends Frame implements MouseMotionListener{
        CA4Q1(){
           addMouseMotionListener(this);
           setSize(600,600);
           setLayout(null);
           setVisible(true);
       }
       public void mouseDragged(MouseEvent e) {
           Graphics g=getGraphics();
           g.setColor(Color.RED);
           g.fillOval(e.getX(),e.getY(),20,20);
       }
       
       public void mouseMoved(MouseEvent e) {}
       
       public static void main(String[] args) {
           new CA4Q1();
       }
          
}
