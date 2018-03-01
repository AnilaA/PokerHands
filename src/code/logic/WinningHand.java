package code.logic;

import java.util.Scanner;
/*Class to find the winning hand */
public class WinningHand {
	private static double rank1 = 0.0 ;
	private static double rank2 = 0.0 ;
	private static Card[] player1;
	private static Card[] player2;
	private static DealtHands dh ;
	private static HandChecker hc;
	private int winner = 0;
	private int wrank = 0;
	private String [] pattern = {"High Card", "One Pair", "Two Pair", "Three of a Kind", "Straight", 
								"Flush", "FullHouse", "Four of a Kind","Straight Flush"};
	
	public WinningHand(){
		dh = new DealtHands();
		hc = new HandChecker();
		
		dh.getHands();
		dh.printHand1();
		dh.printHand2();
		
		player1 = dh.getHand1();
		player2 = dh.getHand2();
		
		rank1 = hc.getRanking(player1);
		rank2 = hc.getRanking(player2);
	}
	
	/* Compare the ranks of two hands and find the winner
	 * */
	public void compareHands()
	{
		if(rank1>rank2)
		{
			winner = 1;
			wrank = (int) rank1;
		}
		else if(rank2>rank1){
			winner =2;
			wrank = (int) rank2;
		}
		else if(rank1==rank2){
			winner = 0;
			wrank = (int) rank1;
		}
		else{
			System.out.println("Invalid hands!");
		}
	}
	
	public void display(){
		compareHands();
		System.out.println("");
		/*System.out.println("rank1  " + rank1);
		System.out.println("rank2  " + rank2);
		System.out.println("w rank  " + wrank);
		*/
		if(winner!=0){
		System.out.println("Hand "+ winner + " wins! " + "(" + pattern[wrank] + ")" );		
		}
		else{
			System.out.println("It's a draw!");
		}
	}
	
	public static void main(String[] args) {
		
		String repeat = "y";
		Scanner input = new Scanner(System.in);

		while (repeat.equals("y")) {
			WinningHand object = new WinningHand();
			object.display();
			System.out
					.println("\n \nWould you like to play again? (y-yes/n-no)");
			do {
				repeat = input.next();
				if (!(repeat.equals("y") || repeat.equals("n")))
					System.out
							.println("That is an invalid response (y-yes/n-no)");
			} while (!(repeat.equals("y") || repeat.equals("n")));
		}


	}
	
}
