package MatrizBotones;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MatrizDeBotones {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrizDeBotones window = new MatrizDeBotones();
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
	public MatrizDeBotones() {
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
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				
			JButton[][] button = new JButton [5][5];
			int cordX = 10;
			int cordY = 10;
			
			for(int i = 0; i < button.length; i++) {
				for(int j = 0; j < button.length; j++) {
				JButton btwNewButton = new JButton("");
				btwNewButton.setBounds(cordX, cordY, 50, 50);
				btwNewButton.setText(Integer.toString(j+1));
				frame.getContentPane().add(button_1);
				cordX +=50;
					}
				
				}
			cordY +=50;
			cordX =10;
			}
		});
	
		
		button_1.setBounds(53, 36, 42, 42);
		frame.getContentPane().add(button_1);
	}
};

