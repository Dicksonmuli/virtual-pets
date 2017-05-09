public class Community {
  private String name;
  private String description;
  private int id;


  public Community(String name, String description){
		this.name = name;
		this.description = description;
}

//returns name
public String getName() {
	return name;
}
public String getDescription() {
	return description;
}
}
