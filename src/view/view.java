package view;

import java.awt.EventQueue;
import controller.Controller;
import modell.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JButton; 
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class view {

	private JFrame frame;
	private Controller controller;
	private KundRegister kundReg;
	private JTextField txtEmail;
	private JTextField txtNamn;
	private JTextField txtTele;
	private JTextField txtFaktureringsAdress;
	private JTextField txtAdress;
	private JTextField txtPnr;
	private JLayeredPane layeredPane;
	private JPanel panelNyKund;
	private JPanel panelKundRegister;
	private JPanel panelEmailUtskick;
	private JTextField txtDans;
	private JTable table;
	private JTable table_1;

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
	
	public view() {
		initialize();
	}
	
	private void initialize() {
		kundReg = new KundRegister();
		controller = new Controller(kundReg, frame);
		frame = new JFrame();
		frame.setBounds(100, 100, 1141, 866);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 101, 1105, 715);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		panelNyKund = new JPanel();
		panelNyKund.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		layeredPane.add(panelNyKund, "name_720098961090600");
		panelNyKund.setBorder(new MatteBorder(0, 0, 2, 0, (Color) null));
		panelNyKund.setLayout(null);
		
		JLabel lblDancer = new JLabel("");
		lblDancer.setIcon(new ImageIcon(this.getClass().getResource("/unknown.png")));
		lblDancer.setBounds(157, 79, 350, 560);
		panelNyKund.add(lblDancer);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setOpaque(true);
		backgroundLabel.setBackground(new Color(255, 204, 153));
		backgroundLabel.setBounds(10, 11, 508, 693);
		panelNyKund.add(backgroundLabel);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setOpaque(false);
		txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtEmail.setBounds(561, 487, 489, 30);
		panelNyKund.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtNamn = new JTextField();
		txtNamn.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtNamn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNamn.setOpaque(false);
		txtNamn.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtNamn.setBounds(561, 75, 489, 30);
		panelNyKund.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtTele = new JTextField();
		txtTele.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTele.setOpaque(false);
		txtTele.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtTele.setBounds(561, 404, 489, 30);
		panelNyKund.add(txtTele);
		txtTele.setColumns(10);
		
		txtFaktureringsAdress = new JTextField();
		txtFaktureringsAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFaktureringsAdress.setOpaque(false);
		txtFaktureringsAdress.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtFaktureringsAdress.setBounds(561, 321, 489, 30);
		panelNyKund.add(txtFaktureringsAdress);
		txtFaktureringsAdress.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdress.setOpaque(false);
		txtAdress.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtAdress.setBounds(561, 238, 489, 30);
		panelNyKund.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPnr = new JTextField();
		txtPnr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPnr.setOpaque(false);
		txtPnr.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtPnr.setBounds(561, 155, 489, 30);
		panelNyKund.add(txtPnr);
		txtPnr.setColumns(10);
		
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
		lblNamn.setBounds(561, 37, 46, 14);
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
		lblFaktureringsadress.setBounds(561, 279, 173, 23);
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
		

		JLabel lblDansExpertis = new JLabel("Dans Expertis");
		lblDansExpertis.setForeground(Color.DARK_GRAY);
		lblDansExpertis.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDansExpertis.setBounds(561, 554, 198, 23);
		panelNyKund.add(lblDansExpertis);
		
		JButton btnLggTillKund = new JButton("L\u00E4gg till kund");
		btnLggTillKund.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnLggTillKund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				String tmpNamn = txtNamn.getText();
				String tmpPnr = txtPnr.getText();
				String tmpAdress = txtAdress.getText();
				String tmpFaktureringsAdress = txtFaktureringsAdress.getText();
				String tmpTele = txtTele.getText();
				String tmpEmail = txtEmail.getText();
				int tmpDans = slider.getValue();
				String [] kundInfo = {tmpNamn, tmpEmail, tmpPnr, Integer.toString(tmpDans)};
				controller.addKund(tmpPnr, tmpNamn, tmpDans, tmpAdress, tmpFaktureringsAdress, tmpTele, tmpEmail);
				tableModel.addRow(kundInfo);
			}
		});
		btnLggTillKund.setBounds(561, 632, 489, 46);
		panelNyKund.add(btnLggTillKund);
		
		panelEmailUtskick = new JPanel();
		layeredPane.add(panelEmailUtskick, "name_720098969497700");
		panelEmailUtskick.setLayout(null);
		
		JButton btnEmailUtskick = new JButton("Tryck");
		btnEmailUtskick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEmailUtskick.setBounds(909, 623, 186, 81);
		panelEmailUtskick.add(btnEmailUtskick);
		
		txtDans = new JTextField();
		txtDans.setBounds(909, 592, 186, 20);
		panelEmailUtskick.add(txtDans);
		txtDans.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 724, 693);
		panelEmailUtskick.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Namn", "Email"
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(338);
		scrollPane_1.setViewportView(table_1);
		
		panelKundRegister = new JPanel();
		layeredPane.add(panelKundRegister, "name_720098978042300");
		panelKundRegister.setBackground(SystemColor.control);
		panelKundRegister.setLayout(null);
		
		JTextArea kundDetaljArea = new JTextArea();
		kundDetaljArea.setVisible(false);
		kundDetaljArea.setBounds(371, 0, 364, 357);
		panelKundRegister.add(kundDetaljArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(0, 27, 1105, 688);
		panelKundRegister.add(scrollPane);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				kundDetaljArea.setVisible(true);
				kundDetaljArea.setText(Arrays.toString(controller.getKundInfo(table.getValueAt(table.getSelectedRow(), 2).toString()))) ;
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Namn", "Email", "Personnummer", "Dansexpertis"
			}
		) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(118);
		table.getColumnModel().getColumn(1).setPreferredWidth(246);
		table.getColumnModel().getColumn(2).setPreferredWidth(182);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Kundregister");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setIcon(new ImageIcon("/Users/admin/eclipse-workspace/Projekt-ledning/Projekt-ledning/img/RegisterIcon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelKundRegister);
				kundDetaljArea.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 6, 365, 96);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Email-utskick");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setIcon(new ImageIcon("/Users/admin/eclipse-workspace/Projekt-ledning/Projekt-ledning/img/EmailIcon.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelEmailUtskick);
			}
		});
		btnNewButton_1.setBounds(750, 6, 365, 96);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ny Kund");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setIcon(new ImageIcon("/Users/admin/eclipse-workspace/Projekt-ledning/Projekt-ledning/img/NyKundIcon.png"));

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelNyKund);
			}
		});
		btnNewButton_2.setBounds(380, 6, 365, 96);
		frame.getContentPane().add(btnNewButton_2);
	}
}
