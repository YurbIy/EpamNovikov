package HW170717.solitaire;

import java.awt.Graphics;

class TablePile extends CardPile {


	private static final int NEXT_CARD_SHIFT = 35;

	boolean drawRed = false;

	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitare.deckPile.pop());
		}

		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			if(aCard.getRank() == 12) System.out.println("empty but can take");
			return aCard.getRank() == 12;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor())
				&& (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		// don't test bottom of card
		if(empty()) {
//			System.out.println("Empty!");
//			System.out.println("x: " + ((x <= tx) && (tx <= x + Card.width)));
//			System.out.println("y: " + "(" + 80 + ";" + (80 + Card.height) + ")" + ((y > 80) && (y <= 80 + Card.height)));
//			System.out.println("Total: " + ((x <= tx) && (tx <= x + Card.width) && (ty > 80) && (y <= 80 + Card.height)));
			return (x <= tx) && (tx <= x + Card.width) && (ty > y) && (ty <= y + Card.height);
		}

		return (tx >= x) && (tx <= x + Card.width) && (ty >= y) && (ty <= y + Card.height + (cardNumber - 1) * NEXT_CARD_SHIFT);
	}

	@Override
	public void proceed(int tx, int ty) {
		if(canTake(Solitare.selectedCard)){
			transfer(Solitare.selectedCard);
		}
		Solitare.deselect();
	}

	private int stackDisplay(Graphics g, Card aCard) {
		if (aCard == null) {
			return y;
		}


		int localy;
		localy = stackDisplay(g, aCard.link);
		if(aCard.equals(Solitare.selectedCard)){
			drawRed = true;
		}

		aCard.draw(g, x, localy, drawRed);
		return localy + NEXT_CARD_SHIFT;
	}

	@Override
	public void display(Graphics g) {
		drawRed = false;
		stackDisplay(g, top());
	}

	@Override
	public Card pop() {
		cardNumber--;
		Card poped = super.pop();
		if(firstCard != null) flipFirst();
		return poped;
	}

	@Override
	public void push(Card aCard) {
		super.push(aCard);
	}

	@Override
	public void tapped(int x, int y) {
		System.out.println("tapped");
		if(Solitare.selectedCard != null && Solitare.selectedPile == this/*this.contains(Solitare.selectedCard)*/) {
			deselect();
		}
		else if(Solitare.selectedCard != null){
			proceed(x, y);

		}

		else select(x,y);
	}

	@Override
	protected void select(int tx, int ty) {

		System.out.println("Selection started");
		Card currentCard = null;
		if ((ty <= y + cardNumber * NEXT_CARD_SHIFT + 35 && ty > y + cardNumber * NEXT_CARD_SHIFT - 35) || firstCard.link == null) {
			System.out.println("first card selected");
			currentCard = firstCard;
		}
		else {
			currentCard = firstCard;
			for (int i = y + (cardNumber - 1) * 35; i > y + 30; i = i - 35) {
				currentCard = currentCard.link;
				System.out.println("Inside cycle");
				if (ty <= i && ty > i - 35) {
					System.out.println(currentCard + " selected");
					break;
				}
			}
		}
		if(currentCard == null || !currentCard.isFaceUp()) return;

		Solitare.deselect();
		Solitare.selectedCard = currentCard;
		Solitare.selected = selected = true;
		Solitare.selectedPile = this;
		System.out.println("Selected card: " + Solitare.selectedCard);
		System.out.println("Current card " + Solitare.selectedCard);

//		tappedX = x;
//		tappedY = y;
	}
}


