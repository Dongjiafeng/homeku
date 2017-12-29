package Demo1;

public class Person {
	private String name;
	private String user;
	private String password;
	private String occupation;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public Person(String name, String user, String password, String occupation) {
		super();
		this.name = name;
		this.user = user;
		this.password = password;
		this.occupation = occupation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
