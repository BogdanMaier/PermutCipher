package app;

import gui.Gui;
import ctrl.Controller;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Controller ctrl = new Controller();
		Gui gui = new Gui(ctrl);

	}

}
