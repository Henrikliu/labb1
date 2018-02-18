package provSpel;

public class Tool extends Item {

	public Tool(String name, double weight, int price) {

		super(name, weight, price);

	}

	public void doCommand(String kommand, Game world1) {

		for (int j = 0; j < world1.getPlayer().getBackpack().size(); j++) {

			if (kommand.equals("dig") && world1.getPlayer().getBackpack().get(j).getName().equals("shovel")) {

				if (world1.getPlayer().getPosition() instanceof OutdoorsArea
						&& world1.getPlayer().getPosition().getUndergrounditem() != null) {

					System.out.println("You dug a hole in the ground and found a "
							+ world1.getPlayer().getPosition().getUndergrounditem().getName()
							+ ". You place it in your backpack.");

					world1.getPlayer().getBackpack().add(world1.getPlayer().getPosition().getUndergrounditem());
					world1.getPlayer().getPosition().setUndergrounditem(null);

				} else if (world1.getPlayer().getPosition() instanceof OutdoorsArea) {
					System.out.println("You dug a hole but found nothing");

				} else { System.out.println("It is not possible to dig here!");
				}
			}

		}

	
	
	
	
	}

}
