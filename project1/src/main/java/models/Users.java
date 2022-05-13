package models;


public class Users {

	//Setting fields to Private
	private int UserID;
	private String Username;
	private String Password;
	private Role Role;

	//Getter Method
	public int getID() {
		return UserID;
	}

	//Setter Method
	public void setUsername (String user) {
		Username = user;
	}
}