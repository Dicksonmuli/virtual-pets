import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	private Person testPerson;
	private Person secondPerson;

	@Rule
	public DatabaseRule database = new DatabaseRule();

	@Before
	public void instance() {
		testPerson = new Person("Henry", "[email protected]");
		secondPerson = new Person("Harriet", "harriet@harriet.com");
	}

	@Test
	public void person_instantiatesCorrectly_true() {
		assertTrue(testPerson instanceof Person);
	}
	@Test
	public void getName_personInstantiatesWithName_Henry() {
		assertEquals("Henry", testPerson.getName());
	}
	public void getEmail_personInstantiatesWithEmail_String() {
		assertEquals("[email protected]", testPerson.getEmail());
	}
	@Test public void equals_returnsTrueIfNameAndEmailAreSame_true() {
		Person firstPerson = new Person("Henry", "[email protected]");
		Person anotherPerson = new Person("Henry", "[email protected]");
		assertTrue(firstPerson.equals(anotherPerson));
	}
	//saving to the db
	@Test
	public void save_insertsObjectIntoDatabase_Person() {
		assertTrue(Person.all().get(0).equals(testPerson));
	}
	//returning all database entries
	@Test
	public void all_returnsAllInstancesOfPerson_true() {
		assertTrue(Person.all().get(0).equals(testPerson));
		assertTrue(Person.all().get(1).equals(secondPerson));
	}
	@Test
	public void save_assignsIdToObject() {
		Person myPerson = new Person ("Henry", "henry@henry.com");
		myPerson.save();
		Person savedPerson = Person.all().get(0);
		assertEquals(testPerson.getId(), savedPerson.getId());
	}
}
