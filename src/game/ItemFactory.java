package game;

import java.util.ArrayList;

public class ItemFactory 
{	
	static ArrayList<WeaponItem> weaponItems;
	static ArrayList<SupportItem> supportItems;
	
	public static void init()
	{
		// gen weapons
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem poolCue = new WeaponItem("Pool Cue", "description", 1500);
		poolCue.addModifier("Strength", 3);
		weaponItems.add(poolCue);
		
		// gen supports
		supportItems = new ArrayList<SupportItem>();
		SupportItem keyCard = new SupportItem("Key Card", "description", 0);
		keyCard.addModifier("Fortitude", 1);
		supportItems.add(keyCard);
	}
	
	public static WeaponItem createWeaponItem(String weaponName)
	{
		for (WeaponItem weapon : weaponItems)
		{
			if(weapon.name == weaponName)
			{
				return weapon;
			}
		}
		
		// no weapon found with that name
		return null;
	}

	public static SupportItem createSupportItem(String supportName)
	{
		for (SupportItem support : supportItems)
		{
			if(support.name == supportName)
			{
				return support;
			}
		}
		
		// no support found with that name
		return null;
	}
}
