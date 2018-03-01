/**
 * @author Anila Achankunju
 */
package code.logic;

public class HandChecker {
	/* To compare two hands calculate their ranks based on the priority of hands.
	 * Each rank is calculated from 8 to 0 in descending order 
	 * Add the constant with product of card value with 0.01 so that the decimal part gives ranks of the hands.  
	 * These decimal values and also rank values can be used to compare the hands and find the winner in WinningHands class. 
	*/
	
	private  Card[] hand;
	private double calc_rank;	
	public HandChecker(){
		hand = new Card[5];
	}
	
	public double getRanking(Card[] h){
		double ranking = 0;
		hand = h;
		if(aStraightFlush()>8.0){
			ranking = aStraightFlush();}
		else if(aFourOfAKind()>7.0){
			ranking = aFourOfAKind();}
		else if(aFullHouse()>6.0){
			ranking = aFullHouse();}
		else if(aFlush()>5.0){
			ranking = aFlush();}
		else if(aStraight()>4.0){
			ranking = aStraight();}
		else if(aThreeOfAKind()>3.0){
			ranking = aThreeOfAKind();}
		else if(aTwoPair()>2.0){
			ranking = aTwoPair();}
		else if(aPair()>1.0){
			ranking = aPair();}
		else{
			ranking = aHighCard();
		}
		return ranking;
	}
	
	/* Check if a High Card
	 * last card in the hand is the high card because hand is already sorted in ascending order. 
	*/
	private double aHighCard() {
		calc_rank = 0.0;
		calc_rank = hand[4].getValue()*0.01;
		return calc_rank;
	}
	
	/* Check if a One Pair
	 * compare elements i and i+1 in the hand. 
	*/
	private double aPair() {
		calc_rank = 0.0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getValue()==hand[i+1].getValue())
			{
				calc_rank = 1.0 + (hand[i].getValue()*0.01);
			}
		}
		return calc_rank;
	}
	
	/* Check if a One Pair
	 * compare elements i and i+1 in the hand.
	*/
	private double aTwoPair() {
		calc_rank = 0.0;
		int count =0;
		double val = 0.0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getValue()==hand[i+1].getValue())
			{
				count++;
				val = hand[i].getValue()*0.01;
			}
		}
		if(count ==2){
			calc_rank = 2.0 + val;
		}
		return calc_rank;
	}
	
	/* Check if Three of a kind
	 * Three of a kind can be of form JJJ23 or 23JJJ. 
	 * In both cases one three of a kind card is the middle card
	 * Compare other elements to hand[2] in the hand. 
	*/
	private double aThreeOfAKind() {
		calc_rank = 0.0;
		Integer temp = hand[2].getValue();
		int count = 0;
		for(int i=0; i<5; i++)
		{
			if(temp == hand[i].getValue() )
			{
				count++;
			}
		}
		
		if(count == 3)
		{
			calc_rank = 3.0 + (hand[2].getValue()*0.01);
		}
		return calc_rank;

	}
	/* Check for a straight
	 * compare elements i and i+1
	 * */
	private double aStraight() {
		calc_rank = 0.0;
		int scount = 0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getValue()==(hand[i+1].getValue()-1))
			{
				scount++;
				calc_rank = 4.0 + (hand[i].getValue()*0.01);
			}
		}
		
		if(scount<4)
			{
				calc_rank = 0.0;
			}
		return calc_rank;	
	}
	
	/* Check for flush
	 * check the suit values for elements i and i+1
	 * then check the card values */
	private double aFlush() {
		calc_rank = 0.0;
		int fcount = 0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getSuit()==(hand[i+1].getSuit()))
			{
				fcount++;
				calc_rank = 5.0 + (hand[i].getValue()*0.01);
			}
		}
		
		if(fcount<4)
			{
				calc_rank = 0.0;
			}
		return calc_rank;	
	}
	
	
	/* Check for full house
	 * full house can be of form JJJKK or 22JJJ. 
	 * In both cases one three of a kind card is at hand[2]
	 * compare elements to hand[2]
	 * check for a pair other than three of a kind card value
	*/
	private double aFullHouse() {
		calc_rank = 0.0;
		double value = 0.0;
		if(aThreeOfAKind()>3.0){
			int c = hand[2].getValue();
			for(int i=0;i<4;i++){
				if(hand[i].getValue()==hand[i+1].getValue()&& hand[i].getValue()!=c){				
					value = aThreeOfAKind();
					calc_rank = 6.0 + (3-value);
				}
			}
			
		}
		return calc_rank;
	}
	/* check for four of a kind
	 * In every case one of the four of a kind card is at hand[2]
	 * */

	private double aFourOfAKind() {
		calc_rank = 0.0;
		int count = 0;
		Integer temp =hand[2].getValue();
		for(int i=0; i<5; i++)
		{
			if(temp==hand[i].getValue())
			{
				count ++;
			}
		}
		if(count == 4)
		{
			calc_rank = 7.0 + (hand[2].getValue()*0.01);
		}
		return calc_rank;

	}
	
	/* Check for straight flush
	 * A straightFlush's rank will be the last card here = highest card. 
	 * straight flush when values for temp1 & temp1 pass the tests for flush and straight 
	*/
	private double aStraightFlush() {
		calc_rank = 0.0;
		double temp1=0.0, temp2=0.0;
		temp1 = aFlush();
		calc_rank = 0.0;
		temp2 = aStraight();
		calc_rank = 0.0;
		
		if(temp1>5.0 && temp2>4.0){
			calc_rank = 8.0 + (hand[4].getValue()*0.01);
		}
		return calc_rank;
	}


}
