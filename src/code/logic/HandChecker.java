/**
 * @author Anila Achankunju
 */
package code.logic;

public class HandChecker {
	private  Card[] hand;
	private double calc_rank;
	//to compare two hands calculate their ranks based on the priority of hands. 
	
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
	
	/*The high card is the last card in the hand because it's sorted in ascending order. 
	Multiply card value with 0.01 so that the decimal part gives ranks of the hands. 
	These decimal values can be used to compare the hands and find the winner.
	*/

	private double aHighCard() {
		calc_rank = 0.0;
		calc_rank = hand[4].getValue()*0.01;
		return calc_rank;
	}
	
	//One pair if hand[i] == hand[i+1]
	
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
	// three of a kind can be of form JJJ23 or 23JJJ. In both cases one three of a kind card is at hand[2]
	private double aThreeOfAKind() {
		calc_rank = 0.0;
		int count = 0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getValue()==hand[i+1].getValue() )
			{
				count ++;
			}
		}
		if(count == 3)
		{
			calc_rank = 3.0 + (hand[2].getValue()*0.01);
		}
		return calc_rank;

	}

	private double aStraight() {
		calc_rank = 0.0;
		for(int i=0; i<4; i++)
		{
			if(hand[i+1].getValue()==(hand[i].getValue()+1))
			{
				calc_rank = 4.0 + (hand[i].getValue()*0.01);
			}
			else
			{
				calc_rank = 0.0;
			}
		}
		return calc_rank;	
	}

	private double aFlush() {
		calc_rank = 0.0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getSuit()==(hand[i+1].getSuit()))
			{
				calc_rank = 5.0 + (hand[i].getValue()*0.01);
			}
			else
			{
				calc_rank = 0.0;
			}
		}
		return calc_rank;	
	}
	
	
	// full house can be of form JJJKK or 22JJJ. In both cases one three of a kind card is at hand[2]
	// check for a pair other than three of a kind card value
	
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

	private double aFourOfAKind() {
		calc_rank = 0.0;
		int count = 0;
		for(int i=0; i<4; i++)
		{
			if(hand[i].getValue()==hand[i+1].getValue())
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
	
	//A straightFlush's rank will be the last card here = highest card. 
	private double aStraightFlush() {
		calc_rank = 0.0;
		if(aFlush()>5.0 && aStraight()>4.0){
			calc_rank = 8.0 + (hand[4].getValue()*0.01);
		}
		return calc_rank;
	}


}
