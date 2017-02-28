package model;

import java.util.ArrayList;
import java.util.Date;

public class User {
	// initializing variables
	private String name, gender, password, username;
	private int age;
	// ArrayList: list of all social activities of the user
	private ArrayList<SocialActivity> socialActivities = new ArrayList<SocialActivity>();
	
	// constructor for User
	public User(String name, String gender, String password, String username, int age) {
		
		this.name = name;
		this.gender = gender;
		this.password = password;
		this.username = username;
		this.age = age;
		
	}
	// method for creating a social activity, user input is asked in the application (main method)
	public void createSocialActivity(String name, Date timestamp, String category, String description, String location) {
		
		// creates a new social activity
		SocialActivity socialActivity = new SocialActivity(name, timestamp, category, description, this, location);
	
		// add the social activity to the ArrayList
		socialActivities.add(socialActivity);
	}
	
	// method for editing social activity
	public void editSocialActivity
	
	// TEST VOOR GITHUB
	// TEST VOOR GITHUB 2

}
