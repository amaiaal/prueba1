package pruebaWindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ventana1 {

	private JFrame frame;
	private JTextField nomUser;
	private JPasswordField passUser;
	private JTextField mailUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana1 window = new ventana1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduzca Nombre de Usuario");
		lblNewLabel.setBounds(24, 28, 146, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduzca la contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(24, 69, 157, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		nomUser = new JTextField();
		nomUser.setBounds(188, 33, 86, 20);
		frame.getContentPane().add(nomUser);
		nomUser.setColumns(10);
		
		passUser = new JPasswordField();
		passUser.setBounds(191, 74, 83, 20);
		frame.getContentPane().add(passUser);
		
		JLabel Email = new JLabel("Email");
		Email.setBounds(24, 110, 46, 14);
		frame.getContentPane().add(Email);
		
		mailUser = new JTextField();
		mailUser.setToolTipText("");
		mailUser.setColumns(10);
		mailUser.setBounds(188, 107, 124, 20);
		frame.getContentPane().add(mailUser);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(118, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("No soy un robot");
		chckbxNewCheckBox.setBounds(34, 179, 103, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBounds(198, 140, 63, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		rdbtnNewRadioButton_1.setBounds(306, 140, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
