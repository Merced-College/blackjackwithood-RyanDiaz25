public class Card {
        
        String cardSuit;
		String cardName;
		int cardValue;
		String cardPicture;

		public Card() { // default constuctor
			this.cardSuit = "Unknown";
			this.cardName = "Unknown";
			this.cardValue = 0;
			this.cardPicture = "Unknown.png"; 
		}
	
		 public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
			this.cardSuit = cardSuit;
			this.cardName = cardName;
			this.cardValue = cardValue;
			this.cardPicture = cardPicture;
		}

		public String getCardSuit() {
			return cardSuit;
		}
	
		public String getCardName() {
			return cardName;
		}
	
		public int getCardValue() {
			return cardValue;
		}
	
		public String getCardPicture() {
			return cardPicture;
		}
	
		public void setCardSuit(String cardSuit) {
			this.cardSuit = cardSuit;
		}
	
		public void setCardName(String cardName) {
			this.cardName = cardName;
		}
	
		public void setCardValue(int cardValue) {
			this.cardValue = cardValue;
		}
	
		public void setCardPicture(String cardPicture) {
			this.cardPicture = cardPicture;
		}

		@Override
		public String toString() {
			return this.cardSuit + " " + this.cardName + " " + this.cardValue + " " + this.cardPicture;
		}
}
