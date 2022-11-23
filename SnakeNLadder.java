package com.bl.snakeandladder;
public class SnakeNLadder {
public static final int POSITION = 0;

	public static void main(String args[]) {
		System.out.println("Snake And Ladder Simulator");
		byte player = 1;
		System.out.println("Game Starts...");
		System.out.println("Number of Players " + player);
		System.out.println("Position : On Square  " + POSITION);
		
		SnakeNLadder dice =new SnakeNLadder();
		dice.DiceRolled();
		
	}
	void DiceRolled() {
		int NewPosition =(int) ((Math.random()*6)+1);
		System.out.println("Player moved to  "+NewPosition);
	}
}
