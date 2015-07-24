package game;

public class Character 
{
	public Character(String name, Player player, Game game)
	{
		this.name = name;
		this.player = player;
		this.game = game;
	}
	Player player;
	String name;
	Game game;

	// attr
	static int AttributeCap = 20;
	int attributePoints = 10;
	int strength = 6, speed = 6, mental = 6, fortitude = 6, coding = 6;
	void IncreaseStat(int stat, int amount)
	{
		
	}
	
	// stats
	int health = 100;
	int xp = 0;
	int level = 1;
	int money = 5000;
	
	// equipment
	WeaponItem weaponItem;
	public void SetWeapon(WeaponItem weapon)
	{
		
	}
	SupportItem supportItem;
	public void SetSupport(SupportItem support)
	{
		
	}
	
	
	static int[] LevelXPRequirements;
	protected void IncreaseXP(int amount)
	{
		xp += amount;
		if (xp > LevelXPRequirements[level+1])
			LevelUp();
	}
	void LevelUp()
	{
		level++;
		attributePoints++;
	}
	
	Location location;
	PlayerInventory inventory;
	
	public boolean Alive()
	{
		return health > 0;
	}
	
	//here be dragons Lewis rarrrr <.>
}
