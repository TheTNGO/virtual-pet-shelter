VirtualPetShelter Class

	(DONE) * HashMap for pets at shelter
	(DONE) * return collection of pets
	(DONE) * add pet to shelter
	(DONE) * remove pet from shelter
	(DONE) * feed ALL pets in shelter
	(DONE) // Replaced with Sleep // water ALL pets in shelter
	(DONE) * play with an individual pet
	(DONE) * tick that ticks ALL pets

VirtualPet Class (Changes)
	(DONE) * add description to constructor
	
VirtualPetApp
	
	(DONE) * tick
	(DONE) * feed all pets
	(DONE) * sleep all pets
	(DONE) * play with one pet
	(DONE) * take in a pet
		* ask for name
		* ask for description
	* remove a pet

	Set <VirtualPet> pets = shelter.entrySet();
		Set<String> petKeys = shelter.keySet();
		for (String elements : petKeys) {
			shelter.remove(elements);
			}

	Iterator<String> iterator = shelter.values()().iterator(); 
		while(iterator.hasNext()){ String certification = iterator.next(); 
		if(certification.contains("OCMJEA")){ 
			iterator.remove(); 
		}


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

		* Put in list as key





