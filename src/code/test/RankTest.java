package code.test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.logic.Card;
import code.logic.HandChecker;

public class RankTest {
	HandChecker hc = new HandChecker();
	public  Card[] StraightFlush;
	public  Card[] FourofaKind;
	public  Card[] FullHouse;
	public  Card[] Flush;
	public  Card[] Straight;
	public  Card[] ThreeofaKind;
	public  Card[] TwoPair;
	public  Card[] OnePair;
	public  Card[] HighCard;
	
	/* The static data entered for each case below is pre sorted.
	 * */
	
	public RankTest() {
		StraightFlush = new Card[] {new Card(0,2),new Card(0,3),new Card(0,4),
				new Card(0,5),new Card(0,6)};
		FourofaKind = new Card[] {new Card(0,2),new Card(1,4),new Card(2,4),
				new Card(0,4),new Card(3,4)};
		FullHouse = new Card[] {new Card(0,11),new Card(1,11),new Card(2,11),
				new Card(0,14),new Card(3,14)};
		Flush = new Card[] {new Card(3,2),new Card(3,4),new Card(3,6),
				new Card(3,10),new Card(3,14)};
		Straight = new Card[] {new Card(0,9),new Card(3,10),new Card(0,11),
				new Card(2,12),new Card(0,13)};
		ThreeofaKind = new Card[] {new Card(0,2),new Card(3,8),new Card(0,11),
				new Card(2,11),new Card(0,11)};
		TwoPair = new Card[] {new Card(0,2),new Card(3,2),new Card(0,11),
				new Card(2,11),new Card(0,14)};
		OnePair = new Card[] {new Card(0,2),new Card(3,8),new Card(0,11),
				new Card(2,14),new Card(0,14)};
		HighCard = new Card[] {new Card(0,2),new Card(3,6),new Card(0,11),
				new Card(2,13),new Card(0,14)};
		
	}
	@Test
	public void testStraightFlush() {
		assertEquals(true, hc.getRanking(StraightFlush)>8.0); 
	}
	
	@Test
	public void testFourOfAKind() {
		assertEquals(true,  hc.getRanking(FourofaKind)>7.0 && hc.getRanking(FourofaKind)<8.0); 
	}
	
	@Test
	public void testFullHouse() {
		assertEquals(true, hc.getRanking(FullHouse)>6.0 && hc.getRanking(FullHouse)<7.0); 
	}
	
	@Test
	public void testFlush() {
		assertEquals(true, hc.getRanking(Flush)>5.0 && hc.getRanking(Flush)<6.0); 
	}

	@Test
	public void testStraight() {
		assertEquals(true, hc.getRanking(Straight)>4.0 && hc.getRanking(Straight)<5.0); 
	}

	@Test
	public void testThreeOfAKind() {
		assertEquals(true, hc.getRanking(ThreeofaKind)>3.0 && hc.getRanking(ThreeofaKind)<4.0); 
	}
	
	@Test
	public void testTwoPair() {
		assertEquals(true, hc.getRanking(TwoPair)>2.0 && hc.getRanking(TwoPair)<3.0); 
	}

	@Test
	public void testOnePair() {
		assertEquals(true, hc.getRanking(OnePair)>1.0 && hc.getRanking(OnePair)<2.0); 
	}
	
	@Test
	public void testHighCard() {
		assertEquals(true, hc.getRanking(HighCard)>0.0 && hc.getRanking(HighCard)<1.0); 
	}
}
