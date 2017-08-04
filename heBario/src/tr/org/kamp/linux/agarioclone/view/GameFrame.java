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
package tr.org.kamp.linux.agarioclone.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public GameFrame() {
		setTitle("Agario Clone");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 768);
		setLocationRelativeTo(null);
	}

}
