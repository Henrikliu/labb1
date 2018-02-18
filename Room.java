package provSpel;

public class Room extends Location {

	private int size;

	public Room(String longDescription, String shortDescription, int size,
			Item sak) {

		super(longDescription, shortDescription);

		this.size = size;
		setLoot(sak);
	}

	public Room(String longDescription, String shortDescription, int size) {

		super(longDescription, shortDescription);

		this.size = size;

	}
	
	
	public Room(String longDescription, String shortDescription, int size, int lightning) {

		super(longDescription, shortDescription);

		this.size = size;
		setLightning(lightning);

	}

	public void describeYourself() {

		if (getKollare() == 1 && getLightning() == 1) {

			System.out.println(getshortDescription());
			describePaths();
			describeItems();
			getCreature().get(0).describeYourself();	
		}

		else if (getLightning() == 0) {
			
			System.out.println("It's too dark to see anything.");
			
		}
		
		else {

			System.out.println(getlongDescription() + " The room is " + size
					+ " orcfeet big");
			getCreature().get(0).describeYourself();
			describePaths();
			setKollare(1);
			describeItems();
			
		}
	}

	public void describePaths() {

		String direction = null;

		for (int i = 0; i <= 3; i++) {

			if (getPaths()[i] != null) {

				switch (i) {

				case 0:
					direction = "north";
					break;
				case 1:
					direction = "east";
					break;
				case 2:
					direction = "south";
					break;
				case 3:
					direction = "west";
					break;

				}
				System.out.println("there is a door leading " + direction);

			}

		}
	}

	public void doCommand(String kommand, Game world1) {

		if (kommand.equals("light torch") && getLightning() == 0) {

			for (int i = 0; i < world1.getPlayer().getBackpack().size(); i++) {

				if (world1.getPlayer().getBackpack().get(i).getName()
						.equals("torch")) {
					
					
					System.out.println(getlongDescription() + "the room is " + size + " orcfeet big.");
					describePaths();
					describeItems();

				}

			}

		}

	}

}