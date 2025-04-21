package ejemplo2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JButton boton;
	
	public Ventana()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(350, 350);
		setTitle("Titulo 2");
		setLayout(null);
		
		boton = new JButton();
		boton.setText("Aceptar");
		boton.setBounds(10, 15, 140, 30);
		
		getContentPane().add(boton);
	}
	
	public void cambiarVisibilidad (boolean estado)
	{
		setVisible(true);
	}

}
