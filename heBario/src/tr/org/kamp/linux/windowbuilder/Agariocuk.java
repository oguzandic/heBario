
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

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Agariocuk extends JFrame {

	private AgariocukPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Agariocuk agariocuk = new Agariocuk();

		agariocuk.pack();
		agariocuk.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Agariocuk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new AgariocukPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("heBario");

		setContentPane(contentPane);

	}

}
