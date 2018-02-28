/**
 * @author Anila Achankunju
 * */
package code.logic;

public class Card implements Comparable<Card> {
	private int suit;
	private int value;

	//Integer[] suit = {0,1,2,3}; // 0 = Clubs, 1 = Diamonds, 2 = Hearts , 3 = Spades 
	//Integer[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	//String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
	

	public Card(int csuit, int cvalue) {
		setSuit(csuit);
		setValue(cvalue);
	}

	@Override
	public int compareTo(Card arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(int suit) {
		this.suit = suit;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
	


