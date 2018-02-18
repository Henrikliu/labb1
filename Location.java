package provSpel;

import java.util.ArrayList;

public abstract class Location {

	private String longDescription;
	private String shortDescription;
	private Location[] paths;
	private int kollare = 0;
	private ArrayList<Item> loot;
    private int lightning = 1;
    private ArrayList<NPC> creature;
	
	
	public int getKollare() {
		return kollare;
	}

	public void setKollare(int kollare) {
		this.kollare = kollare;
	}

	public Location(String longDescription, String shortDescription) {

		this.longDescription = longDescription;
		this.shortDescription = shortDescription;
		paths = new Location[4];
		loot = new ArrayList<>();
		creature = new ArrayList<>();
	}

	public void setPaths(Location north, Location east, Location south,
			Location west) {

		paths[0] = north;
		paths[1] = east;
		paths[2] = south;
		paths[3] = west;

	}

	public String getlongDescription() {
		return longDescription;
	}

	public void setlongDescription(String name) {
		this.longDescription = name;
	}

	public ArrayList<NPC> getCreature() {
		return creature;
	}

	public void setCreature(NPC creature) {
		this.creature.add(creature);
	}

	public void describeYourself() {

		System.out.println(longDescription);
		describePaths();
	}

	public abstract void describePaths();

	public String getshortDescription() {
		return shortDescription;
	}

	public void setshortDescription(String description) {
		this.shortDescription = description;
	}

	public Location[] getPaths() {
		return paths;
	}

	public ArrayList<Item> getLoot() {
		return loot;
	}

	public void setLoot(Item loot) {

		this.loot.add(loot);

	}
	

	public void doCommand(String kommand, Game world1) {

		if (kommand.equals("look")) {

			describeYourself();

		
		
		}

	}
	
	public Item getUndergrounditem() {
		return null;
	}

	public void setUndergrounditem(Item undergrounditem) {
		
	}
	
	public int getLightning() {
		return lightning;
	}

	public void setLightning(int lightning) {
		this.lightning = lightning;
	}

	public void describeItems() {

		if (loot.size() >= 1) {
			System.out.println("Following items exist at this location: ");
			for (int i = 0; i < loot.size(); ++i) {

				System.out.println(loot.get(i).getName());
			}
		}
	}
}