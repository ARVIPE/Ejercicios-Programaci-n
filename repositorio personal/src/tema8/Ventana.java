package tema8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	
	public Ventana () {
		this.setBounds(0, 0, 800, 600);
		
		this.setContentPane(getPanelPrincipal());
		this.setVisible(true);
	}
	
	/**
	 * 
	 * @return
	 */
	public JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel pnlNombre = new JPanel();
		pnlNombre.add(new JLabel("Nombre:"));
		JTextField jtfNombre = new JTextField(30);
		pnlNombre.add(jtfNombre);
		panel.add(pnlNombre);
		
	
		JPanel pnlPrimerAp = new JPanel();
		pnlPrimerAp.add(new JLabel("Primer Apellido:"));
		JTextField jtfPrimerAp = new JTextField(25);
		pnlPrimerAp.add(jtfPrimerAp);
		panel.add(pnlPrimerAp);
		
		
		JPanel pnlSegunAp = new JPanel();
		pnlSegunAp.add(new JLabel("Segundo Apellido: "));
		JTextField jtfSegunAp = new JTextField(25);
		pnlSegunAp.add(jtfSegunAp);
		panel.add(pnlSegunAp);
		
		JPanel pnlDNI = new JPanel();
		pnlDNI.add(new JLabel("DNI: "));
		JTextField jtfDNI = new JTextField(9);
		pnlDNI.add(jtfDNI);
		panel.add(pnlDNI);
		
		JPanel pnlLoc = new JPanel();
		pnlLoc.add(new JLabel("Localidad: "));
		JTextField jtfLoc = new JTextField(20);
		pnlLoc.add(jtfLoc); 
		panel.add(pnlLoc);
		
		// JButton
		JButton bt = new JButton("Botón");
		
		bt.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Personalización del icono, otra vez
				JOptionPane.showMessageDialog(null, "Botón presionado");
			}
		});
		panel.add(bt);
		
		return panel;
	}
	


	public static void main(String[] args) {
		Ventana v = new Ventana();
	}

}
