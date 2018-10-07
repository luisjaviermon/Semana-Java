import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEjemplo implements MouseListener{

    public MouseEjemplo() {
    }

private int x, y;
    
    public void paint(Graphics c){
        super.paint(c);
        c.setColor(Color.white);
        c.drawOval(x, y, 20, 20);
        
    }




    public static void main(String[] arg) {
       JFrame f = new JFrame("mi paint que solo dibuja un punto");
       f.setVisible(true);
       f.setSize(400,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JPanel p = new MouseEjemplo();
       p.setBackground(Color.BLACK);
       p.setSize(400,400);
       
       p.addMouseListener((MouseListener) p);
       f.add(p);
   }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
