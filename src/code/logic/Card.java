/**
 * @author Anila Achankunju
 * */
package code.logic;
/* Class to create a playing card*/
public class Card{
	private Integer suit;
	private Integer value;

	public Card(Integer csuit, Integer cvalue) {
		setSuit(csuit);
		setValue(cvalue);
	}

	public void setSuit(Integer suit) {
		this.suit = suit;
	}

	/**
	 * @return the suit
	 */
	public Integer getSuit() {
		return suit;
	}


	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public String cardToString()
	{
		String card;
		String[] valueString = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
		String[] suitString = {"C","D","H","S"};
		card = suitString[suit] + valueString[value-2];
		return card;
	}
	
	
}
	


