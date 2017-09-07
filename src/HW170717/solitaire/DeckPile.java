package HW170717.solitaire;

class DeckPile extends CardPile {

	DeckPile(final int x, final int y) {
		// first initialize parent
		super(x, y);
		// then create the new deck
		// first put them into a local pile
		final CardPile pileOne = new CardPile(0, 0);
		final CardPile pileTwo = new CardPile(0, 0);
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 12; j++) {
				pileOne.push(new Card(i, j));
				count++;
			}
		}
		// then pull them out randomly
		for (; count > 0; count--) {
			final int limit = ((int) (Math.random() * 1000)) % count;
			// move down to a random location
			for (int i = 0; i < limit; i++) {
				pileTwo.push(pileOne.pop());
			}
			// then push the card found there
			push(pileOne.pop());
			// then put the decks back together
			while (!pileTwo.empty()) {
				pileOne.push(pileTwo.pop());
			}
		}
	}

	@Override
	public void proceed(final int tx, final int ty) {
		if (empty()) {
			while(!(Solitare.discardPile.empty())) {
				push(Solitare.discardPile.pop());
				flipFirst();//If deckPile is empty it takes all cards from discardPile
			}
			return;
		}
		Solitare.discardPile.push(this.pop());
	}

	@Override
	public void tapped(int x, int y) {
		if(Solitare.selectedCard != null){
			Solitare.deselect();
		}
		proceed(x,y);
	}
}