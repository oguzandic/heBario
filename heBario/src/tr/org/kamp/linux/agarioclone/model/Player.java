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

package tr.org.kamp.linux.agarioclone.model;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Player extends GameObject {
	
	
	// speed; player speed (piksel)
	// image; player icon image from local files
	// name; player name top of icon
	
	private int speed;
	private BufferedImage image;
	private String playerName;
	
	public Player(int x, int y, int radius, int speed, Color color, String playerName) {
		super(x, y, radius, color);
		this.speed = speed;
		this.playerName = playerName;
		try {
			image = ImageIO.read(getClass().getResource("/heb.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// Here a limit for player object
	@Override
	public void setRadius(int radius) {
		super.setRadius(radius);
		if(getRadius() < 5 ) {
			setRadius(5);
		}
		else if(getRadius() > 250) {
			setRadius(250);
		}
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		
	super.draw(g2d);
		FontMetrics fontMetrics = g2d.getFontMetrics(g2d.getFont());
		int witdh = fontMetrics.stringWidth(playerName);
		int nameX = getX() + (getRadius() - witdh)/2;
		int nameY = getY() - fontMetrics.getHeight();
		g2d.drawString(playerName, nameX, nameY);
		g2d.drawImage(image, getX(), getY(), getRadius(), getRadius(), null);
	}

}
