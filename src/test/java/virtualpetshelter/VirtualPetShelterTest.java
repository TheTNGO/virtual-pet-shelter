package virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

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

		VirtualPet retrievedPet1 = underTest.findPet("Cage 01");
		VirtualPet retrievedPet2 = underTest.findPet("Cage 02");
		Collection<VirtualPet> petNames = underTest.getShelterPetVariables();
		assertThat(petNames, containsInAnyOrder(testPet1, testPet2));
	}

	@Test
	public void shouldBeAbleToRemovePets() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		VirtualPet retrievedPet1 = underTest.findPet("Cage 01");
		VirtualPet retrievedPet2 = underTest.findPet("Cage 02");
		underTest.remove(testPet2);

		Collection<VirtualPet> containedPets = underTest.getShelterPetVariables();
		assertThat(containedPets, containsInAnyOrder(testPet1));
	}

	@Test
	public void shouldReturnCollectionOfPets() {
		underTest.add(testPet1);
		underTest.add(testPet2);
		VirtualPet retrievedPet1 = underTest.findPet("Cage 01");
		VirtualPet retrievedPet2 = underTest.findPet("Cage 02");

		Collection<String> containedPets = underTest.getPetNames();
		assertThat(containedPets, containsInAnyOrder("Test1", "Test2"));
	}
	
	@public void shouldBeAbleToFeedAllPets() {
		
	}

}
