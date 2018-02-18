package provSpel;

import java.util.Scanner;

public class Keyboard {

	private static Scanner sc = new Scanner(System.in);
	
	public static String test;
	
	public static void translate(Game world1) {

		
		
		System.out.println("What do you want to do? ");
		test = sc.nextLine();
		
		world1.getPlayer().doCommand(reader(), world1);
        world1.getPlayer().getPosition().doCommand(reader(), world1);
		world1.getPlayer().getPosition().getCreature().get(0).doCommand(reader(), world1);
		
		for (int i = 0; i < world1.getPlayer().getBackpack().size(); i++) {
			world1.getPlayer().getBackpack().get(i).doCommand(reader(), world1);;
		    
		}

		
		for (int i = 0; i < world1.getPlayer().getEquipment().size(); i++) {
			world1.getPlayer().getEquipment().get(i).doCommand(reader(), world1);;
		    
		}
		

		
		switch (reader()) {

		
		case "north":
			world1.getPlayer().setPosition(world1.getPlayer().getPosition().getPaths()[0]);
			break;
		case "east":
			world1.getPlayer().setPosition(world1.getPlayer().getPosition().getPaths()[1]);
			break;
		case "south":
			world1.getPlayer().setPosition(world1.getPlayer().getPosition().getPaths()[2]);
			break;
		case "west":
			world1.getPlayer().setPosition(world1.getPlayer().getPosition().getPaths()[3]);
			break;
		
		case "help":
		System.out.println("You move your character with the following commands \"north\", \"east\", \"south\", \"west\". \nYou can check your current items with \"items\" /n You can pick up items to your backpack with \"take\" and equip them with \"wear\"");
		System.out.println();
		break;
		}
		
		
		
		
	}

	public static String reader() {
		
		return test;
		
		
	}

	public static String nextine() {
		
	   String k = sc.nextLine();
	   
	   return k;
	   
	}
	
	
	
	public static String playerNamesetter() {
		
	String input = sc.nextLine();
		
	return input;
	}


}
