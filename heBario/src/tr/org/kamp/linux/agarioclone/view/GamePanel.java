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

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import tr.org.kamp.linux.agarioclone.model.GameObject;

public class GamePanel extends JPanel{

	private ArrayList<GameObject> gameObjects;
	
	public GamePanel(ArrayList<GameObject> gameObjects) {
		this.gameObjects = gameObjects;
		setBackground(Color.BLACK);
	}
	
	@Override
	protected synchronized void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		for (GameObject gameObject : gameObjects) {
			gameObject.draw(g2d);
		}
	}
}
