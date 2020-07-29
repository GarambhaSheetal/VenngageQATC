package objects;

public class Account {
	
	String firstname;
	String lastname; 
	String email;
	String password;
	
	/**
	* Create the constructor that takes the following:
	* First name
	* Last name
	* Email
	* Password
	**/
	
	
	public Account(String firstname,String lastname, String email, String password)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		
		
	}
	
	// Create the necessary Getter functions
	

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	
	public String getPassword() {
		return password;
	}

	
	
	
}