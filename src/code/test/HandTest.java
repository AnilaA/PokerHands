package code.test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.logic.Card;
import code.logic.DealtHands;

public class HandTest {
	
	@Test
	public void testHandsInTwoGames() {
		DealtHands dh1 = new DealtHands();
		DealtHands dh2 = new DealtHands();
		assertEquals(false, dh1.equals(dh2)); //two different set of hands on two executions
	}
	
	@Test
	public void testHandsInOneGame() {
		DealtHands dh1 = new DealtHands();
		DealtHands dh2 = new DealtHands();
		Card[] h1 = dh1.getHand1();
		Card[] h2 = dh2.getHand2();
		
		assertEquals(false, h1.equals(h2)); //two players do not get same cards in one game
	}

}
