package ejerciciostabla.exportacionjava;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import ejerciciostabla.exportacionjava.Alumnos;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaAlumnos {

	private JFrame frame;
	private int indiceAlumnoActual = 0;
	private int numAlumnos = -1;
	private Alumnos[] arrayAlumnos = new Alumnos[50];
	private JTextField txtNumero;
	private JTextField txtNombre;
	private JTextField txtGrupo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaAlumnos window = new PantallaAlumnos();
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
	public PantallaAlumnos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumeroAlumno = new JLabel("NumeroAlumno");
		lblNumeroAlumno.setBounds(38, 45, 136, 15);
		frame.getContentPane().add(lblNumeroAlumno);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(192, 43, 95, 19);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(38, 100, 66, 15);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblGrupo = new JLabel("Grupo");
		lblGrupo.setBounds(38, 148, 66, 15);
		frame.getContentPane().add(lblGrupo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(192, 98, 95, 19);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtGrupo = new JTextField();
		txtGrupo.setBounds(192, 146, 95, 19);
		frame.getContentPane().add(txtGrupo);
		txtGrupo.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNombre.setText("");
				txtGrupo.setText("");
				txtNumero.setText("");
			}
		});
		btnNuevo.setBounds(314, 40, 114, 25);
		frame.getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Alumnos auxiliar = new Alumnos();
				auxiliar.setNombre(txtNombre.getText());
				auxiliar.setNumAl(Long.parseLong(txtNumero.getText()));
				auxiliar.setGrupo(txtGrupo.getText());
				
				arrayAlumnos[indiceAlumnoActual] = auxiliar;
				indiceAlumnoActual++;
				numAlumnos++;
			}
		});
		btnGuardar.setBounds(314, 95, 114, 25);
		frame.getContentPane().add(btnGuardar);
		
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				indiceAlumnoActual--;
				
				if(indiceAlumnoActual == -1) {
					
					System.out.println();
					
				}
				
			
			}
		});
		btnAnterior.setBounds(28, 195, 114, 25);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				indiceAlumnoActual++;
				
			
			}
		});
		btnSiguiente.setBounds(173, 195, 114, 25);
		frame.getContentPane().add(btnSiguiente);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
