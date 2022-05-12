package J_Study;


class Card{
	private static int cardNum = 10001;
	private int userCardNum;
	public Card() {
		userCardNum = cardNum;
		cardNum++;
	}
	
	public int getCardNumber() {
		return userCardNum;
	}
}

public class SingleTon2 {
	
	private static SingleTon2 Instance = new SingleTon2();
	
	private SingleTon2() {};
	
	public static SingleTon2 getInstance() {
		if(Instance == null) {
			Instance = new SingleTon2();
		}
		return Instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
	

	public static void main(String[] args) {
		SingleTon2 company = SingleTon2.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}
}
