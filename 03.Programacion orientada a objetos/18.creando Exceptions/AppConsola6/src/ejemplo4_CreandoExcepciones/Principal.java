package ejemplo4_CreandoExcepciones;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try {
		String correo = JOptionPane.showInputDialog("Ingrese su correo electrónico: ");
		Mail.validarMail(correo);
		}
		catch(FaltaPuntoException e)
		{
			System.out.println("Error, FaltaPuntoException ");
			e.printStackTrace();
		}
		catch(FaltaArrobaException e)
		{
			System.out.println("Error, FaltaArrobaException");
			e.printStackTrace();
		}
	}

}
