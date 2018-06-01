package virtualpetshelter;

public class VirtualPetShelterApp {
	
	public static void main (String[] args) {
		
		System.out.println("eh");
		VirtualPetShelter currentShelter = new VirtualPetShelter();
		VirtualPet test = new VirtualPet("Test", "test");

		currentShelter.add(test);
		
		System.out.println(currentShelter.returnShelters());
		
		
	}
	
	
}