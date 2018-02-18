package provSpel;

public class NPC {
	

	private double weight;
	private String name;
	private Item item;
	private String description; 
	
	public NPC(String name, double weight, Item item, String description) {
	 
		this.name = name;
		this.weight = weight;
		this.item = item;
		this.description = description;
		

	}

	public NPC(String name, double weight,  String description) {
		 
		this.name = name;
		this.weight = weight;
		this.item = item;
		this.description = description;
		

	}
	
	
	
	public void describeYourself() {
		
		System.out.println(description);
		
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void doCommand(String kommand, Game world1) {

		
	
	
	}

}
	
	
	
	
	
	
	
	


