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
package tr.org.kamp.linux.agarioclone;

import java.awt.Color;

import tr.org.kamp.linux.agarioclone.logic.GameLogic;
import tr.org.kamp.linux.windowbuilder.Difficulty;

public class AgarioCloneApp {

	public static void main(String[] args) {
		GameLogic gameLogic = new GameLogic("heB", Color.BLUE, Difficulty.EASY);
		gameLogic.startApplication();
	}
	
}
