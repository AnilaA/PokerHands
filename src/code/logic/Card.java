/**
 * @author Anila Achankunju
 * */
package code.logic;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	private String suit;
	private String value;
	

	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	public  String getSuit() {
		return suit;
	}

	public  String getValue() {
		return value;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString()
	{
		return suit+value;
	}
	
}
	


