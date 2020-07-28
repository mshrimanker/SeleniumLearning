package Pages;

public class LoginPage {

	String name;
	int size;
	String username;
	String password;
	
	public LoginPage(String name, int size, String username, String password) {
		super();
		this.name = name;
		this.size = size;
		this.username = username;
		this.password = password;
	}
	
	public void login(String username, String password) {
		System.out.println("Login to app...");
	}
}
