package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class view {

	private JFrame frame;
	private JTextField txtMagnus;
	private JTextField txtAugust;
	private JTextField txtFan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view window = new view();
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
	public view() {
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
		
		txtMagnus = new JTextField();
		txtMagnus.setText("Magnus");
		txtMagnus.setBounds(60, 25, 130, 26);
		frame.getContentPane().add(txtMagnus);
		txtMagnus.setColumns(10);
		
		txtAugust = new JTextField();
		txtAugust.setText("August");
		txtAugust.setBounds(20, 81, 130, 26);
		frame.getContentPane().add(txtAugust);
		txtAugust.setColumns(10);
		
		txtFan = new JTextField();
		txtFan.setText("fan");
		txtFan.setBounds(20, 119, 130, 26);
		frame.getContentPane().add(txtFan);
		txtFan.setColumns(10);
	}
}
