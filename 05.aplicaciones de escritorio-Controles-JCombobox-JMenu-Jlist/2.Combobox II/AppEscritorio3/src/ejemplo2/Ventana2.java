package ejemplo2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<Categorias> cbCategorias ;
	private JButton btnAceptar ;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cbCategorias = new JComboBox<Categorias>();
		cbCategorias.setBounds(82, 77, 124, 22);
		contentPane.add(cbCategorias);
		
		cbCategorias.addItem(new Categorias(1,"Limpieza"));
		cbCategorias.addItem(new Categorias(2,"Bebidas"));
		
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null,"el usuario selecciono:  "+((Categorias)cbCategorias.getSelectedItem()).getNombre());
			}
		});
		btnAceptar.setBounds(243, 77, 89, 23);
		contentPane.add(btnAceptar);
	}
}
