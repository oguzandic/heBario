/**
 * heBario is a simple Java project. Like an Agario Game clone.

 * 
 * @author Mürsel Oğuz Andıç
 * @date 04.08.2017
 * 
 * 
 * #LYK2017
 * 
 * 
 * In this class, we setting player specs, check object collisions, game rules and game mechanics.
 * 
 * 
 * 
 */
package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;

public class Enemy extends GameObject {
	
	private int speed;
	
	public Enemy(int x, int y, int radius, int speed, Color color) {
		super(x, y, radius, color);
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
