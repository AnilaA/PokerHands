/**
 * @author Anila Achankunju
 */
package code.logic;

public class WinningHand {
	private static Card[] hand;
	
	public boolean straight()
	{	
		boolean straight = false;
		int Card1 = hand[0].getValue();
		for(int i=1;i<5;i++)
		{
			if(hand[i].getValue()==Card1+1)
			{
				straight = true;
			}
		}
		
		if(hand[0].getValue()==14 )
		{
			
		}
		return straight;
	}
	
	
}
