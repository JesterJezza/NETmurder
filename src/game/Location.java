package game;

import java.util.ArrayList;

public class Location 
{
	String name;
	boolean statAdj = false;
	String stat1type = null;
	int stat1val = 0;
	String stat2type = null;
	int stat2val = 0;
	ArrayList<Location> connectedLocations = new ArrayList<Location>();
	
	ArrayList<Item> items;
	
	
	
	//Locations
	//Board Room (MNTL UP)
	//Pool Table (SPD UP)
	//Toilets (HLTH DOWN)
	//Lift (SPD DOWN)
	//M1 (CODE UP, MNTL UP)
	//M2 (CODE UP, MNTL UP)
	//Hallway
	public static void init()
	{
		globals.b = Location("b");
	}
	
	public Location(String locationName)
	{
		if (locationName == "b")
		{
			name = "Board Room";
			statAdj = true;
			stat1type = "mental";
			stat1val = 1;
			
			connectedLocations.add(globals.b);
			
		}
		else if (locationName == "p")
		{
			name = "Pool Table";
			statAdj = true;
			stat1type = "speed";
			stat1val = 1;
			
			connectedLocations.add(globals.p);
		
		}
		else if (locationName == "t")
		{
			name = "Toilets";
			statAdj = true;
			stat1type = "health";
			stat1val = -1;
			connectedLocations.add(globals.t);
		}
		else if (locationName == "l")
		{
			name = "Lift";
			statAdj = true;
			stat1type = "speed";
			stat1val = -1;
			connectedLocations.add(globals.l);
		}
		else if (locationName == "m1")
		{
			name = "Meeting Room 1";
			statAdj = true; 
			stat1type = "code";
			stat1val = 1;
			stat2type = "mental";
			stat2val = -1;
			connectedLocations.add(globals.m1);
		}
		else if (locationName == "m2")
		{
			name = "Meeting Room 2";
			statAdj = true; 
			stat1type = "code";
			stat1val = 1;
			stat2type = "mental";			
			stat2val = -1;
			connectedLocations.add(globals.m2);
		}
	}
	
	public Location()
	{
		name = "Hallway";
		connectedLocations.add(globals.h);
		//ArrayList<Location> connectedLocations
	}
}
