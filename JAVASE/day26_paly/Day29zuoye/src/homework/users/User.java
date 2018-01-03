package homework.users;

/**
 * Created by zyf on 2017/12/29.
 */
public class User {
	private String username;
	private String gender;
	private String password;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", gender='" + gender + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public User() {
	}

	public User(String username,String password) {

		this.username = username;
		this.gender = gender;
		this.password = password;
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}