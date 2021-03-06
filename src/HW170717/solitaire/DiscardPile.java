package HW170717.solitaire;



class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void push(Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.push(aCard);
	}

//	@Override
//	public void proceed(int tx, int ty) {
//		if (empty()) {
//			return;
//		}
//
//
//
//		Card topCard = pop();
//		for (int i = 0; i < 4; i++) {
//			if (Solitare.suitPile[i].canTake(topCard)) {
//				Solitare.suitPile[i].push(topCard);
//				return;
//			}
//		}
//		for (int i = 0; i < 7; i++) {
//			if (Solitare.tableau[i].canTake(topCard)) {
//				Solitare.tableau[i].push(topCard);
//				return;
//			}
//		}
//		// nobody can useWithTimeMeasure it, put it back on our list
//		push(topCard);
//	}


	@Override
	public void tapped(int x, int y) {
		if(empty()) return;
		if(Solitare.selectedCard != null) {
			deselect();
		}

		else select(x,y);
	}

	@Override
	protected void select(int x, int y) {
		super.select(x, y);
		Solitare.selectedCard = this.top();
		System.out.println(Solitare.selectedCard);
	}
}