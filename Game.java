package provSpel;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

	
	private Player player;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	private ArrayList<Location> world;
	public ArrayList<Location> getWorld() {
		return world;
	}

	public void setWorld(ArrayList<Location> world) {
		this.world = world;
	}

	public static Scanner sc;

	public static void main(String[] args) {

		Game spel1 = new Game();
		spel1.run(spel1);
		
		
	
	}

	public Game() {

		player = new Player();
		world = new ArrayList<>();
		world.add(new Room("You are inside a cozy tavern. People are laughing at the bard playing songs and telling stories and children are running around chasing each others through the maze of people dancing.\nThere's a joyful atmosphere in the air.",
				"You are at the cozy tavern again", 8));
		world.add(new OutdoorsArea(
				"You are at the abandoned monastery, st:Martin. The monastery, once formidable and home of the Phoenix order at the heights of its power, lay in ruins from its battle against time.",
				"You are back at the monastery", "It is raining and the wind tears through your clothes", (new WearableItem("badboll", 5.6, 10,3))));
		world.add(new Room("You are in Jacob's, a swordshop. Swords in various sizes and shapes hang from the wall. You hear the sounds of a hammer meeting metal from back of the room. ",
				"You are back at Jacob's swordshop ", 24, 0));
		world.add(new OutdoorsArea(
				"You are at a graveyard. Tombstones fill your sight and a presence of death lingers over this place. Your heart beats a little faster. ",
				"You are back at the graveyard", "It is snowing"));
		world.add(new OutdoorsArea(
				"You are on a big open plain, grass as far as the eye can see. On the horizon looms a big dark mountain. ",
				"You are back at the plain. ", "It is windy."));

		
		// Ange hur olika platser l�nkas till varandra
		world.get(0).setPaths(world.get(1), world.get(2), null, null);
		world.get(1).setPaths(null, world.get(3), world.get(0), null);
		world.get(2).setPaths(world.get(3), null, null, world.get(0));
		world.get(3).setPaths(null, world.get(4), world.get(2), world.get(1));
		world.get(4).setPaths(null, null, null, world.get(3));
		
		
		world.get(0).setLoot(new Tool("shovel", 6.7, 10));
		world.get(3).setLoot(new WearableItem("elvenrobe", 3.4, 29, 5));
		world.get(2).setLoot(new WearableItem("helmet", 3.4, 20, 7));
		world.get(3).setLoot(new WearableItem("necklace", 7.4, 26, 8));
		world.get(0).setLoot(new Tool("torch", 6.7, 10));
		world.get(0).setCreature((new Person("beggar", 100, "In a dark corner of the tarvern sits a fat and smelly man", "The fat man accepts the coins and show lisa his penis")));
		world.get(1).setCreature((new Monster("boar", 106.4, " From the ruins a boar approaches ", "Yay, we're getting steak tonight")));
		world.get(0).setLoot(new Tool("spear", 5.6, 10));
		player.setStart(world.get(0));
		
        
	
	}

	public void run(Game world) {

		while (player.getHealth() > 0)

		Keyboard.translate(world);
	
		
	}
}