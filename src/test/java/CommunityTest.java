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
  //instanciates with name
  @Test
 public void getName_communityInstantiatesWithName_true() {
   Community testCommunity = new Community("Water Enthusiasts", "Lovers of all things water monsters!");
   assertEquals("Water Enthusiasts", testCommunity.getName());
 }
 //instanciates with a description
 @Test
 public void getDescription_communityInstantiatesWithDescription_String() {
   Community testCommunity = new Community("Water Enthusiasts", "Lovers of all things water monsters!");
   assertEquals("Lovers of all things water monsters!", testCommunity.getDescription());
 }
}
