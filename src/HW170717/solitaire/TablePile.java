package HW170717.solitaire;

import java.awt.Graphics;

class TablePile extends CardPile {


	private static final int NEXT_CARD_SHIFT = 35;

	private int tappedX;
	private int tappedY;

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
			System.out.println("Empty!");
			return (x <= tx) && (tx <= x + Card.width) && (y > 80) && (y <= 80 + Card.height);
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
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy, selected);
		return localy + NEXT_CARD_SHIFT;
	}

	@Override
	public void display(Graphics g) {
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
	void transfer(Card selectedCard) {
		System.out.println("Transfer started");
		if(Solitare.selectedCard == null) return;
		Card exFirstCard = firstCard;
		int count = count(selectedCard, Solitare.selectedPile.firstCard);
		firstCard = Solitare.selectedPile.firstCard;

		Solitare.selectedPile.firstCard = selectedCard.link;
		Solitare.selectedPile.cardNumber -= count;

		selectedCard.link = exFirstCard;
		cardNumber += count;
		if(Solitare.selectedPile.firstCard != null && !Solitare.selectedPile.firstCard.isFaceUp()) Solitare.selectedPile.flipFirst();
		Solitare.deselect();

	}

	private int count(Card selectedCard, Card firstCardOfSelectedPile) {
		int count = 1;
		Card cursor = firstCardOfSelectedPile;
		while(!selectedCard.equals(cursor)){
			count++;
			cursor = cursor.link;
		}
		System.out.println("Count = "  + count);
		return count;
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
	protected void select(int x, int y) {
		// if face down, then flip
//			Card topCard = top();
//			if (!topCard.isFaceUp()) {
//				topCard.flip();
//				return;
//			}
		System.out.println("Selection started");
		Card currentCard = null;
		if ((y <= this.y + cardNumber * NEXT_CARD_SHIFT + 35 && y > this.y + cardNumber * NEXT_CARD_SHIFT - 35) || firstCard.link == null) {
			currentCard = firstCard;
		}
		else {
			for (int i = this.y + (cardNumber - 1) * 35; i > this.y + 30; i = i - 35) {
				currentCard = firstCard.link;
				System.out.println("Inside cycle");
				if (y <= i && y > i - 35) {
					System.out.println("Inside if");
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


