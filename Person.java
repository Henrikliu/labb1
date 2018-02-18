package provSpel;

public class Person extends NPC {

	private String dialogue;
	
	public Person(String name, double weight, String description, String dialogue) {
		super(name, weight, description);
		
		this.dialogue = dialogue;
		
	}

	public Person(String name, double weight,  String description) {
		 
		
		super(name, weight, description);

		

	}
	
	
	
	
	public void doCommand(String kommand, Game world1){
		
		if (kommand.equals("give coins") && world1.getPlayer().getGold() > 10){
			
			world1.getPlayer().setGold(world1.getPlayer().getGold() - 10);
	
			System.out.println(dialogue);
		}
			else if (kommand.equals("give coins") && world1.getPlayer().getGold() <10) { 
			 System.out.println("You can't afford that");
		}
		
		
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	

	

