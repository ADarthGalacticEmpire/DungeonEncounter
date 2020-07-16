package simpleEncounter;

public class Players extends Character implements Statistics {

	public static void main(String[] args) {
		
		Character player1 = new Character();
		Character enemies = new Character();
		
		player1.setName("Tabni");
		
		player1.setArmorClass(24);
		player1.setFortitude(18);
		player1.setReflex(23);
		player1.setWill(24);
		player1.setInitiative(5);
		player1.setMaxHP(68);
		player1.setBloody(34);
		
		enemies.setName("Goblin");
		enemies.setArmorClass(20);
		enemies.setFortitude(16);
		enemies.setReflex(17);
		enemies.setWill(16);
		enemies.setInitiative(5);
		enemies.setMaxHP(40);
		enemies.setBloody(20);
		
		

	}

}
