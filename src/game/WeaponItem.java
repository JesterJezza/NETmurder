package game;

public class WeaponItem extends Item 
{
	int uses;
	public WeaponItem(String name, String desc, int price, int uses)
	{
		super(name, desc, price);
		this.uses = uses;
	}
}
