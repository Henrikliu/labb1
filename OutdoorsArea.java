package provSpel;

public class OutdoorsArea extends Location {

	private String weather;
	private Item undergrounditem;
	
	public OutdoorsArea(String longDescription, String shortDescription, String weather) {

		super(longDescription, shortDescription);

		this.weather = weather;

	}

	public OutdoorsArea(String longDescription, String shortDescription, String weather, Item undergrounditem) {

		super(longDescription, shortDescription);

		this.weather = weather;
		this.undergrounditem = undergrounditem;
	}

	public void describeYourself() {

		if (getKollare() == 1) {

			System.out.println(getshortDescription());
			describePaths();
			describeItems();
			getCreature().get(0).describeYourself();	
	       
		}

		else {
			System.out.println(getlongDescription() + " " + weather);
			describePaths();
			setKollare(1);
			describeItems();
			getCreature().get(0).describeYourself();	
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
				System.out.println("there is a road leading " + direction);

			}

		}
	}

	public void doCommand(String kommand, Game world1) {

		if (kommand.equals("change weather")) {

			System.out.println("Provide a string describing the new weather: ");
			weather = Keyboard.nextine();

		}

		if (kommand.equals("look")) {

			describeYourself();

		}
		
	}

	public Item getUndergrounditem() {
		return undergrounditem;
	}

	public void setUndergrounditem(Item undergrounditem) {
		this.undergrounditem = undergrounditem;
	}
}
