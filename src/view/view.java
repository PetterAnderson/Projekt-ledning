package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSlider;

public class view {

	private JFrame frame;
	private JTextField txtEnterNamn;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		frame.setBounds(100, 100, 1141, 866);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 101, 1105, 715);
		frame.getContentPane().add(layeredPane);
		
		JPanel panelNyKund = new JPanel();
		panelNyKund.setBounds(0, 0, 1105, 715);
		layeredPane.add(panelNyKund);
		panelNyKund.setLayout(null);
		
		JPanel panelKundregister = new JPanel();
		panelKundregister.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		panelKundregister.setBounds(0, 0, 1105, 715);
		panelNyKund.add(panelKundregister);
		panelKundregister.setLayout(null);
		
		txtEnterNamn = new JTextField();
		txtEnterNamn.setOpaque(false);
		txtEnterNamn.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		txtEnterNamn.setBounds(561, 445, 489, 72);
		panelKundregister.add(txtEnterNamn);
		txtEnterNamn.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		textField_1.setBounds(561, 30, 489, 72);
		panelKundregister.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		textField_2.setBounds(561, 362, 489, 72);
		panelKundregister.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		textField_3.setBounds(561, 279, 489, 72);
		panelKundregister.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		textField_4.setBounds(561, 196, 489, 72);
		panelKundregister.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setOpaque(false);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		textField_5.setBounds(561, 113, 489, 72);
		panelKundregister.add(textField_5);
		textField_5.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setMinimum(1);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(3);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setBounds(561, 602, 489, 26);
		panelKundregister.add(slider);
		
		JPanel panelEmailUtskick = new JPanel();
		panelEmailUtskick.setBounds(0, 0, 1105, 715);
		layeredPane.add(panelEmailUtskick);
		panelEmailUtskick.setLayout(null);
		
		JButton btnNewButton = new JButton("Kundregister");
		btnNewButton.setBounds(75, 38, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Email-utskick");
		btnNewButton_1.setBounds(829, 38, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ny Kund");
		btnNewButton_2.setBounds(463, 38, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
