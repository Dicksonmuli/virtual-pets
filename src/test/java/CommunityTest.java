import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class CommunityTest {

  @Rule
  public DatabaseRule database = new DatabaseRule();

	@Test
  public void community_instantiatesCorrectly_true() {
    Community testCommunity = new Community("Water Enthusiasts", "Lovers of all things water monsters!");
    assertEquals(true, testCommunity instanceof Community);
  }

}
