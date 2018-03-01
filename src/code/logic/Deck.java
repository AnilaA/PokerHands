/**
 * @author Anila Achankunju
 * */
package code.logic;
/*Class to create and shuffle the deck*/
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck;
	private Card[] dealCards;
	public Deck()
	{
		deck = new ArrayList<Card>(52);
		dealCards = new Card[10];
		for(int i=0;i<4;i++){
			for(int j=2;j<15;j++){
				Card temp = new Card(i,j);
				deck.add(temp);
				 }
			 }
		Collections.shuffle(this.deck);
		
	}

	public Card[] getDealtCards() {

		for(int j=0,i=15;i<25;i++,j++)
		{	
			dealCards[j]= deck.get(i);
		}
		return dealCards;
		}	
}

