import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	private Person testPerson;
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
		assertEqual("Henry", testPerson.getName());
	}
	public void getEmail_personInstantiatesWithEmail_String() {
		assertEqual("[email protected]", testPerson.getEmail());
	}
}
