package Interfaz;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;



public class Ventana_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Contraseña;
	private JTextField textField_Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Principal frame = new Ventana_Principal();
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
	public Ventana_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 386);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Titulo = new JLabel("BIENVENIDOS A ITS GYM SYSTEM");
		lbl_Titulo.setBounds(63, 11, 501, 47);
		lbl_Titulo.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_Usuario = new JLabel("Usuario: ");
		lbl_Usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Usuario.setBounds(32, 124, 105, 14);
		contentPane.add(lbl_Usuario);
		
		JLabel lbl_Contraseña = new JLabel("Contraseña:");
		lbl_Contraseña.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_Contraseña.setBounds(32, 169, 105, 14);
		contentPane.add(lbl_Contraseña);
		
		textField_Contraseña = new JTextField();
		textField_Contraseña.setColumns(10);
		textField_Contraseña.setBounds(189, 163, 235, 20);
		contentPane.add(textField_Contraseña);
		
		JButton btn_Ingresar = new JButton("Ingresar");
		btn_Ingresar.setBounds(67, 265, 118, 23);
		contentPane.add(btn_Ingresar);
		
		btn_Ingresar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String usuario = textField_Usuario.getText();
		        String password = textField_Contraseña.getText();


		        // Simulación (hasta tener BD)
		        if (usuario.equals("socio") && password.equals("123")) {
		            new Ventana_Admin().setVisible(true);
		            dispose();
		        } else {
		            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
		        }
		           
		    }
		    
		});
		getRootPane().setDefaultButton(btn_Ingresar);//Comando para ingresar apretando enter


		
		JButton btn_Limpiar = new JButton("Limpiar");
		btn_Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});
		btn_Limpiar.setBounds(225, 265, 118, 23);
		contentPane.add(btn_Limpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(391, 265, 118, 23);
		contentPane.add(btnSalir);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(189, 123, 235, 20);
		contentPane.add(textField_Usuario);
	}
	
	private void limpiarFormulario () {
		textField_Usuario.setText("");
		textField_Contraseña.setText("");
	}	
}

