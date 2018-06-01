package virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter underTest;
	VirtualPet testPet1;
	VirtualPet testPet2;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		testPet1 = new VirtualPet("Test1", "Test pet");
		testPet2 = new VirtualPet("Test2", "Test pet");

	}

	@Test
	public void shouldBeAbleToAddOnePetToShelter() {
		underTest.add(testPet1);
		VirtualPet retrievedPet = underTest.findPet("Cage 01");
		assertThat(retrievedPet, is(testPet1));

	}

	@Test
	public void shouldBeAbleToAddTwoPetsToShelter() {
		underTest.add(testPet1);
		underTest.add(testPet2);

		Collection<VirtualPet> petNames = underTest.getShelterPetVariables();
		assertThat(petNames, containsInAnyOrder(testPet1, testPet2));
	}

	@Test
	public void shouldBeAbleToRemovePets() {
		underTest.add(testPet1);
		underTest.add(testPet2);

		underTest.removePet(testPet2);

		Collection<VirtualPet> containedPets = underTest.getShelterPetVariables();
		assertThat(containedPets, containsInAnyOrder(testPet1));
	}
	


	@Test
	public void shouldReturnCollectionOfPets() {
		underTest.add(testPet1);
		underTest.add(testPet2);


		Collection<String> containedPets = underTest.getPetNames();
		assertThat(containedPets, containsInAnyOrder("Test1", "Test2"));
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		underTest.inputFeedAll();

		
		// Intended order of stats: Nutrition, Energy, Mood
		// Refactor later by possibly making HashMap for VirtualPet Class
		
		Collection<Integer> stats1 = new ArrayList<>();
		Collection<Integer> stats2 = new ArrayList<>();

		stats1.add(testPet1.getStatNutrition());
		stats1.add(testPet1.getStatMood());
		stats1.add(testPet1.getStatEnergy());
		stats2.add(testPet2.getStatNutrition());
		stats2.add(testPet2.getStatMood());
		stats2.add(testPet2.getStatEnergy());
		
		//Based on Starting amount 10 on all pets:
		
		assertThat(stats1, contains(15, 15, 15));
		assertThat(stats2, contains(15, 15, 15));

	}
	
	@Test
	public void shouldBePutAllPetsToBed() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		underTest.inputSleepAll();

		
		// Intended order of stats: Nutrition, Energy, Mood
		// Refactor later by possibly making HashMap for VirtualPet Class
		
		Collection<Integer> stats1 = new ArrayList<>();
		Collection<Integer> stats2 = new ArrayList<>();

		stats1.add(testPet1.getStatNutrition());
		stats1.add(testPet1.getStatMood());
		stats1.add(testPet1.getStatEnergy());
		stats2.add(testPet2.getStatNutrition());
		stats2.add(testPet2.getStatMood());
		stats2.add(testPet2.getStatEnergy());
		
		//Based on Starting amount 10 on all pets:

		assertThat(stats1, contains(6, 15, 15));
		assertThat(stats2, contains(6, 15, 15));

	}
	
	@Test
	public void shouldPlayWithOnlyTestPet1() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		
		underTest.inputPlayWithOne(testPet1);
		
		
		// Intended order of stats: Nutrition, Energy, Mood
		// Refactor later by possibly making HashMap for VirtualPet Class
		
		Collection<Integer> stats1 = new ArrayList<>();
		Collection<Integer> stats2 = new ArrayList<>();

		stats1.add(testPet1.getStatNutrition());
		stats1.add(testPet1.getStatMood());
		stats1.add(testPet1.getStatEnergy());
		stats2.add(testPet2.getStatNutrition());
		stats2.add(testPet2.getStatMood());
		stats2.add(testPet2.getStatEnergy());
		
		//Based on Starting amount 10 on all pets:

		assertThat(stats1, contains(6, 15, 6));
		assertThat(stats2, contains(10, 10 ,10 ));

	}
	
	@Test
	public void shouldPlayWithOnlyTestPet2() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		
		underTest.inputPlayWithOne(testPet2);

		// Intended order of stats: Nutrition, Energy, Mood
		// Refactor later by possibly making HashMap for VirtualPet Class
		
		Collection<Integer> stats1 = new ArrayList<>();
		Collection<Integer> stats2 = new ArrayList<>();

		stats1.add(testPet1.getStatNutrition());
		stats1.add(testPet1.getStatMood());
		stats1.add(testPet1.getStatEnergy());
		stats2.add(testPet2.getStatNutrition());
		stats2.add(testPet2.getStatMood());
		stats2.add(testPet2.getStatEnergy());
		
		//Based on Starting amount 10 on all pets:

		assertThat(stats1, contains(10, 10, 10));
		assertThat(stats2, contains(6, 15, 6));

	}
	
	@Test
	public void shelterTickDegradesAllPetsStats() {
		
		underTest.add(testPet1);
		underTest.add(testPet2);
		
		underTest.tick();

		// Intended order of stats: Nutrition, Energy, Mood
		// Refactor later by possibly making HashMap for VirtualPet Class
		
		Collection<Integer> stats1 = new ArrayList<>();
		Collection<Integer> stats2 = new ArrayList<>();

		stats1.add(testPet1.getStatNutrition());
		stats1.add(testPet1.getStatMood());
		stats1.add(testPet1.getStatEnergy());
		stats2.add(testPet2.getStatNutrition());
		stats2.add(testPet2.getStatMood());
		stats2.add(testPet2.getStatEnergy());
		
		//Based on Starting amount 10 on all pets:

		assertThat(stats1, contains(9, 7, 9));
		assertThat(stats2, contains(9, 7, 9));

		
	}



}


