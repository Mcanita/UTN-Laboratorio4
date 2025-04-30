package ejemplo3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejemplo2.Categorias;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtNombre;
	private JList list;
	private DefaultListModel<Categorias>dlModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(27, 99, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(27, 51, 46, 14);
		contentPane.add(lblID);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Categorias x = new Categorias();
				x.setId(Integer.parseInt(txtID.getText()));
				x.setNombre(txtNombre.getText());
				dlModel.addElement(x);
			}
		});
		btnAceptar.setBounds(294, 95, 89, 23);
		contentPane.add(btnAceptar);
		
		txtID = new JTextField();
		txtID.setBounds(82, 48, 96, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(82, 96, 96, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		list = new JList();
		list.setBounds(126, 148, 199, 102);
		dlModel = new DefaultListModel<Categorias>();
		list.setModel(dlModel);
		contentPane.add(list);
	}
}
