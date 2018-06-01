package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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

	public void removePet(VirtualPet petToBeRemoved) {
		Collection<VirtualPet> pets = shelter.values();
		Set<String> petKeys = shelter.keySet();
		for (String elements : petKeys) {
			for (VirtualPet activePet : pets) {
				activePet = petToBeRemoved;
				if (shelter.get(elements) == petToBeRemoved) {
					shelter.remove(elements);
				}
			}
		}
	}

	public Collection<String> getPetNames() {
		Collection<VirtualPet> pets = shelter.values();
		List<String> petNames = new ArrayList<>();
		for (VirtualPet elements : pets) {
			petNames.add(elements.getName());
		}
		return petNames;

	}

	public void inputFeedAll() {
		Collection<VirtualPet> pets = shelter.values();
		for (VirtualPet elems : pets) {
			elems.inputFeed();
		}
	}

	public void inputSleepAll() {
		Collection<VirtualPet> pets = shelter.values();
		for (VirtualPet elems : pets) {
			elems.inputSleep();

		}
	}

	public void inputPlayWithOne(VirtualPet petToPlay) {
		Collection<VirtualPet> pets = shelter.values();
		for (VirtualPet elems : pets) {
			if (petToPlay == elems) {
				elems.inputPlay();
			}
		}
	}

	public void tick() {
		Collection<VirtualPet> pets = shelter.values();
		for (VirtualPet elems : pets) {
			elems.tick();
		}
	}
}
