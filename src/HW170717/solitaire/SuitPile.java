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
	public void select(int x, int y) {
		if(empty()){

		}
		else{

		}
	}
}