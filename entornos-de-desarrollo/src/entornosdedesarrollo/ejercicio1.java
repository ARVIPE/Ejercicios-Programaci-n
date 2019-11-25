package entornosdedesarrollo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ejercicio1 {

	private JFrame frame;
	private JTextField variable1;
	private JTextField variable2;
	private JTextField Resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 window = new ejercicio1();
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
	public ejercicio1() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 450, 0);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblIntroduzcaPrimerNmero = new JLabel("Introduzca primer número");
		lblIntroduzcaPrimerNmero.setBounds(43, 48, 237, 15);
		frame.getContentPane().add(lblIntroduzcaPrimerNmero);
		
		JLabel lblIntroduzcaSegundoNmero = new JLabel("Introduzca segundo número");
		lblIntroduzcaSegundoNmero.setBounds(43, 75, 227, 15);
		frame.getContentPane().add(lblIntroduzcaSegundoNmero);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(43, 139, 104, 15);
		frame.getContentPane().add(lblResultado);
		
		
		variable1 = new JTextField();
		variable1.setBounds(273, 44, 124, 19);
		frame.getContentPane().add(variable1);
		variable1.setColumns(10);
		
		variable2 = new JTextField();
		variable2.setColumns(10);
		variable2.setBounds(273, 73, 124, 19);
		frame.getContentPane().add(variable2);
		
		Resultado = new JTextField();
		Resultado.setColumns(10);
		Resultado.setBounds(273, 137, 124, 19);
		frame.getContentPane().add(Resultado);
		
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.setBounds(43, 181, 114, 25);
		Resultado = variable1;
		frame.getContentPane().add(btnResultado);
	}
}
