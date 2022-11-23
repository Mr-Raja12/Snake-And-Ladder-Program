package com.bl.snakeandladder;
public class SnakeNLadder {
	static int position = 1;
	int positionUC2 = (int) ((Math.random() * 6) + 1);
	
	void diceRolled() {
			System.out.println("Die Rolls, Position : On Square "+ positionUC2);
		}
	void optionCheck() {
		int  positionUC3 = (int) ((Math.random() * 6) + 1);
		int checkOption = (int) (Math.random() * 3);
		
		
	switch(checkOption) {
	
	case 0 : System.out.println("No Play!...same position");
			 break;
	case 1 : System.out.println("Yoo...you climbed a ladder");
	position = positionUC2 + positionUC3;
	         System.out.println("Position : On Square " + position );
			 break;
	case 2 : System.out.println("Oops...snakes was there");
	position = positionUC2 - positionUC3;
	         if (position <= 0)
	        	 position = 1;
	         System.out.println("Position : On Square " + position);
	         break;
			}
		}
	
public static void main(String args[]) {
		
		
		System.out.println("Snake And Ladder Simulator");
		
		byte player = 1;
//UC1
		System.out.println("Game Starts...");
		System.out.println("Number of Players " + player);
		System.out.println("Initial Position : On Square " + position);
//UC2	
		SnakeNLadder dice = new SnakeNLadder();
		dice.diceRolled();
//UC3
		SnakeNLadder opt = new SnakeNLadder();
		opt.optionCheck();
	}
}
