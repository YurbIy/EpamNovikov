package HW170717.solitaire;

import java.awt.Color;
import java.awt.Graphics;

class CardPile {

	// coordinates of the card pile
	protected int x;
	protected int y;
	protected Card firstCard;
	boolean selected = false;

	int cardNumber;


	CardPile(final int xCoord, final int yCoord) {
		x = xCoord;
		y = yCoord;
		firstCard = null;
		cardNumber = 0;
	}

	// access to cards are not overridden

	public Card top() {
		return firstCard;
	}

	public boolean empty() {
		return firstCard == null;
	}

	public void push(final Card aCard) {
		aCard.link = firstCard;
		firstCard = aCard;
		cardNumber++;
	}
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
	private static int count(Card selectedCard, Card firstCardOfSelectedPile) {
		int count = 1;
		Card cursor = firstCardOfSelectedPile;
		while(!selectedCard.equals(cursor)){
			count++;
			cursor = cursor.link;
		}
		System.out.println("Count = "  + count);
		return count;
	}

	public Card pop() {
		Card result = null;
		if (firstCard != null) {
			result = firstCard;
			firstCard = firstCard.link;
		}
		cardNumber--;
		return result;
	}
	public void remove(){
		firstCard = firstCard.link;
	}

	// the following are sometimes overridden

	public boolean includes(final int clickX, final int clickY) {
		return x <= clickX && clickX <= x + Card.width && y <= clickY
				&& clickY <= y + Card.height;
	}

	public void proceed(final int tx, final int ty) {
		// for extention
	}


	public void display(final Graphics g) {
		g.setColor(Color.black);
		if (firstCard == null) {
			g.drawRect(x, y, Card.width, Card.height);
		}
		else {
			firstCard.draw(g, x, y, selected);
		}


	}

	public boolean canTake(final Card aCard) {
		return false;
	}

	public void flipFirst(){
		firstCard.flip();
	}

	public Card tos() {

		return firstCard;
	}


	public void tapped(int x, int y) {

		if(Solitare.selectedCard != null && this.contains(Solitare.selectedCard)) {
			deselect();
		}
		else if(Solitare.selectedCard != null){
				proceed(x, y);

		}

		else select(x,y);
	}

	protected void select(int x, int y) {
		Solitare.deselect();
		Solitare.selected = selected = true;
		Solitare.selectedPile = this;


	}

	protected void deselect() {
		Solitare.selected = selected = false;
		Solitare.selectedPile = null;
		Solitare.selectedCard = null;
	}
	boolean contains(Card card){
		if(empty()) return false;
		Card currentCard = firstCard;
		while(currentCard != null){
			if(firstCard.equals(card)){
				return true;
			}
		}
		return false;
	}
}