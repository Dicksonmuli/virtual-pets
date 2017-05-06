import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	private Person testPerson;

	@Rule
	public DatabaseRule database = new DatabaseRule();

	@Before
	public void instance() {
		testPerson = new Person("Henry", "[email protected]");
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
		testPerson.save();
		assertTrue(Person.all().get(0).equals(testPerson));
	}
	//returning a
}
