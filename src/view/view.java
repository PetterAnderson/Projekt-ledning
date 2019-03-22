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
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class view {

	private JFrame frame;
	private JTextField txtEnterNamn;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLayeredPane layeredPane;
	private JPanel panelNyKund;
	private JPanel panelKundRegister;
	private JPanel panelEmailUtskick;
	private JTable table;

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
	
	public void switchPanels (JPanel panel){
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
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
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 101, 1105, 715);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelNyKund = new JPanel();
		layeredPane.add(panelNyKund, "name_720098961090600");
		panelNyKund.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 153, 0)));
		panelNyKund.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nordg\\Documents\\GitHub\\Projekt-ledning\\img\\unknown.png"));
		lblNewLabel.setBounds(157, 79, 350, 560);
		panelNyKund.add(lblNewLabel);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setOpaque(true);
		backgroundLabel.setBackground(new Color(255, 204, 153));
		backgroundLabel.setBounds(10, 11, 508, 693);
		panelNyKund.add(backgroundLabel);
		
		txtEnterNamn = new JTextField();
		txtEnterNamn.setOpaque(false);
		txtEnterNamn.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtEnterNamn.setBounds(561, 445, 489, 72);
		panelNyKund.add(txtEnterNamn);
		txtEnterNamn.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		textField_1.setBounds(561, 30, 489, 72);
		panelNyKund.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		textField_2.setBounds(561, 362, 489, 72);
		panelNyKund.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		textField_3.setBounds(561, 279, 489, 72);
		panelNyKund.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		textField_4.setBounds(561, 196, 489, 72);
		panelNyKund.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setOpaque(false);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		textField_5.setBounds(561, 113, 489, 72);
		panelNyKund.add(textField_5);
		textField_5.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setToolTipText("1 = Nyb\u00F6rjare 2 = Entusiast 3 = Proffs");
		slider.setPaintLabels(true);
		slider.setMinimum(1);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(3);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setBounds(561, 580, 489, 40);
		panelNyKund.add(slider);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setForeground(Color.DARK_GRAY);
		lblNamn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNamn.setBounds(561, 30, 46, 14);
		panelNyKund.add(lblNamn);
		
		JLabel lblPnr = new JLabel("Personnummer");
		lblPnr.setForeground(Color.DARK_GRAY);
		lblPnr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPnr.setBounds(561, 113, 121, 14);
		panelNyKund.add(lblPnr);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.DARK_GRAY);
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAdress.setBounds(561, 196, 93, 14);
		panelNyKund.add(lblAdress);
		
		JLabel lblFaktureringsadress = new JLabel("Faktureringsadress");
		lblFaktureringsadress.setForeground(Color.DARK_GRAY);
		lblFaktureringsadress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFaktureringsadress.setBounds(561, 279, 173, 14);
		panelNyKund.add(lblFaktureringsadress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setForeground(Color.DARK_GRAY);
		lblTelefonnummer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTelefonnummer.setBounds(561, 362, 144, 14);
		panelNyKund.add(lblTelefonnummer);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(561, 445, 93, 14);
		panelNyKund.add(lblEmail);
		
		panelEmailUtskick = new JPanel();
		layeredPane.add(panelEmailUtskick, "name_720098969497700");
		panelEmailUtskick.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("utskick");
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		panelEmailUtskick.add(lblNewLabel_1);
		
		panelKundRegister = new JPanel();
		layeredPane.add(panelKundRegister, "name_720098978042300");
		panelKundRegister.setBackground(new Color(204, 255, 255));
		panelKundRegister.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1085, 693);
		panelKundRegister.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Namn", "Email", "Personnummer", "Dansexpertis"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(118);
		table.getColumnModel().getColumn(1).setPreferredWidth(246);
		table.getColumnModel().getColumn(2).setPreferredWidth(182);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Kundregister");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelKundRegister);
			}
		});
		btnNewButton.setBounds(75, 38, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Email-utskick");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelEmailUtskick);
			}
		});
		btnNewButton_1.setBounds(829, 38, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ny Kund");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelNyKund);
			}
		});
		btnNewButton_2.setBounds(463, 38, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
