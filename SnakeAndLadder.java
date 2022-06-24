package snakeandladdersimulator;

public class SnakeAndLadder {
	
	 public static final int winningPosition = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p1position = 0;
		int i = 0;
		
		while(p1position != winningPosition) {
			i++;
			int diceroll = (int) Math.floor(Math.random()*6) + 1;
			System.out.println("Dice is rolled: Number= " + diceroll);
			int checkoption = (int) Math.floor(Math.random()*3) + 1;
			if(checkoption == 1) {
				p1position = p1position;
				System.out.println("No Play: Position= " + p1position);
			}
			else if(checkoption == 2) {	
				if(p1position > 100) {
					p1position = p1position;
					System.out.println("Ladder: Position= " + p1position);		
				}
				else if(p1position<100) {
					p1position = p1position + diceroll;
					System.out.println("Ladder: Position= " + p1position);
				}
			}
			else {
				if(p1position < 0) {
					p1position = 0;
				}
				else if(p1position > 0) {
					p1position = p1position - diceroll;
					System.out.println("Snake: Position= " + p1position);
				}
			}
		
		}
		if(p1position==winningPosition) {
			System.out.println("Yeah Player Wins !!!" + p1position);
		}
	}

}
