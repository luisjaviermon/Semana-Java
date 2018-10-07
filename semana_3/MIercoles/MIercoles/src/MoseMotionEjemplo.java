
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoseMotionEjemplo extends JPanel implements MouseMotionListener{
   JTextField field;
    public MouseMotionEjemplo() {
        frame();
     }
    
    public void frame(){
       JFrame f = new JFrame("Mouse Motion");
       Container con = f.getContentPane();
       con.setLayout(new FlowLayout());
       field = new JTextField(12);
       
       con.addMouseMotionListener(this);
        
       con.add(field);
       
       f.setVisible(true);
       f.setSize(400,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }
   
   public static void main(String[] arg) {
   
       new MoseMotionEjemplo();
   }    

    @Override
    public void mouseDragged(MouseEvent e) {
        int x,y;
        x = e.getX();
        y = e.getY();
        
        field.setText("puntero"+x+","+y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x,y;
        x = e.getX();
        y = e.getY();
        
        field.setText("Mouse"+x+","+y);
    }
}
