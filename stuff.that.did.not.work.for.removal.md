			// Release Pet
			else if (choice.equalsIgnoreCase("6")) {

				System.out.println("Which pet do you want to release? (Type its name)");
//				String releasingPet = input.nextLine();

				// Cycling through current pets to find the one to release (with happy ending)
				for (VirtualPet activePet : pets) {
					if (pet1.getName().equalsIgnoreCase(activePet.getName())) {
						currentShelter.tick();
						System.out.println("\nAs you stop to take a look at " + activePet.getName()
								+ ", a happy family walks in and decides to adopt it on the spot!");
						System.out.println("You're glad to see it go. He was getting on your nerves anyway. *sniff*\n");
						pets.remove(pet1);
					}
				}
			}

			// Release Pet Mk.2
			currentShelter.tick();
						System.out.println("\nAs you stop to take a look at " + activePet.getName()
								+ ", a happy family walks in and decides to adopt it on the spot!");
						System.out.println("You're glad to see it go. He was getting on your nerves anyway. *sniff*\n");
						pets.remove(pet1);

								}if(activePet2.getName().equalsIgnoreCase(pet4.getName())) {
								currentShelter.removePet(pet4);
							}if(activePet2.getName().equalsIgnoreCase(pet5.getName())) {
								currentShelter.removePet(pet5);