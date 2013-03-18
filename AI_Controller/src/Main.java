import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import enums.Classes;
import enums.Races;

public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Main window = new Main();
					window.frmRpgHelper.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JFrame		frmRpgHelper;
	private JTextField	textField;
	
	private JTextField	textField_1;
	private JTextField	textField_2;
	private JTextField	textField_3;
	private JTextField	textField_4;
	private JTextField	textField_5;
	private JTextField	textField_6;
	private JTextField	textField_7;
	private JTextField	textField_8;
	
	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRpgHelper = new JFrame();
		frmRpgHelper.setTitle("RPG Helper");
		frmRpgHelper.setBounds(100, 100, 796, 615);
		frmRpgHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRpgHelper.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 760, 555);
		frmRpgHelper.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Character", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 138, 0, 33, 40, 26, 0, 29, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Name:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblStr = new JLabel("Str:");
		GridBagConstraints gbc_lblStr = new GridBagConstraints();
		gbc_lblStr.anchor = GridBagConstraints.EAST;
		gbc_lblStr.insets = new Insets(0, 0, 5, 5);
		gbc_lblStr.gridx = 3;
		gbc_lblStr.gridy = 0;
		panel.add(lblStr, gbc_lblStr);
		
		textField_2 = new JTextField();
		textField_2.setText("51");
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 0;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(4);
		
		JLabel lblNewLabel_2 = new JLabel("Class:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Classes.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblDex = new JLabel("Dex:");
		GridBagConstraints gbc_lblDex = new GridBagConstraints();
		gbc_lblDex.anchor = GridBagConstraints.EAST;
		gbc_lblDex.insets = new Insets(0, 0, 5, 5);
		gbc_lblDex.gridx = 3;
		gbc_lblDex.gridy = 1;
		panel.add(lblDex, gbc_lblDex);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.WEST;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 1;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(4);
		
		JLabel lblNewLabel_3 = new JLabel("Race:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Races.values()));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblCon = new JLabel("Con:");
		GridBagConstraints gbc_lblCon = new GridBagConstraints();
		gbc_lblCon.anchor = GridBagConstraints.EAST;
		gbc_lblCon.insets = new Insets(0, 0, 5, 5);
		gbc_lblCon.gridx = 3;
		gbc_lblCon.gridy = 2;
		panel.add(lblCon, gbc_lblCon);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.WEST;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 4;
		gbc_textField_4.gridy = 2;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(4);
		
		JLabel lblNewLabel_1 = new JLabel("Level:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIntl = new JLabel("Int:");
		GridBagConstraints gbc_lblIntl = new GridBagConstraints();
		gbc_lblIntl.anchor = GridBagConstraints.EAST;
		gbc_lblIntl.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntl.gridx = 3;
		gbc_lblIntl.gridy = 3;
		panel.add(lblIntl, gbc_lblIntl);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.anchor = GridBagConstraints.WEST;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 3;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(4);
		
		JLabel lblWis = new JLabel("Wis:");
		GridBagConstraints gbc_lblWis = new GridBagConstraints();
		gbc_lblWis.anchor = GridBagConstraints.EAST;
		gbc_lblWis.insets = new Insets(0, 0, 5, 5);
		gbc_lblWis.gridx = 3;
		gbc_lblWis.gridy = 4;
		panel.add(lblWis, gbc_lblWis);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.anchor = GridBagConstraints.WEST;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 4;
		panel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(4);
		
		JLabel lblCha = new JLabel("Cha:");
		GridBagConstraints gbc_lblCha = new GridBagConstraints();
		gbc_lblCha.anchor = GridBagConstraints.EAST;
		gbc_lblCha.insets = new Insets(0, 0, 5, 5);
		gbc_lblCha.gridx = 3;
		gbc_lblCha.gridy = 5;
		panel.add(lblCha, gbc_lblCha);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.anchor = GridBagConstraints.WEST;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 5;
		panel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(4);
		
		JLabel lblNewLabel_4 = new JLabel("Speed:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 7;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 7;
		panel.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit Character");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridx = 8;
		gbc_btnNewButton.gridy = 18;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
}
