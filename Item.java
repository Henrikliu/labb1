package provSpel;

public class Item {

	private double weight;
	private String name;
	private int price;

	public Item(String name, double weight, int price) {

		this.name = name;
		this.weight = weight;
		this.price = price;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printYourself() {

		System.out.println(name + " (" + weight + " kg)");

	}

	public int getExtrahp() {
		return 0;
	}

	public void doCommand(String kommand, Game world1) {

		
	
	
	}

}