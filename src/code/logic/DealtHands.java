/**
 * @author Anila Achankunju
 * */
package code.logic;
/* Class to obtain two sets of hands*/
public class DealtHands{
	private Card[] hand;
	private Card[] hand1;
	private Card[] hand2;
	Deck dealtCards;

	public DealtHands()
	{
		hand = new Card[10];
		hand1 = new Card[5];
		hand2 = new Card[5];
		dealtCards = new Deck();
	}
	
	public void getHands(){
		hand = dealtCards.getDealtCards();
		for(int i=0;i<5;i++)
		{
			hand1[i] = hand[i];
	//	System.out.println(hand1[i].getSuit()+""+hand1[i].getValue());
	
		}
		
		sortHand(hand1);
		
	//	System.out.println("**********************");
		for(int j=0;j<5;j++)
		{
			hand2[j]=hand[j+5];
	//	System.out.println(hand2[j].getSuit()+""+hand2[j].getValue());
		}
		sortHand(hand2);	
	}
	
	public String printHand1(){
		String h1 = null;
		System.out.print("1st hand:");
		for(int k=0;k<5;k++){
		h1 = hand1[k].cardToString();
		System.out.print(h1 + " ");
		}
		System.out.println();
		return h1;
	}
	
	public String printHand2(){
		String h2 = null;
		System.out.print("2nd hand:");
		for(int k=0;k<5;k++){
		h2 = hand2[k].cardToString();
		System.out.print(h2 + " ");
		}
		return h2;
	}
	
	//sort the hands in ascending order 
	public Card[] sortHand(Card[] o) {
		Integer in, out;
	    for (out = 1; out < o.length; out++) {
	      Card temp = o[out];
	      in = out;
	      while (in > 0 && o[in - 1].getValue().compareTo(temp.getValue()) > 0) {
	        o[in] = o[in - 1];
	        --in;
	      }
	      o[in] = temp;
	    }
		return o;
	}

	public Card[] getHand1() {
		return hand1;
	}

	public Card[] getHand2() {
		return hand2;
	}

}

