package com.almanac.HarvestRL;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

import com.almanac.HarvestRL.Screens.Screen;
import com.almanac.HarvestRL.Screens.StartScreen;

public class HarvestRL extends JFrame implements KeyListener {
	
	private AsciiPanel terminal;
	private Screen screen;
	
	public HarvestRL() {
		super();
		terminal = new AsciiPanel();
		add(terminal);
		pack();
		screen = new StartScreen();
		addKeyListener(this);
		repaint();
	}

	
	
	public static void main(String[] args) {
		HarvestRL game = new HarvestRL();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);		
	}


	public void repaint() {
		terminal.clear();
		screen.displayOutput(terminal);
		super.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		screen = screen.respondToUserInput(e);
		repaint();
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
