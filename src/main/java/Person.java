import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Person {
	private String email;
	private String name;
	private int id;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;

		try(Connection con = DB.sql2o.open()) {
			String sql = "INSERT INTO persons(name, email) VALUES (:name, :email)";
			con.createQuery(sql)
			.addParameter("name", this.name)
			.addParameter("email", this.email)
			.executeUpdate();
		}
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	//overriding equals
	@Override
 public boolean equals(Object otherPerson){
	 if (!(otherPerson instanceof Person)) {
		 return false;
	 } else {
		 Person newPerson = (Person) otherPerson;
		 return this.getName().equals(newPerson.getName()) &&
						this.getEmail().equals(newPerson.getEmail());
	 }
 }
 //saving to the db
 public void save() {
	 try(Connection con = DB.sql2o.open()) {
		 String sql = "INSERT INTO persons(name, email) VALUES (:name, :email)";
		 con.createQuery(sql)
		 .addParameter("name", this.name)
		 .addParameter("email", this.email)
		 .executeUpdate();
	 }
 }
 //retrieves all database entries
 public static List<Person> all() {
	 String sql = "SELECT * FROM persons";
	 try(Connection con = DB.sql2o.open()) {
		 return con.createQuery(sql).executeAndFetch(Person.class);
	 }
 }
}
