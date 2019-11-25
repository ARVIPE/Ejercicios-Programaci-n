package entornosdedesarrollo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class sumador {

	private JFrame frame;
	private JTextField txtNumero1;
	private JTextField textNumero2;
	private JTextField txtSuma;
	private JTextField txtSumador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sumador window = new sumador();
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
	public sumador() {
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
		
		JButton txtSuma_1 = new JButton("Suma\r\n");
		txtSuma_1.setBackground(Color.CYAN);
		txtSuma_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int valor1 = Integer.parseInt(txtNumero1.getText());
				int valor2 = Integer.parseInt(textNumero2.getText());
				
				int suma = valor1 + valor2;
				
				txtSuma.setText(Integer.toString(suma));
			}
		});
		txtSuma_1.setBounds(48, 136, 97, 25);
		frame.getContentPane().add(txtSuma_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(268, 43, 110, 25);
		frame.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		textNumero2 = new JTextField();
		textNumero2.setBounds(268, 92, 116, 25);
		frame.getContentPane().add(textNumero2);
		textNumero2.setColumns(10);
		
		txtSuma = new JTextField();
		txtSuma.setEditable(false);
		txtSuma.setBounds(268, 136, 114, 25);
		frame.getContentPane().add(txtSuma);
		txtSuma.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introduce el n\u00FAmero 1\r\n");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(40, 47, 156, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblIntroduceElNmro = new JLabel("Introduce el n\u00FAmro 2");
		lblIntroduceElNmro.setBounds(40, 96, 135, 16);
		frame.getContentPane().add(lblIntroduceElNmro);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("SUMADOR");
		panel.setBounds(40, 13, 338, 16);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtSumador = new JTextField();
		txtSumador.setEditable(false);
		txtSumador.setText("SUMADOR");
		panel.add(txtSumador, BorderLayout.CENTER);
		txtSumador.setColumns(10);
	}
}
