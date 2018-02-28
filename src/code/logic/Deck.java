/**
 * @author Anila Achankunju
 * */
package code.logic;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private static ArrayList<Card> deck = new ArrayList<Card>();
	String[] suits = {"C","D","H","S"};
	String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
	
	public Deck()
	{

		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				Deck.deck.add(new Card(suits[i],values[j]));
				 }
			 }
		Collections.shuffle(this.deck);
	}
	
	public ArrayList<Card> getDeck()
	{
		return deck;
	}
	
	public static void main(String[] args) {
		
		Deck obj = new Deck();
		System.out.println("Shuffled Deck");
		System.out.println(obj.getDeck());
		System.out.println("Deck size = " +  deck.size());
		System.out.println("Hand 1 = " + deck.subList(1, 5) );
		System.out.println("Hand 2 = " + deck.subList(5, 10) );
	}
}

