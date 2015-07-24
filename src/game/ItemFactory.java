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
		WeaponItem poolCue = new WeaponItem("Pool Cue", "description", 1500, 5);
		poolCue.addModifier("Strength", 3);
		weaponItems.add(poolCue);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem kitchenKnife = new WeaponItem("Kitchen Knife", "description", 400, 3);
		kitchenKnife.addModifier("Strength", 2);
		kitchenKnife.addModifier("Speed", 1);
		weaponItems.add(kitchenKnife);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem Chair = new WeaponItem("Chair", "description", 700, 2);
		Chair.addModifier("Strength", 3);
		Chair.addModifier("Speed", -2);
		weaponItems.add(Chair);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem GarethsGun = new WeaponItem("Gareth's Gun", "description", 10000, 10);
		Chair.addModifier("Strength", 9);
		weaponItems.add(GarethsGun);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem BeerCan = new WeaponItem("Beer Can", "description", 300, 3);
		BeerCan.addModifier("Strength", 1);
		BeerCan.addModifier("Speed",  -1);
		BeerCan.addModifier("Code", -1);
		BeerCan.addModifier("Mental", -1);
		weaponItems.add(BeerCan);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem PoolBalls = new WeaponItem("Pool Balls", "description", 1000, 2);
		PoolBalls.addModifier("Strength", 4);
		PoolBalls.addModifier("Speed",  -1);
		weaponItems.add(PoolBalls);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem Monitor = new WeaponItem("Monitor", "description", 1000, 5);
		Monitor.addModifier("Strength", 3);
		Monitor.addModifier("Speed",  -1);
		weaponItems.add(Monitor);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem Computer = new WeaponItem("Computer", "description", 3000, 5);
		Computer.addModifier("Strength", 5);
		Computer.addModifier("Speed",  -2);
		weaponItems.add(Computer);
		
		weaponItems = new ArrayList<WeaponItem>();
		WeaponItem Ethernet = new WeaponItem("Ethernet Cable", "description", 800, 5);
		Ethernet.addModifier("Strength", 1);
		Ethernet.addModifier("Speed",  1);
		weaponItems.add(Ethernet);
		
		// gen supports
		supportItems = new ArrayList<SupportItem>();
		SupportItem keyCard = new SupportItem("Key Card", "description", 500);
		keyCard.addModifier("Fortitude", 1);
		supportItems.add(keyCard);
		
		supportItems = new ArrayList<SupportItem>();
		SupportItem Mobile = new SupportItem("Mobile Phone", "description", 1500);
		Mobile.addModifier("Health", 2);
		Mobile.addModifier("Mental", 1);
		supportItems.add(Mobile);
		
		supportItems = new ArrayList<SupportItem>();
		SupportItem Laptop = new SupportItem("Laptop", "description", 1500);
		Laptop.addModifier("Strength", 2);
		supportItems.add(Laptop);
		
		supportItems = new ArrayList<SupportItem>();
		SupportItem Suit = new SupportItem("Suit", "description", 3000);
		Suit.addModifier("Health", 3);
		Suit.addModifier("Mental", 2);
		Suit.addModifier("code", 1);
		supportItems.add(Suit);
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
