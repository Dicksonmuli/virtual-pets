import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	private Person testPerson;
	@Before
	public void instance() {
		testPerson = new Person("Henry", "[email protected]");
	}

	@test
	public void person_instantiatesCorrectly_true() {
		assertTrue(testPerson instanceof Person);
	}

	
}
