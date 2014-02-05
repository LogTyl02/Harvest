package com.almanac.HarvestRL.Screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PlayScreen implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		terminal.write("You are harvesting turnips! It is fun.", 1, 1);
		terminal.writeCenter(" -- Press [Escape] to Leave or [Enter] to Harvest -- ", 22);
		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_ESCAPE: return new LoseScreen();
		case KeyEvent.VK_ENTER: return new WinScreen();
		}
		
		return this;
	}

}
