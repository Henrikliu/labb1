package provSpel;

import java.util.ArrayList;


public class Player {

	private String name;
	private Location position;
	private int gold;
	private int health;
	private ArrayList<Item> backpack;
	private ArrayList<Item> equipment;

	

	public  int getHealth() {
		return health;
	}

	public void setHealth(int health1) {
		health = health1;
	}

	public Player(String name) {
		this.name = name;
	}

	public void setPosition(Location position) {
		

		if (position == null) {

			System.out.println("it is not possible to go there. Try again");

		} 
		
		if (position != null) {
			this.position = position;
			position.describeYourself();

		}

	}

	public Location getPosition() {
		return position;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	

	public Player() {

		System.out.println("Welcome to the best game ever.\nWhat is your name? ");

		this.name = Keyboard.playerNamesetter();
		System.out.println("Welcome " + name + " to the game. You can move your character by typing \"north\", \"east\", \"south\" and \"west\". You can learn more commands by typing  \"help\"");
		
		this.health = 10;
		this.gold = 30;
		backpack = new ArrayList<>();
		equipment = new ArrayList<>();

	}

	public void setStart(Location location) {
		position = location;
		position.describeYourself();

	}

	public ArrayList<Item> getEquipment() {
		return equipment;
	}

	public void setEquipment(Item item) {
		equipment.add(item);
	}

	public ArrayList<Item> getBackpack() {
		return backpack;
	}

	public void doCommand(String kommand, Game world1) {

		if (kommand.equals("items")) {

			System.out.println("You have the following items in your backack: ");

			for (int i = 0; i < backpack.size(); i++) {

			backpack.get(i).printYourself();
			
			}

			System.out.println("and the following items equipped: ");
			
			for (int j = 0; j < equipment.size(); j++) {
				
				
			 equipment.get(j).printYourself();
			}
			
			}

			
			
		

		for (int i = 0; i < position.getLoot().size(); i++) {

			if (kommand.equals("take " + position.getLoot().get(i).getName())) {

				backpack.add(position.getLoot().get(i));
				System.out.println("You picked up "
						+ position.getLoot().get(i).getName());
				position.getLoot().remove(i);

			}
		}

	}
}