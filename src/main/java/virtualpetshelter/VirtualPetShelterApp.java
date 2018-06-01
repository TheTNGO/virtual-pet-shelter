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
		System.out.println("Here are the pets you'll be taking care of today:\n");

		while (true) {

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
			System.out.println("5. Quit");
			String choice = input.nextLine();

			/* Input Results */

			// Invalid Option

			while (!(choice.equalsIgnoreCase("1")) && !(choice.equalsIgnoreCase("2")) && !(choice.equalsIgnoreCase("3"))
					&& !(choice.equalsIgnoreCase("4")) && !(choice.equalsIgnoreCase("5"))) {
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
				System.out.println("Which pet do you want to play with? (Type its name)");
				String playingPet = input.nextLine();
				
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

			// Quit
			} else if (choice.equalsIgnoreCase("5")) {
				System.out.println("\nTime to clock out! Nice treats from your relief await!");
				input.close();
				System.exit(0);
			}

			continue;

		}

	}

}