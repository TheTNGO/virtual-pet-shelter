package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<>();

	public void add(VirtualPet pet) {

		// Assigning Cage Number

		String cageNumberBeingAssigned;
		if (shelter.size() < 10) {
			cageNumberBeingAssigned = "Cage 0" + (shelter.size() + 1);
		} else {
			cageNumberBeingAssigned = "Cage " + (shelter.size() + 1);
		}

		// Adding pet to shelter

		pet.setCageNumber(cageNumberBeingAssigned);
		shelter.put(pet.getCageNumber(), pet);

	}

	public VirtualPet findPet(String cageNumber) {
		return shelter.get(cageNumber);
	}

	public Set returnShelters() {
		return this.shelter.entrySet();
	}

	public Collection<VirtualPet> getShelterPetVariables() {
		return shelter.values();
	}

	public void remove(VirtualPet petToBeRemoved) {
		Set<String> cages = shelter.keySet();
		for(String elements: cages) {
			if(petToBeRemoved == shelter.get(elements)) {
				shelter.remove(elements);
			}
		}
	}

	public Collection<String> getPetNames() {
		Collection<VirtualPet> pets = shelter.values();
		List<String> petNames = new ArrayList<>();
		for(VirtualPet elements : pets ) {
			petNames.add(elements.getName());
		}
		return petNames;
		
	}

}
