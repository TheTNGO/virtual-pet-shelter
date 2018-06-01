package virtualpetshelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPetShelter currentShelter = new VirtualPetShelter();

		/* Pet Slots */

		VirtualPet pet1 = new VirtualPet("Roxanne", "Healthy, jolly, and ready to [Do Thing(s)]");
		VirtualPet pet2 = new VirtualPet("Maxamillion", "Seems easily spooked, but loves a good meal!");
		VirtualPet pet3 = new VirtualPet("Cutethulhu",
				"His whiskers remind you of tentacles...? Great personality, but certainly an old one.");
		VirtualPet pet4;
		VirtualPet pet5;

		/* Default entries into shelter */

		currentShelter.add(pet1);
		currentShelter.add(pet2);
		currentShelter.add(pet3);

		/* Intro */

		System.out.println("Welcome to your Virtual Pet Shelter!");

		while (true) {

			/* Stats Readout */

			System.out.println("Here are the pets you'll be taking care of today:\n");

			Collection<VirtualPet> pets = currentShelter.getShelterPetVariables();

			for (VirtualPet currentPet : pets) {
				System.out.println(currentPet.getName() + "\t\tNutrition: " + currentPet.getStatNutrition()
						+ "\t\t\tEnergy: " + currentPet.getStatEnergy() + "\t\t\tMood: " + currentPet.getStatMood());
			}

			System.out.println("\nYou have room for " + (5 - pets.size()) + " more pets");

			System.out.println("\nWhat would you like to do?\n");
			System.out.println("1. Feed all pets");
			System.out.println("2. Play with a pet");
			System.out.println("3. Put all pets to bed");
			System.out.println("4. Do nothing");
			System.out.println();
			System.out.println("5. Take a new pet into the shelter");
			System.out.println("6. Remove a pet from the shelter");
			System.out.println();
			System.out.println("7. Quit");
			String choice = input.nextLine();

			/* Input Results */

			// Invalid Option

			while (!(choice.equalsIgnoreCase("1")) && !(choice.equalsIgnoreCase("2")) && !(choice.equalsIgnoreCase("3"))
					&& !(choice.equalsIgnoreCase("4")) && !(choice.equalsIgnoreCase("5"))
					&& !(choice.equalsIgnoreCase("6")) && !(choice.equalsIgnoreCase("7"))) {
				System.out.println("\nThe pets seem to be confused.");
				System.out.println("Please enter a valid option.");
				choice = input.nextLine();
			}

			// Feed
			if (choice.equalsIgnoreCase("1")) {
				currentShelter.tick();
				currentShelter.inputFeedAll();
				System.out.println("\nThe pets happily munch on virtual food. Loudly. ");
				System.out.println("They're all virtually happy to eat!\n");

				// Play
			} else if (choice.equalsIgnoreCase("2")) {

				// Picking pet to play with
				System.out.println("Which pet do you want to play with? (Type its name)");
				String playingPet = input.nextLine();

				// Cycling through current pets to find the one to play with
				for (VirtualPet currentPet : pets) {
					if (currentPet.getName().equalsIgnoreCase(playingPet)) {
						currentShelter.tick();
						currentPet.inputPlay();
						System.out.println("\n" + currentPet.getName() + " chases his own tail as you mysteriously");
						System.out.println("find yourself pulling out a laser pointer and moving");
						System.out.println("it in circles, out of your own accord.\n");
					}
				}

				// Put to bed
			} else if (choice.equalsIgnoreCase("3")) {
				currentShelter.tick();
				currentShelter.inputSleepAll();
				System.out.println("\nLights out! All of the pets scuffle in full resting position.");
				System.out
						.println("They all wake up later, feeling refreshed, raucously reminding you to feed them.\n ");

				// Do nothing
			} else if (choice.equalsIgnoreCase("4")) {
				currentShelter.tick();
				System.out.println("\nYour pets seem to be making more and more noise,");
				System.out.println("reminding you to do your job.\n");

				// Take in a pet

				// Shelter is Full

			} else if (choice.equalsIgnoreCase("5")) {
				currentShelter.tick();
				System.out.println("\nLook at you, being proactive!");
				if (pets.size() >= 5) {
					System.out.println("We like the enthusiasm, but we're out of room!\n");

					// Shelter has room

				} else {
					System.out.println(
							"You step outside for no more than a few nanoseconds, only to find a stray dog on the doorstep.\n");

					// New Pet Config
					System.out.println("What's its new name?");
					String newPetName = input.nextLine();
					System.out.println("What's it like? (Add a description)");
					String newPetDescription = input.nextLine();

					if (pets.size() == 0) {
						pet1 = new VirtualPet(newPetName, newPetDescription);
						currentShelter.add(pet1);
					} else if (pets.size() == 1) {
						pet2 = new VirtualPet(newPetName, newPetDescription);
						currentShelter.add(pet2);
					} else if (pets.size() == 2) {
						pet3 = new VirtualPet(newPetName, newPetDescription);
						currentShelter.add(pet3);
					} else if (pets.size() == 3) {
						pet4 = new VirtualPet(newPetName, newPetDescription);
						currentShelter.add(pet4);
					} else if (pets.size() == 4) {
						pet5 = new VirtualPet(newPetName, newPetDescription);
						currentShelter.add(pet5);
					}

					System.out.println("\nLooks like " + newPetName + " is ready to make some new friends!\n");
				}

				
			// Release Pet	
			} else if (choice.equalsIgnoreCase("6")) {
				
				System.out.println("Which pet do you want to release? (Type its name)");
				String releasingPet = input.nextLine();

				// Cycling through current pets to find the one to release (with happy ending)
				for (VirtualPet activePet : pets) {
					if (activePet.getName().equalsIgnoreCase(releasingPet)) {
						currentShelter.tick();
						System.out.println("\nAs you stop to take a look at " + activePet.getName() + ", a happy family walks in and decides to adopt it on the spot!");
						System.out.println("You're glad to see it go. He was getting on your nerves anyway. *sniff*\n");
						currentShelter.removePet(activePet);
					}
				}
			
			// Quit
			} else if (choice.equalsIgnoreCase("7")) {
				System.out.println("\nTime to clock out! Nice treats from your relief await!");
				input.close();
				System.exit(0);
			}

			continue;

		}

	}

}