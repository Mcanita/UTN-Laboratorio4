package ejemplo1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	private JComboBox<String> cbLocalidades;
	private JButton btnAceptar;
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		//contentPane.setBackground(Color.red);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(316, 82, 115, 29);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null , "Localidad seleccionada: "+cbLocalidades.getSelectedItem());
			}
		});
		
		cbLocalidades = new JComboBox<String>();
		cbLocalidades.setBounds(62, 83, 195, 26);
		cbLocalidades.setMaximumRowCount(10);
		
		cbLocalidades.addItem("Tigre");
		cbLocalidades.addItem("San Fernando");
		cbLocalidades.addItem("San Miguel");
		
		contentPane.add(cbLocalidades);
		contentPane.add(btnAceptar);
	}

}
