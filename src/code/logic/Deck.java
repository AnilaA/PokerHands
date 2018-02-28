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
				//System.out.println(temp.getSuit()+""+temp.getValue());
				deck.add(index,temp);
				index++;
				 }
			 }
		Collections.shuffle(this.deck);
		
	}
	
	public void dealCards()
	{
		for(int i=0;i<10;i++)
		{	
			dealCards[i]= deck.get(i);
			System.out.println(dealCards[i].getSuit()+""+dealCards[i].getValue());
		}
	}	
		

	public static void main(String[] args) {
		
		Deck obj = new Deck();
		obj.dealCards();
		/*
		System.out.println("Shuffled Deck");
		System.out.println(obj.getDeck());
		System.out.println("Deck size = " +  deck.size());
		System.out.println("Hand 1 = " + deck.subList(0, 5) );
		System.out.println("Hand 2 = " + deck.subList(5, 10) );
		System.out.println(deck.get(0));
		*/
	}	
}

