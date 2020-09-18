
public class Healer {

	private String name;
	private int level;
	private int maxHealth;
	private int health;
	private int attack;
	private int defense;
	private int magicAttack;
	private int magicDefense;
	private int agility;
	private int wisdom;
	
	public Healer(String n) {
		name = n;
		level = 1;
		maxHealth = 16;
		health = maxHealth;
		attack = 4;
		defense = 6;
		magicAttack = 5;
		magicDefense = 10;
		agility = 3;
		wisdom = 12;
	}
	
	public Healer(String n, int lev) {
		name = n;
		level = 1;
		maxHealth = 16*lev;
		health = maxHealth;
		attack = 4*lev;
		defense = 6*lev;
		magicAttack = 5*lev;
		magicDefense = 10*lev;
		agility = 3*lev;
		wisdom = 12*lev;
	}
}
