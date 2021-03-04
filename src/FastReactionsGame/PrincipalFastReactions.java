package FastReactionsGame;

import java.awt.Event;
import java.awt.EventQueue;

import FastReactionsGame.GUIGridBagLayoutView;

public class PrincipalFastReactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
//				GUICrapsView myWindow = new GUICrapsView();

				GUIGridBagLayoutView myView = new GUIGridBagLayoutView();
			}
		});
	}

}
