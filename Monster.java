package provSpel;

public class Monster extends NPC {

	private String afterbattletext;
	
	
	
	
	
	public Monster(String name, double weight, Item item, String description) {
		super(name, weight, item, description);

	}
	
	public Monster(String name, double weight,  String description, String afterbattletext) {
	
		super(name, weight, description);
		
		this.afterbattletext = afterbattletext;
		
	
	
	}

	public void doCommand(String kommand, Game world1) {

	
		
		if (kommand.equals("kill " + getName())) {

			System.out.println("det kommer fram");
			for (int j = 0; j < world1.getPlayer().getBackpack().size(); j++) {

				if (world1.getPlayer().getBackpack().get(j).getName()
						.equals("spear")) {

					System.out.println("You killed the " + getName() + " "+ afterbattletext);

				} else {
					System.out.println("You lost the fight! You've lost 5 HP");

					world1.getPlayer().setHealth(
							world1.getPlayer().getHealth() - 5);

				}
			}
		}

	}
}



