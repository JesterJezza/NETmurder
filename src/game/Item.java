package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Item 
{
	public Item(String name, String description, int price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		
		if(price == 0)
		{
			canSpawn = true;
		}
	}
	public String name;
	public String description;
	public int price; // 0 if can't be purchased;
	
	// whether item can spawn in the world
	// if the item has no price this will be true
	public boolean canSpawn = false;
	public int rarity; // is this a thing?
	
	public HashMap<String, Integer> attributeModifiers = new HashMap<String, Integer>();
	
	public void addModifier(String attribute, int value)
	{
		ArrayList<String> attr = (ArrayList<String>)Arrays.asList(globals.Attributes);
		
		if ( attr.contains(attribute))
			attributeModifiers.put(attribute, value);
		else 
			System.err.println("Error! Incorrect attribute!");
	}
	
	// weapons
	// Pool Cue (3 STR) £15 Uses:5
	// Kitchen Knife (2 STR, 1 SPD) £4 Uses:3
	// Chair (3 STR, -2 SPD) £7 Uses:2
	// Gareth's Gun (9 STR) £100 Uses:10
	// Beer Can (1 STR, 1 SPD, -1 CODE, -1 MNTL) £3 Uses:3
	// Pool Balls in a sock (4 STR, -1 SPD) £5 Uses:2
	// Monitor (3 STR, -1 SPD) £10 Uses: 5
	// Computer (5 STR, -2 SPD) £20 Uses: 5
	// Ethernet Cable (1 STR, 1 SPD) £8 Uses: 5
	
	//Equipment 
	// Key Card (1 HLTH) £5
	// Mobile Phone (2 HLTH, 1 MNTL) £15 
	// Laptop (2 STR) £15
	// Suit (3 HLTH, 2 MNTL, 1 CODE) £30
}
