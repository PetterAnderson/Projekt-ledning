package view;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.EventQueue;
import controller.Controller;
import modell.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
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
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.SwingConstants;

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
	private JLabel clipBoardLabel;
	private JComboBox<Integer> comboBox = new JComboBox<Integer>();
	private JTextField txtAllergi;
	private JLabel errorLabel;
	
	//Sound
	private File Error = new File("sounds/Error.wav");
	private File Salsa = new File("sounds/Salsa.wav");
	private File LaggTill = new File("sounds/LaggTill.wav");

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
	

	
	
	static void playSound(File Sound)

	{
	
		try {
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
			
		}catch(Exception e)
		{
		
		}
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
		lblDancer.setIcon(new ImageIcon("img/unknown.png"));
		lblDancer.setBounds(157, 79, 350, 560);
		panelNyKund.add(lblDancer);
		
		JButton btnSalsa = new JButton("La Salsa!");
		btnSalsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playSound(Salsa);
			}
		});
		btnSalsa.setOpaque(true);
		btnSalsa.setBackground(new Color(255, 222, 173));
		btnSalsa.setToolTipText("Gör det inte!");
		btnSalsa.setForeground(new Color(0, 0, 0));
		btnSalsa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalsa.setIcon(new ImageIcon("img/maracas.png"));
		btnSalsa.setFont(new Font("Herculanum", Font.PLAIN, 35));
		btnSalsa.setBounds(10, 11, 508, 73);
		panelNyKund.add(btnSalsa);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setOpaque(true);
		backgroundLabel.setBackground(new Color(255, 204, 153));
		backgroundLabel.setBounds(10, 11, 508, 693);
		panelNyKund.add(backgroundLabel);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setOpaque(false);
		txtEmail.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtEmail.setBounds(561, 438, 489, 30);
		panelNyKund.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtNamn = new JTextField();
		txtNamn.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtNamn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNamn.setOpaque(false);
		txtNamn.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtNamn.setBounds(561, 54, 489, 30);
		panelNyKund.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtTele = new JTextField();
		txtTele.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTele.setOpaque(false);
		txtTele.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtTele.setBounds(561, 363, 489, 30);
		panelNyKund.add(txtTele);
		txtTele.setColumns(10);
		
		txtFaktureringsAdress = new JTextField();
		txtFaktureringsAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFaktureringsAdress.setOpaque(false);
		txtFaktureringsAdress.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtFaktureringsAdress.setBounds(561, 288, 489, 30);
		panelNyKund.add(txtFaktureringsAdress);
		txtFaktureringsAdress.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAdress.setOpaque(false);
		txtAdress.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtAdress.setBounds(561, 213, 489, 30);
		panelNyKund.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPnr = new JTextField();
		txtPnr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPnr.setOpaque(false);
		txtPnr.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtPnr.setBounds(561, 138, 489, 30);
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
		slider.setBounds(561, 581, 489, 40);
		panelNyKund.add(slider);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setForeground(Color.DARK_GRAY);
		lblNamn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNamn.setBounds(561, 20, 54, 23);
		panelNyKund.add(lblNamn);
		
		JLabel lblPnr = new JLabel("Personnummer");
		lblPnr.setForeground(Color.DARK_GRAY);
		lblPnr.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPnr.setBounds(561, 97, 121, 23);
		panelNyKund.add(lblPnr);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setForeground(Color.DARK_GRAY);
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAdress.setBounds(561, 179, 93, 23);
		panelNyKund.add(lblAdress);
		
		JLabel lblFaktureringsadress = new JLabel("Faktureringsadress");
		lblFaktureringsadress.setForeground(Color.DARK_GRAY);
		lblFaktureringsadress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFaktureringsadress.setBounds(561, 254, 173, 23);
		panelNyKund.add(lblFaktureringsadress);
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		lblTelefonnummer.setForeground(Color.DARK_GRAY);
		lblTelefonnummer.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTelefonnummer.setBounds(561, 329, 144, 23);
		panelNyKund.add(lblTelefonnummer);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(561, 404, 93, 23);
		panelNyKund.add(lblEmail);
		

		JLabel lblDansExpertis = new JLabel("Dans Expertis");
		lblDansExpertis.setForeground(Color.DARK_GRAY);
		lblDansExpertis.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDansExpertis.setBounds(561, 554, 198, 23);
		panelNyKund.add(lblDansExpertis);
		
		JButton btnLggTillKund = new JButton("L\u00E4gg till kund");
		btnLggTillKund.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
				String tmpAllergi = txtAllergi.getText();
				int tmpDans = slider.getValue();
				String [] kundInfo = {tmpNamn, tmpEmail, tmpPnr, Integer.toString(tmpDans)};
				controller.addKund(tmpPnr, tmpNamn, tmpDans, tmpAllergi, tmpAdress, tmpFaktureringsAdress, tmpTele, tmpEmail);
				if(!tmpPnr.isEmpty()) {
					controller.addKund(tmpPnr, tmpNamn, tmpDans, tmpAllergi, tmpAdress, tmpFaktureringsAdress, tmpTele, tmpEmail);
					tableModel.addRow(kundInfo);
					errorLabel.setVisible(false);
					playSound(LaggTill);
				}
				else {
					errorLabel.setVisible(true);
				}
				
				
			}
		});
		btnLggTillKund.setBounds(561, 632, 489, 46);
		panelNyKund.add(btnLggTillKund);
		
		txtAllergi = new JTextField();
		txtAllergi.setOpaque(false);
		txtAllergi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAllergi.setColumns(10);
		txtAllergi.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 204, 153)));
		txtAllergi.setBounds(561, 513, 485, 30);
		panelNyKund.add(txtAllergi);
		
		JLabel lblAllergi = new JLabel("Allergi");
		lblAllergi.setForeground(Color.DARK_GRAY);
		lblAllergi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAllergi.setBounds(561, 479, 78, 23);
		panelNyKund.add(lblAllergi);
		
		errorLabel = new JLabel("Du gl\u00F6mde sl\u00E5 in ett personnummer!");
		errorLabel.setVisible(false);
		errorLabel.setForeground(Color.DARK_GRAY);
		errorLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		errorLabel.setBounds(648, 681, 281, 23);
		panelNyKund.add(errorLabel);
		
		panelEmailUtskick = new JPanel();
		panelEmailUtskick.setVisible(false);
		layeredPane.add(panelEmailUtskick, "name_720098969497700");
		panelEmailUtskick.setLayout(null);
		
		JButton btnEmailUtskick = new JButton("Tryck");
		btnEmailUtskick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();
				tableModel.setRowCount(0);
				String emailClip = "";
				ArrayList <Kund> kund = controller.sortByDansExpertis(Integer.parseInt(comboBox.getSelectedItem().toString()));
				for(int i = 0; i < kund.size(); i++) {
					String [] row = {kund.get(i).getNamn(),kund.get(i).getEmail()};
					tableModel.addRow(row);
					emailClip +=  tableModel.getValueAt(i, 1) + " ";
				}
				
				if(kund.size() != 0) {
				StringSelection stringSelection = new StringSelection (emailClip);
				Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
				clpbrd.setContents (stringSelection, null);
		
				clipBoardLabel.setVisible(true);
				}
			}
		});
		
		clipBoardLabel = new JLabel("Emails copied to clipboard!");
		clipBoardLabel.setBounds(742, 222, 229, 87);
		panelEmailUtskick.add(clipBoardLabel);
		clipBoardLabel.setVisible(false);
		
		btnEmailUtskick.setBounds(742, 111, 186, 81);
		panelEmailUtskick.add(btnEmailUtskick);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 722, 693);
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
		
		comboBox.setBounds(742, 42, 180, 22);
		comboBox.addItem(1);
		comboBox.addItem(2);
		comboBox.addItem(3);
		panelEmailUtskick.add(comboBox);
		
		JLabel lblDansexpertis = new JLabel("Dansexpertis");
		lblDansexpertis.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDansexpertis.setBounds(742, 18, 108, 22);
		panelEmailUtskick.add(lblDansexpertis);
		panelKundRegister = new JPanel();
		layeredPane.add(panelKundRegister, "name_720098978042300");
		panelKundRegister.setBackground(SystemColor.window);
		panelKundRegister.setLayout(null);
		
//		JTextArea kundDetaljArea = new JTextArea();
//		kundDetaljArea.setVisible(false);
//		kundDetaljArea.setBounds(371, 0, 364, 357);
//		panelKundRegister.add(kundDetaljArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(0, 27, 1105, 602);
		panelKundRegister.add(scrollPane);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
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
		
		JButton btnDelete = new JButton("Ta bort markerad rad");
		btnDelete.setIcon(new ImageIcon("img/delete.png"));
		btnDelete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int i = table.getSelectedRow();
				
				if (i>=0) {
					
					String pnbr = (String) model.getValueAt(i, 2).toString();
					controller.removeKund(pnbr);
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,model.getValueAt(i, 0) + " är nu borttagen ut systemet.");
					
				}
				else {
					playSound(Error);
					//JOptionPane.showMessageDialog(null,"Du måste välja en rad att radera");
				}
			}
		});
		btnDelete.setBounds(0, 637, 204, 49);
		panelKundRegister.add(btnDelete);
		
		JButton buttonInfo = new JButton("Mer info p\u00E5 markerad rad");
		buttonInfo.setActionCommand("");
		buttonInfo.setBounds(214, 637, 204, 49);
		buttonInfo.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
			
			int i = table.getSelectedRow();
			
			if (i>=0 ) {
//				kundDetaljArea.setVisible(true);
				String [] allInfo = controller.getKundInfo(table.getValueAt(i, 2).toString());
				String kundInfo = "Namn: " + allInfo[0] + "\nPnr: " + allInfo[1] + "\nBostadsadress: " + allInfo[2] + "\nFaktureringsadress: " + allInfo[3] + "\nEmail: " + allInfo[4] 
				+ "\nAllergi: " + allInfo[5] + "\nTelefonnummer: " + allInfo[6] + "\nDansexpertis " + allInfo[7];
//				kundDetaljArea.setText(kundInfo);
				JOptionPane.showMessageDialog(null, kundInfo, table.getValueAt(i, 0).toString(), JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				//kundDetaljArea.setVisible(false);
				playSound(Error);
			}
		
			
		}});
		panelKundRegister.add(buttonInfo);
		
		JButton btnNewButton = new JButton("Kundregister");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setIcon(new ImageIcon("img/RegisterIcon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelKundRegister);
//				kundDetaljArea.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 6, 365, 96);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Email-utskick");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_1.setIcon(new ImageIcon("img/EmailIcon.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelEmailUtskick);
			}
		});
		btnNewButton_1.setBounds(750, 6, 365, 96);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ny Kund");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setIcon(new ImageIcon("img/NyKundIcon.png"));

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanels(panelNyKund);
			}
		});
		btnNewButton_2.setBounds(380, 6, 365, 96);
		frame.getContentPane().add(btnNewButton_2);
	}
}
