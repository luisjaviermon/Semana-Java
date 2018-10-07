//Interfaz grafica: bibliotecas->awt y 

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class JFrameTest{
	public static void main(String[] args) {
		/*//Mostrar una ventana

		JFrame marco = new JFrame("prueba");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//permite cerrar la ventana
		marco.setSize(400,300);//definimos el tamaño de la ventana
		marco.setVisible(true);*/
		/*
		//JOptionPane.showMessageDialog(null,"Mensaje de prueba");//Se coloca null cuando no viene de un elemento padre
		JOptionPane.showMessageDialog(null,"Mensaje de prueba","JOptionPane",JOptionPane.ERROR_MESSAGE);//se muestra el titulo de la ventana y el icono corespondinete
		/*INFORMATION_MESSAGE
		WARNING_MESSAGE
		QUESTION_MESSAGE
		PLAIN_MESSAGE
		ERROR_MESSAGE
		*/
		/*
		//
		String prueba = JOptionPane.showInputDialog(null,"ingresa algo","panel",JOptionPane.ERROR_MESSAGE);
		System.out.println(prueba);*/

		//String[] carreras={"geofisica","conta","derecho"};
		//String prueba = (String)JOptionPane.showInputDialog(null,"carreras","seleccione Carreras",JOptionPane.PLAIN_MESSAGE,null,carreras,carreras[0]);
		//int p = JOptionPane.showConfirmDialog(null,"seguro");
		//int p = JOptionPane.showConfirmDialog(null,"seguro?????","alerta!!!!",JOptionPane.YES_NO_OPTION);
		JFrame frame = new JFrame("ejemplo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*JButton b1 = new JButton("boton 1");
		JButton b2 = new JButton("boton 2");
		JButton b3 = new JButton("boton 3");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);*/
		

		/*GridLayout gl = new GridLayout(4,3);
		gl.setHgap(5);
		gl.setVgap(5);
		frame.setLayout(gl);

		for(int i=1;i<=9;i++){
			frame.add(new JButton(String.valueOf(i)));
		}

		frame.add(new JButton("*"));
		frame.add(new JButton("0"));
		frame.add(new JButton("#"));

		frame.pack();
		frame.setVisible(true);*/
		BorderLayout bl = new BorderLayout();
		frame.setLayout(bl);

		JButton bNorte = new JButton("Norte");
		JButton bSur = new JButton("Sur");
		JButton bEste = new JButton("Este");
		JButton bOeste = new JButton("Oeste");
		JButton bCentro = new JButton("Centro");

		bl.setVgap(10);
		bl.setHgap(10);

		frame.add(bNorte,BorderLayout.NORTH);
		frame.add(bSur,BorderLayout.SOUTH);
		frame.add(bEste,BorderLayout.EAST);
		frame.add(bOeste,BorderLayout.WEST);
		frame.add(bCentro,BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);


	}
}