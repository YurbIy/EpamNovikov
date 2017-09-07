package HW170717.solitaire;

import java.applet.Applet;
import java.awt.*;
import java.util.Arrays;


public class Solitare extends Applet {
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	private static CardPile allPiles[];
	static boolean selected;
	static Card selectedCard;
	static CardPile selectedPile;



	private long lastTapTime = System.currentTimeMillis();



	@Override
	public void init() {
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		System.out.println(x + " " + y);
//		long justTapedTime = System.currentTimeMillis();
//		boolean doubleTapped = justTapedTime - lastTapTime < 300;
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				System.out.println("Incuded " + allPiles[i].firstCard);
				System.out.println("CardNumber: " + allPiles[i].cardNumber);
				allPiles[i].tapped(x, y);

				repaint();
				return true;

			}
		}
			deselect();
			lastTapTime = System.currentTimeMillis();
			repaint();
			return true;

	}

	static void deselect(){
		for(CardPile pile : allPiles){
			pile.selected = false;
		}
		selected = false;
		selectedCard = null;
		selectedPile = null;
	}


}
