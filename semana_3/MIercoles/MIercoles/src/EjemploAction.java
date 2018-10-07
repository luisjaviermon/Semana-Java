
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//cada listener tiene sus respectivos metodos
public class EjemploAction {
    
    public EjemploAction() {
        frame();
    }
    
   public void frame(){
       JFrame f = new JFrame();
       f.setVisible(true);
       f.setSize(400,400);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel p = new JPanel();
       JButton b1 = new JButton("Action Listener");
       b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "ActionListener esta funcionando bien pro");
               
           }
           
       });
        
       p.add(b1);
       f.add(p);
   }
    
   
   
   
   
   public static void main(String[] arg) {
   
       new EjemploAction();
   }
}