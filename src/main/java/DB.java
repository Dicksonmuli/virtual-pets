import org.sql2.*;

public class DB {
	public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets", "dickson", "dickson");
}
