/**
 * heBario is a simple Java project. Written for Haktan Enes Biçer.
 * 
 * @author Mürsel Oğuz Andıç
 * @date 04.08.2017
 * 
 * 
 * #LYK2017
 * 
 * 
 * 
 * 
 */
package tr.org.kamp.linux.windowbuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import tr.org.kamp.linux.agarioclone.logic.GameLogic;

public class AgariocukPanel extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private ButtonGroup buttonGroup;

	/**
	 * Create the panel.
	 */
	public AgariocukPanel() {
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setLayout(new MigLayout("", "[][][][grow]", "[][][][][][][][][][][][][][][][]"));

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Ubuntu", Font.BOLD, 15));
		lblUsername.setForeground(Color.WHITE);
		add(lblUsername, "flowy,cell 2 2,alignx trailing");

		textField = new JTextField();
		add(textField, "cell 3 2,alignx leading");
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Ubuntu", Font.BOLD, 15));
		lblPassword.setForeground(Color.WHITE);
		add(lblPassword, "cell 2 4,alignx trailing");

		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		add(passwordField, "cell 3 4,alignx left");

		JLabel lblSelectColor = new JLabel("Select Color:");
		lblSelectColor.setFont(new Font("Ubuntu", Font.BOLD, 15));
		lblSelectColor.setForeground(Color.WHITE);
		add(lblSelectColor, "cell 2 6,alignx trailing");

		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Red");
		comboBox.addItem("Gray");
		comboBox.addItem("Green");
		comboBox.addItem("Cyan");

		add(comboBox, "cell 3 6,alignx leading");

		JLabel lblNewLabel = new JLabel("Difficulty:");
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		add(lblNewLabel, "cell 2 8,alignx right");

		JRadioButton rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setFont(new Font("Ubuntu", Font.BOLD, 15));
		rdbtnEasy.setForeground(Color.WHITE);
		rdbtnEasy.setBackground(Color.BLACK);
		add(rdbtnEasy, "cell 3 8");

		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setFont(new Font("Ubuntu", Font.BOLD, 15));
		rdbtnNormal.setForeground(Color.WHITE);
		rdbtnNormal.setBackground(Color.BLACK);
		add(rdbtnNormal, "cell 3 9");

		JRadioButton rdbtnHard = new JRadioButton("Hard");
		rdbtnHard.setFont(new Font("Ubuntu", Font.BOLD, 15));
		rdbtnHard.setForeground(Color.WHITE);
		rdbtnHard.setBackground(Color.BLACK);
		add(rdbtnHard, "cell 3 10");

		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnEasy);
		rdbtnEasy.setSelected(true);
		buttonGroup.add(rdbtnHard);
		buttonGroup.add(rdbtnHard);

		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = Color.BLUE;
				switch (comboBox.getSelectedItem().toString()) {
				case "Red":
					selectedColor = Color.RED;
					break;
				case "Gray":
					selectedColor = Color.GRAY;
					break;
				case "Green":
					selectedColor = Color.GREEN;
					break;
				case "Cyan":
					selectedColor = Color.CYAN;
					break;

				default:
					break;
				}

				Difficulty difficulty = Difficulty.EASY;

				if (rdbtnEasy.isSelected()) {

					difficulty = Difficulty.EASY;
				} else if (rdbtnNormal.isSelected()) {

					difficulty = Difficulty.NORMAL;

				} else if (rdbtnHard.isSelected()) {

					difficulty = Difficulty.HARD;

				}

				GameLogic gamelogic = new GameLogic(textField.getText(), selectedColor, difficulty);
				gamelogic.startApplication();

			}
		});
		add(btnStart, "cell 3 12");

		JButton btnAbout = new JButton("About");
		
		btnAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showConfirmDialog(AgariocukPanel.this, "Bu oyun, çok sevgili Haktan Enes Biçer adına\n" 
				+ "Muhammet Furkan Kanber\n"+ "ve\n" + "Mürsel Oğuz Andıç\n" + "tarafından 2017 yılında yapılmıştır.");
				
			}
		});
		
		
		add(btnAbout, "cell 3 13");

	}

}
