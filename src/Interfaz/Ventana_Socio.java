package Interfaz;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Socio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Nombre;
	private JTextField textField_Apellido;
	private JTextField textField_Documento;
	private JTextField textField_Telefono;
	private JTextField textField_Direccion;
	private JTextField textField_FechaNacimiento;
	private JTextField textField_Membresia;
	private JTextField textField_RefAdulto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Socio frame = new Ventana_Socio();
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
	public Ventana_Socio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 492);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Table.sortIconHighlight"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JLabel lblBuscarSocio = new JLabel("Socio");
		lblBuscaarSocio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBuscaarSocio.setBounds(272, 25, 77, 19);
		contentPane.add(lblBuscaarSocio);*/
		
		JLabel lblDatos_Socio = new JLabel("Datos Socio:");
		lblDatos_Socio.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDatos_Socio.setBounds(248, 21, 137, 20);
		contentPane.add(lblDatos_Socio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 55, 62, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(10, 80, 62, 14);
		contentPane.add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 105, 62, 14);
		contentPane.add(lblDocumento);
		
		JLabel lblTelfono = new JLabel("Teléfono:");
		lblTelfono.setBounds(10, 130, 62, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Dirección:");
		lblDireccin.setBounds(280, 55, 69, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblFechaDeNaciomiento = new JLabel("Fecha de Naciomiento:");
		lblFechaDeNaciomiento.setBounds(280, 80, 137, 14);
		contentPane.add(lblFechaDeNaciomiento);
		
		JLabel lblMembresa = new JLabel("Membresía:");
		lblMembresa.setBounds(280, 130, 89, 14);
		contentPane.add(lblMembresa);
		
		JLabel lblInformacinMdica = new JLabel("Información Médica:");
		lblInformacinMdica.setBounds(133, 162, 117, 14);
		contentPane.add(lblInformacinMdica);
		
		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(72, 52, 183, 20);
		contentPane.add(textField_Nombre);
		
		textField_Apellido = new JTextField();
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(72, 77, 183, 20);
		contentPane.add(textField_Apellido);
		
		textField_Documento = new JTextField();
		textField_Documento.setColumns(10);
		textField_Documento.setBounds(72, 102, 183, 20);
		contentPane.add(textField_Documento);
		
		textField_Telefono = new JTextField();
		textField_Telefono.setColumns(10);
		textField_Telefono.setBounds(72, 127, 183, 20);
		contentPane.add(textField_Telefono);
		
		textField_Direccion = new JTextField();
		textField_Direccion.setColumns(10);
		textField_Direccion.setBounds(413, 52, 183, 20);
		contentPane.add(textField_Direccion);
		
		textField_FechaNacimiento = new JTextField();
		textField_FechaNacimiento.setColumns(10);
		textField_FechaNacimiento.setBounds(413, 77, 183, 20);
		contentPane.add(textField_FechaNacimiento);
		
		textField_Membresia = new JTextField();
		textField_Membresia.setColumns(10);
		textField_Membresia.setBounds(413, 127, 183, 20);
		contentPane.add(textField_Membresia);
		
		JComboBox comboBox_InfoMedica = new JComboBox();
		comboBox_InfoMedica.setModel(new DefaultComboBoxModel(new String[] {"", "Es Normal", "No Es Normal", "Piensa Que Votar A La Derecha Lo Saca De La Pobreza"}));
		comboBox_InfoMedica.setBounds(260, 155, 183, 22);
		contentPane.add(comboBox_InfoMedica);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			limpiarFormulario();
			}
			
		});
		btnLimpiar.setBounds(72, 419, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(476, 419, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volver();
				dispose();
			}
		});
		btnVolver.setBounds(267, 419, 89, 23);
		contentPane.add(btnVolver);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 238, 586, 2);
		contentPane.add(separator);
		
		JLabel lblReferenteAdulto = new JLabel("Referente Adulto:");
		lblReferenteAdulto.setBounds(280, 105, 89, 14);
		contentPane.add(lblReferenteAdulto);
		
		textField_RefAdulto = new JTextField();
		textField_RefAdulto.setColumns(10);
		textField_RefAdulto.setBounds(413, 102, 183, 20);
		contentPane.add(textField_RefAdulto);
		
		JLabel lblHistorial = new JLabel("Historial:");
		lblHistorial.setBounds(10, 265, 89, 14);
		contentPane.add(lblHistorial);
		
		JLabel lblAnotarEnClase = new JLabel("Anotar en Clase:");
		lblAnotarEnClase.setBounds(291, 265, 89, 14);
		contentPane.add(lblAnotarEnClase);
	}
	
	private void limpiarFormulario () {
		textField_Nombre.setText("");
		textField_Apellido.setText("");
		textField_Direccion.setText("");
		textField_Telefono.setText("");
		textField_Documento.setText("");
		textField_Membresia.setText("");
		textField_FechaNacimiento.setText("");
		textField_RefAdulto.setText("");
		//textField_BuscarSocio.setText("");
	}
	
	private void volver () {
		Ventana_Principal Ventana = new Ventana_Principal();
		Ventana.setVisible(true);
	}
}
