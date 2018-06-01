package virtualpetshelter;

public class VirtualPet {

	/* Pet Stats */

	private String name;
	private String description;
	private int statNutrition;
	private int statMood;
	private int statEnergy;
	private String cageNumber;

	/* Constructor */

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.statNutrition = 10;
		this.statMood = 10;
		this.statEnergy = 10;
	}

	/* Get/Set Methods */

	// Name

	public String getName() {
		return this.name;
	}

	// Description
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// Cage Number
	public void setCageNumber(String cageNumber) {
		this.cageNumber = cageNumber;
	}

	public String getCageNumber() {
		return this.cageNumber;
	}


	// Nutrition

	public int getStatNutrition() {
		return statNutrition;
	}

	public void setStatNutrition(int amount) {
		this.statNutrition = amount;
	}

	public void subtractStatNutrition(int amount) {
		if (this.statNutrition < amount) {
			this.statNutrition -= this.statNutrition;
		} else {
			this.statNutrition -= amount;
		}
	}

	public void addStatNutrition(int amount) {
		this.statNutrition += amount;
		if (this.statNutrition > 15) {
			this.statNutrition = 15;
		}
	}

	// Mood

	public int getStatMood() {
		return statMood;
	}

	public void setStatMood(int amount) {
		this.statMood = amount;
	}

	public void subtractStatMood(int amount) {
		if (this.statMood < amount) {
			this.statMood -= this.statMood;
		} else {
			this.statMood -= amount;
		}
	}

	public void addStatMood(int amount) {
		this.statMood += amount;
		if (this.statMood > 15) {
			this.statMood = 15;
		}
	}

	// Energy

	public int getStatEnergy() {
		return statEnergy;
	}

	public void setStatEnergy(int amount) {
		this.statEnergy = amount;
	}

	public void subtractStatEnergy(int amount) {
		if (this.statEnergy < amount) {
			this.statEnergy -= this.statEnergy;
		} else {
			this.statEnergy -= amount;
		}
	}

	public void addStatEnergy(int amount) {
		this.statEnergy += amount;
		if (this.statEnergy > 15) {
			this.statEnergy = 15;
		}
	}

	/* Behavior Methods */

	public void inputFeed() {
		this.addStatNutrition(6);
		this.addStatMood(9);
		this.addStatEnergy(6);
	}

	public void inputPlay() {
		this.subtractStatNutrition(4);
		this.addStatMood(9);
		this.subtractStatEnergy(4);
	}

	public void inputSleep() {
		this.subtractStatNutrition(4);
		this.addStatEnergy(6);
		this.addStatMood(9);
	}

	/* On Tick */

	public void tick() {
		this.subtractStatNutrition(1);
		this.subtractStatMood(3);
		this.subtractStatEnergy(1);
	}

}
