/**
 * @author Anila Achankunju
 * */
package code.logic;

public class DealtHands {
	private Card[] hand1;
	private Card[] hand2;
	private Card[] hand;
	Deck dealtCards;
	String [] suitString = {"C","D","H","S"};
	public DealtHands()
	{
		hand1 = new Card[5];
		hand2 = new Card[5];
		hand = new Card[10];
		dealtCards = new Deck();
	}
	
	public void getHands(){
		hand = dealtCards.getDealtCards();
		for(int i=0;i<5;i++)
		{
			hand1[i] = hand[i];
			System.out.println(hand1[i].getSuit()+""+hand1[i].getValue());
		}
		System.out.println("********************");
	
		for(int j=0;j<5;j++)
		{
			hand2[j]=hand[j+5];
			System.out.println(hand2[j].getSuit()+""+hand2[j].getValue());
		}
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
	/*public static void main(String[] args) {
		DealtHands obj = new DealtHands();
		obj.getHands();
		obj.printHand1();
		obj.printHand2();
	}*/
}

