/**
 * @author Anila Achankunju
 * */
package code.logic;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;
	private Card[] dealCards;
	public Deck()
	{
		deck = new ArrayList<Card>(52);
		dealCards = new Card[10];
		int index = 0;
		for(int i=0;i<4;i++){
			for(int j=2;j<15;j++){
				Card temp = new Card(i,j);
				deck.add(index,temp);
				deck.add(temp);
				index++;
				 }
			 }
		Collections.shuffle(this.deck);
		
	}

	public Card[] getDealtCards() {

		for(int i=0;i<10;i++)
		{	
			dealCards[i]= deck.get(i);
		}
		return dealCards;
		}	
}

