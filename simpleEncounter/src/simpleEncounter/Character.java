package simpleEncounter;

public class Character {
	
	private String name;
	
	//basic defenses
	private int fortitude;
	private int reflex;
	private int will;
	private int armorClass;
	private int initiative;
	
	//health values
	private int maxHP;
	private int bloody;
	
	public Character() {
		super();
		
		this.name = name;
		this.fortitude= fortitude;
		this.reflex = reflex;
		this.will = will;
		this.armorClass = armorClass;
		this.initiative = initiative;
		this.maxHP = maxHP;
		this.bloody = bloody;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFortitude() {
		return fortitude;
	}

	public void setFortitude(int fortitude) {
		this.fortitude = fortitude;
	}

	public int getReflex() {
		return reflex;
	}

	public void setReflex(int reflex) {
		this.reflex = reflex;
	}

	public int getWill() {
		return will;
	}

	public void setWill(int will) {
		this.will = will;
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	
	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getBloody() {
		return bloody;
	}

	public void setBloody(int bloody) {
		this.bloody = bloody;
	}

}
