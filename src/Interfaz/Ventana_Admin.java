package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana_Admin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Admin frame = new Ventana_Admin();
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
	public Ventana_Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPanel_Admin = new JLabel("Panel de Administación");
		lblPanel_Admin.setFont(new Font("Arial Black", Font.PLAIN, 22));
		lblPanel_Admin.setBounds(189, 23, 294, 26);
		contentPane.add(lblPanel_Admin);
		
		JLabel lblSocio = new JLabel("Socio:");
		lblSocio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSocio.setBounds(36, 91, 46, 14);
		contentPane.add(lblSocio);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProfesor.setBounds(36, 217, 70, 14);
		contentPane.add(lblProfesor);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 189, 643, 2);
		contentPane.add(separator);
		
		JButton btnAlta_Socio = new JButton("Dar de Alta");
		btnAlta_Socio.setBounds(36, 136, 103, 23);
		contentPane.add(btnAlta_Socio);
		
		JButton btnModificar_Socio = new JButton("Modificar");
		btnModificar_Socio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificar_Socio.setBounds(259, 136, 103, 23);
		contentPane.add(btnModificar_Socio);
		
		JButton btnBaja_Socio = new JButton("Dar de Baja");
		btnBaja_Socio.setBounds(497, 136, 103, 23);
		contentPane.add(btnBaja_Socio);
		
		JButton btnAlta_Profesor = new JButton("Dar de Alta");
		btnAlta_Profesor.setBounds(36, 293, 103, 23);
		contentPane.add(btnAlta_Profesor);
		
		JButton btnModificar_Profesor = new JButton("Modificar");
		btnModificar_Profesor.setBounds(259, 293, 103, 23);
		contentPane.add(btnModificar_Profesor);
		
		JButton btnBaja_Profesor = new JButton("Dar de Baja");
		btnBaja_Profesor.setBounds(497, 293, 103, 23);
		contentPane.add(btnBaja_Profesor);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 352, 643, 2);
		contentPane.add(separator_1);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
				dispose();
			}
		});
		btnVolver.setBounds(91, 379, 122, 23);
		contentPane.add(btnVolver);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(410, 379, 122, 23);
		contentPane.add(btnSalir);
		
		textField = new JTextField();
		textField.setBounds(127, 90, 274, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscarSocio = new JButton("Buscar");
		btnBuscarSocio.setBounds(429, 89, 103, 23);
		contentPane.add(btnBuscarSocio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 216, 274, 20);
		contentPane.add(textField_1);
		
		JButton btnBuscarProfesor = new JButton("Buscar");
		btnBuscarProfesor.setBounds(429, 215, 103, 23);
		contentPane.add(btnBuscarProfesor);
	}

	private void volver () {
		Ventana_Principal Ventana = new Ventana_Principal();
		Ventana.setVisible(true);
	}
}
