package game;

public class Item 
{
	String name;
	String description;
	int price; // 0 if can't be purchased;
	
	boolean canSpawn; // whether item can spawn in the world
	int rarity;
}
