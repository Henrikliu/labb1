package provSpel;

public class WearableItem extends Item {

	private int extrahp;

	public WearableItem(String name, double weight, int price, int extrahp) {

		super(name, weight, price);

		this.extrahp = extrahp;

	}

	public int getExtrahp() {
		return extrahp;
	}

	public void doCommand(String kommand, Game world1) {

		for (int j = 0; j < world1.getPlayer().getBackpack().size(); j++) {

			if (kommand.equals("wear " + world1.getPlayer().getBackpack().get(j).getName())
					&& world1.getPlayer().getBackpack().get(j) instanceof WearableItem) {

				// Increases health of the player by the amount found on the item
				world1.getPlayer().setHealth(
						world1.getPlayer().getBackpack().get(j).getExtrahp() + world1.getPlayer().getHealth());
				// Prints the increase in HP and acknowledges that it has been equipped
				System.out.println("Your health has increased by " + world1.getPlayer().getBackpack().get(j).getExtrahp()
								+ " from equipping " + world1.getPlayer().getBackpack().get(j).getName());

				// Adds the item to player equipment array and deletes it from backpack
				world1.getPlayer().getEquipment().add(world1.getPlayer().getBackpack().get(j));
				world1.getPlayer().getBackpack().remove(j);

			}

		}

	}

}
