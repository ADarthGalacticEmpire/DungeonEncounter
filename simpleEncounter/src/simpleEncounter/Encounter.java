package simpleEncounter;

import java.util.Random;
import java.util.Scanner;

public class Encounter {

	public static void main(String[] args) {
		
		//input name and create Player1 variable
		
		Scanner user = new Scanner(System.in);
		System.out.print("Player name : \n");
		String player1 = user.nextLine();

		 // TODO .getMonsterlevel , (if else determine mosterType by player level) 
		
		/*
		 *Scanner experience = new Scanner(System.in);
		 *	System.out.print("Player level : \n" );
		 */
		
		Random rand = new Random();
		
		// change print format / parameters when done with todo
		int numberOfEnemies = rand.nextInt(25);
		 System.out.printf("%s%s%s%d%s" , "Encounter: " , player1, "  VS  ", 
		numberOfEnemies, " goblins. \n");
		 
		 int attack = rand.nextInt(20) + 5;
		 int damage = rand.nextInt(8) + 8;
		 
		// TODO .getMonsterDefense (if else on player attack roll
		 
		// TODO .getName, . getPlayer#
		 
		 
		// change print format / parameters when done with todo
		 System.out.printf("%s%s%d%s%s%d%s", player1, " rolls attack : " ,attack, "\n",
				 "Hit : " , damage, " damage.");
	}

}
