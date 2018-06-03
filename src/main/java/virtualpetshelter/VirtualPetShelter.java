package virtualpetshelter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	List<VirtualPet> shelter = new ArrayList<>();

	public void addPet(VirtualPet pet) {

		shelter.add(pet);

	}

	public void removePet(VirtualPet petToBeRemoved) {
		List<VirtualPet> toRemove = new ArrayList<>();
		for (VirtualPet elements : shelter) {
			if (petToBeRemoved == elements) {
				toRemove.add(elements);
			}
		}
		
		shelter.removeAll(toRemove);
	}

	public Collection<String> getPetNames() {
		List<String> petNames = new ArrayList<>();
		for (VirtualPet elements : shelter) {
			petNames.add(elements.getName());
		}
		return petNames;

	}

	public void inputFeedAll() {
		for (VirtualPet elems : shelter) {
			elems.inputFeed();
		}
	}

	public void inputSleepAll() {

		for (VirtualPet elems : shelter) {
			elems.inputSleep();

		}
	}

	public void inputPlayWithOne(VirtualPet petToPlay) {
		
		for (VirtualPet elems : shelter) {
			if (petToPlay == elems) {
				elems.inputPlay();
			}
		}
	}

	public void tick() {
		for (VirtualPet elems : shelter) {
			elems.tick();
		}
	}

	public Collection<VirtualPet> getShelterPetVariables() {
		return shelter;
	}
}
