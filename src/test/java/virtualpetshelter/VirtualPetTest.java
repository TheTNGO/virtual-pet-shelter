package virtualpetshelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualpetshelter.VirtualPet;

public class VirtualPetTest {

	// Stat Tests

	@Test
	public void constructorShouldSetName() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		String name = underTest.getName();
		assertEquals("Test", name);
	}

	@Test
	public void constructorDefualtNutritionShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		int hunger = underTest.getStatNutrition();
		assertEquals(10, hunger);
	}

	@Test
	public void constructorDefualtEnergyShouldBe10() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		int energy = underTest.getStatNutrition();
		assertEquals(10, energy);
	}

	@Test

	// copying and pasting code from get/set section for each stat
	public void addStatAdditionShouldNotExceedMax() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.addStatNutrition(17);
		int nutrition = underTest.getStatNutrition();
		assertEquals(15, nutrition);
	}

	/* Behavior Method Tests */

	@Test
	public void inputFeedShouldAddNutrition() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.inputFeed();
		int nutrition = underTest.getStatNutrition();
		assertEquals(15, nutrition);
	}

	@Test
	public void inputFeedShouldAddMood() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.inputFeed();
		int mood = underTest.getStatMood();
		assertEquals(15, mood);
	}

	@Test
	public void inputFeedShouldAddNutritionAndNoMoreThanMax() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.setStatNutrition(15);
		underTest.inputFeed();
		int nutrition = underTest.getStatNutrition();
		assertEquals(15, nutrition);
	}

	@Test
	public void statMoodShouldNotGoPast15() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.setStatMood(15);
		underTest.addStatMood(16);
		int mood = underTest.getStatMood();
		assertEquals(15, mood);
	}

	@Test
	public void statEnergyShouldNotGoPast15() {
		VirtualPet underTest = new VirtualPet("Test", "Test Pet");
		underTest.setStatEnergy(15);
		underTest.addStatEnergy(16);
		int energy = underTest.getStatEnergy();
		assertEquals(15, energy);
	}


}
