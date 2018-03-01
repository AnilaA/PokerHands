/**
 * @author Anila Achankunju
 * */

package code.test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.logic.Card;
import code.logic.Deck;
public class DeckTest {

	@Test
	public void testDecksNotSame() {
		Deck deck1 = new Deck();
		Deck deck2 = new Deck();
		
		assertEquals(false, deck1.equals(deck2)); //two shuffled decks
	}
	
}
