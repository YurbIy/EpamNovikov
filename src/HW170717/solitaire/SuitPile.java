package HW170717.solitaire;

class SuitPile extends CardPile {

	SuitPile(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.getRank() == 0;
		}
		Card topCard = top();
		return (aCard.getSuit() == topCard.getSuit())
				&& (aCard.getRank() == 1 + topCard.getRank());
	}

	@Override
	public void tapped(int x, int y) {
		if(Solitare.selectedCard != null){
			proceed(x,y);
		}
	}

	@Override
	public void proceed(int x, int y) {
		if(canTake(Solitare.selectedCard) /*&& (Solitare.selectedCard.link == null)*/){
			this.transfer(Solitare.selectedCard);
			ifWon();
			System.out.println(Solitare.selectedCard); // FIXME technical message
			Solitare.deselect();

		}
	}

	private void ifWon() {
		for (SuitPile pile: Solitare.suitPile) {
			if(pile.top() != null && pile.top().getRank() != 12){
				return;
			}

		}
		Solitare.won = true;
	}
}